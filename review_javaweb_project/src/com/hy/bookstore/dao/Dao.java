package com.hy.bookstore.dao;

import java.util.List;

/**
 * Created by sumimasah on 2017/8/5.
 */
public interface Dao<T> {

    long insert(String sql, Object... args);

    void update(String sql, Object... args);

    T query(String sql, Object... args);

    List<T> queryForList(String sql, Object... args);

    <V> V getSingleVal(String sql, Object... args);

    void batch(String sql, Object[]... args);

}
