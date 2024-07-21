package com.dao.bi.handler;

import java.util.List;

/**
 * @author: sucf
 * @date: 2024/7/18 16:29
 * @description: 数据资源执行器
 */
public interface DataSourceExecutor {

    /**
     * 迁移数据
     */
    void migrate();

    /**
     * 测试连接
     *
     * @return
     */
    boolean connectTest();

    /**
     * 查询数据
     *
     * @param sql
     * @return
     */
    List<Object> select(String sql);
}
