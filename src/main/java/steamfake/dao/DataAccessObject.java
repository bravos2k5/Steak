package dao;

import java.util.List;

public interface DataAccessObject<T> {

    int insert(T object);
    int update(T object);
    int delete(T object);

    T selectByID(T object);
    List<T> selectAll();
    List<T> selectBySQL(String sql, Object...args);

}
