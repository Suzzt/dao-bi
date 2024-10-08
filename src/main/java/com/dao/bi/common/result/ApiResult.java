package com.dao.bi.common.result;

import com.dao.bi.common.enums.ApiCodeEnum;

/**
 * @author: sucf
 * @create: 2024-07-20 16:11:23
 * @description: 返回结果集统一约定
 */
public class ApiResult<T> {

    /**
     * 本次请求的成功标志
     */
    private boolean success = false;
    /**
     * 请求失败结果message
     */
    private String message;

    /**
     * 请求状态码,定义好规范(5位数),不报错就返回:00000
     * 简述：
     * A+4位数  A表示错误来源用户端,参数错误
     * B+4位数  B表示错误当前系统,比如NPE
     * C+4位数  C表示错误第三放调用,比如ace调用错误
     * //...拓展
     * 备注:各大类步长间距留100
     */
    private String code;

    /**
     * 返回数据
     */
    private T data;

    public ApiResult() {
    }

    public static <T> ApiResult<T> success(T data) {
        ApiResult<T> result = new ApiResult();
        result.setCode(ApiCodeEnum.SUCCESS.getCode());
        result.setMessage(ApiCodeEnum.SUCCESS.getText());
        result.setData(data);
        result.setSuccess(true);
        return result;
    }

    public static <T> ApiResult<T> success() {
        ApiResult<T> result = new ApiResult();
        result.setCode(ApiCodeEnum.SUCCESS.getCode());
        result.setMessage(ApiCodeEnum.SUCCESS.getText());
        result.setSuccess(true);
        return result;
    }

    public static <T> ApiResult<T> fail(String code, String errorMessage) {
        ApiResult<T> result = new ApiResult();
        result.setCode(code);
        result.setMessage(errorMessage);
        result.setSuccess(false);
        return result;
    }

    public static <T> ApiResult<T> fail(ApiCodeEnum apiCodeEnum) {
        ApiResult<T> result = new ApiResult();
        result.setCode(apiCodeEnum.getCode());
        result.setMessage(apiCodeEnum.getText());
        result.setSuccess(false);
        return result;
    }

    public static <T> ApiResult<T> fail() {
        ApiResult<T> result = new ApiResult();
        result.setCode(ApiCodeEnum.SYSTEM_ERROR.getCode());
        result.setMessage(ApiCodeEnum.SYSTEM_ERROR.getText());
        result.setSuccess(false);
        return result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
