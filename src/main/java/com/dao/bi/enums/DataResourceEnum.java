package com.dao.bi.enums;

import com.dao.bi.handler.ApplicationHandler;
import com.dao.bi.handler.ExcelApplicationHandler;
import com.dao.bi.handler.MysqlApplicationHandler;

/**
 * @author: sucf
 * @date: 2024/7/18 13:77
 * @description:
 */
public enum DataResourceEnum {

    /**
     * mysql
     */
    MYSQL("mysql", new MysqlApplicationHandler()),

    /**
     * excel
     */
    EXCEL("excel", new ExcelApplicationHandler()),
    ;

    private String type;

    private ApplicationHandler applicationHandler;

    DataResourceEnum(String type, ApplicationHandler applicationHandler) {
    }
}
