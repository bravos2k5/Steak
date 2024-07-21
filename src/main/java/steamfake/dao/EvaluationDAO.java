package steamfake.dao;

import steamfake.model.join.Evaluation;
import steamfake.utils.database.XJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EvaluationDAO implements DataAccessObject<Evaluation> {

    private static EvaluationDAO instance;

    public static EvaluationDAO gI() {
        if (instance == null) {
            instance = new EvaluationDAO();
        }
        return instance;
    }

    private EvaluationDAO() {
    }

    @Override
    public int insert(Evaluation object) {
        String sql = "{CALL SP_EVALUATE(?,?,?,?}";
        return XJdbc.update(sql, object.getGameID(), object.getAccountID(), object.getRate(), object.getComment());
    }

    @Override
    public int update(Evaluation object) {
        return insert(object);
    }

    @Override
    public int delete(Evaluation object) {
        String sql = "{CALL SP_DELETE_EVALUATION(?,?)}";
        return XJdbc.update(sql, object.getGameID(), object.getAccountID());
    }

    @Override
    public Evaluation selectByID(Evaluation object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Evaluation> selectAll() {
        throw new UnsupportedOperationException();
    }

    public List<Evaluation> selectByGameID(String gameID) {
        String sql = "{CALL SP_GET_EVALUATION(?)}";
        return selectBySQL(sql, gameID);
    }

    @Override
    public List<Evaluation> selectBySQL(String sql, Object... args) {
        List<Evaluation> evaluationList = new ArrayList<>();
        try(ResultSet rs = XJdbc.getResultSet(sql, args)) {
            while (rs.next()) {
                Evaluation evaluation = new Evaluation();
                evaluation.setAccountID(UUID.fromString(rs.getString("account_id")));
                evaluation.setGameID(UUID.fromString(rs.getString("game_id")));
                evaluation.setName(rs.getString("ho_ten"));
                evaluation.setAvatar(rs.getString("avatar"));
                evaluation.setRate(rs.getInt("rate"));
                evaluation.setComment(rs.getString("comment"));
                evaluationList.add(evaluation);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return evaluationList;
    }

}
