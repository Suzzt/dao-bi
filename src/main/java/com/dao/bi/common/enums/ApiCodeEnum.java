package com.dao.bi.common.enums;

/**
 * @author: sucf
 * @create: 2024-07-20 12:09
 * @description: result返回值code对照码
 */
public enum ApiCodeEnum {

    /**
     * 请求成功
     */
    SUCCESS("00000", "请求成功"),

    // A级别 前端用户端错误
    /**
     * 参数错误,A一级宏观错误
     */
    PARAMETER_ERROR("A0001", "参数错误"),

    // B级别 系统错误,NPE
    /**
     * 系统内部报错,B一级宏观错误
     * 后端确定不了的，选这个
     */
    SYSTEM_ERROR("B0001", "系统内部错误"),

    ;
    private String code;

    private String text;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    ApiCodeEnum(String code, String text) {
        this.code = code;
        this.text = text;
    }
}
