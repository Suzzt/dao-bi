package com.dao.bi.controller;

import com.dao.bi.common.result.ApiResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: sucf
 * @date: 2024/7/19 23:37
 * @description:
 */
@RestController
@RequestMapping("/data_source")
public class DataSourceController {
    @RequestMapping("get_type")
    public ApiResult getDataSourceType(){
        return ApiResult.success();
    }
}
