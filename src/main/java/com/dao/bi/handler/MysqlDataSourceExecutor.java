package com.dao.bi.handler;


import java.util.List;

/**
 * @author: sucf
 * @date: 2024/7/18 16:34
 * @description: mysql
 */
public class MysqlDataSourceExecutor implements DataSourceExecutor {
    @Override
    public void migrate() {
    }

    @Override
    public boolean connectTest() {
        return false;
    }

    @Override
    public List<Object> select(String sql) {
        return null;
    }
}
