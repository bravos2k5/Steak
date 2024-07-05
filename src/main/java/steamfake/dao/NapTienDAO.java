package steamfake.dao;

import steamfake.model.NapCK;
import steamfake.model.NapCard;
import steamfake.model.NapTien;
import steamfake.utils.database.XJdbc;

import java.util.List;

public class NapTienDAO implements DataAccessObject<NapTien> {

    @Override
    public int insert(NapTien object) {
        String sql = "INSERT INTO PHIEU_NAP VALUES(?,?,?,?,?)";
        if(XJdbc.update(sql,
                object.getId(),
                object.getAccountID(),
                object.getMethod(),
                object.getNgayNap(),
                object.getStatus()) > 0) {
            if(object instanceof NapCard) {
                NapCard napCard = (NapCard) object;
                sql = "INSERT ";
            }
            if(object instanceof NapCK) {

            }
        }
        return 0;
    }

    /**
     * Chỉ cập nhật trạng thái
     * @param object napcard or napck
     * @return result
     */
    @Override
    public int update(NapTien object) {
        return 0;
    }

    @Override
    public int delete(NapTien object) {
        return 0;
    }

    @Override
    public NapTien selectByID(NapTien object) {
        return null;
    }

    @Override
    public List<NapTien> selectAll() {
        return List.of();
    }

    @Override
    public List<NapTien> selectBySQL(String sql, Object... args) {
        return List.of();
    }

}
