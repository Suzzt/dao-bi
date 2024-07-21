package com.dao.bi.manager;

import com.dao.bi.handler.DataSourceExecutor;

import java.util.Map;

/**
 * @author: sucf
 * @date: 2024/7/21 23:08
 * @description:
 */
public class DataSourceManager {

    private final Map<String, DataSourceExecutor> executors;

    public DataSourceManager(Map<String, DataSourceExecutor> executors) {
        this.executors = executors;
    }

    public DataSourceExecutor getExecutor(String type) {
        return null;
    }
}
