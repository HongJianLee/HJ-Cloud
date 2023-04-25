package org.hj.common.core.constant;


import org.hj.common.core.enums.ResultCode;

import java.io.Serializable;

/**
 * <p>
 * 统一API对象返回
 * </p>
 *
 * @author hj
 */
public class R<T> implements Serializable {

    private static final long serialVersionUID = -5023813389754699854L;
    /**
     * 状态码
     */
    private Integer code;

    /**
     * 返回消息
     */
    private String message;

    /**
     * 状态
     */
    private boolean status;

    /**
     * 返回数据
     */
    private T data;

    public R(Integer code, String message, boolean status, T data) {
        this.code = code;
        this.message = message;
        this.status = status;
        this.data = data;
    }

    public R(IResultCode resultCode, boolean status, T data) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.status = status;
        this.data = data;
    }

    public R(IResultCode resultCode, boolean status) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.status = status;
        this.data = null;
    }

    public static <T> R success() {
        return new R<>(ResultCode.OK, true);
    }

    public static <T> R message(String message) {
        return new R<>(ResultCode.OK.getCode(), message, true, null);
    }

    public static <T> R success(T data) {
        return new R<>(ResultCode.OK, true, data);
    }

    public static <T> R fail() {
        return new R<>(ResultCode.ERROR, false);
    }

    public static <T> R fail(IResultCode resultCode) {
        return new R<>(resultCode, false);
    }

    public static <T> R fail(Integer code, String message) {
        return new R<>(code, message, false, null);
    }

    public static <T> R fail(IResultCode resultCode, T data) {
        return new R<>(resultCode, false, data);
    }

    public static <T> R fail(Integer code, String message, T data) {
        return new R<>(code, message, false, data);
    }

    public R() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
