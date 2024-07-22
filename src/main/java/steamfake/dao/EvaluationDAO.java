package steamfake.dao;

import steamfake.model.join.Evaluation;
import steamfake.utils.database.XJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EvaluationDAO {

    private static EvaluationDAO instance;

    public static EvaluationDAO gI() {
        if (instance == null) {
            instance = new EvaluationDAO();
        }
        return instance;
    }

    private EvaluationDAO() {
    }

    public int insert(Evaluation object) {
        String sql = "{CALL SP_EVALUATE(?,?,?,?)}";
        return XJdbc.update(sql, object.getGameID(), object.getAccountID(), object.getRate(), object.getComment());
    }

    public int update(Evaluation object) {
        return insert(object);
    }

    public int delete(Evaluation object) {
        String sql = "{CALL SP_DELETE_EVALUATION(?,?)}";
        return XJdbc.update(sql, object.getGameID(), object.getAccountID());
    }

    public List<Evaluation> selectByGameID(UUID gameID) {
        String sql = "{CALL SP_GET_EVALUATION(?)}";
        List<Evaluation> evaluationList = new ArrayList<>();
        try(ResultSet rs = XJdbc.getResultSet(sql,gameID)) {
            while (rs.next()) {
                Evaluation evaluation = new Evaluation();
                evaluation.setAccountID(UUID.fromString(rs.getString("account_id")));
                evaluation.setGameID(gameID);
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
