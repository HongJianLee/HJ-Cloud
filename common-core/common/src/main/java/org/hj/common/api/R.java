package org.hj.common.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.Getter;
import org.hj.common.constant.Constant;

import java.io.Serializable;

/**
 * 统一响应消息报文
 *
 * @param <T> 　T对象
 * @author hong.jian.li
 */
@Data
@Getter
public class R<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 状态码
	 */
	private int code;

	/**
     * 消息内容
     */
	private String msg;

	/**
	 * 时间戳
	 */
	private long time;

	/**
     * 业务数据
     */
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private T data;

	private R() {
		this.time = System.currentTimeMillis();
	}

	private R(IResultCode resultCode) {
		this(resultCode, null, resultCode.getMsg());
	}

	private R(IResultCode resultCode, String msg) {
		this(resultCode, null, msg);
	}

	private R(IResultCode resultCode, T data) {
		this(resultCode, data, resultCode.getMsg());
	}

	private R(IResultCode resultCode, T data, String msg) {
		this(resultCode.getCode(), data, msg);
	}

	private R(int code, T data, String msg) {
		this.code = code;
		this.data = data;
		this.msg = msg;
		this.time = System.currentTimeMillis();
	}

	/**
	 * 返回状态码
	 *
	 * @param resultCode 状态码
	 * @param <T>        泛型标识
	 * @return ApiResult
	 */
	public static <T> R<T> success(IResultCode resultCode) {
		return new R<>(resultCode);
	}

	public static <T> R<T> success(String msg) {
		return new R<>(ResultCode.SUCCESS, msg);
	}

	public static <T> R<T> success(IResultCode resultCode, String msg) {
		return new R<>(resultCode, msg);
	}

	public static <T> R<T> data(T data) {
		return data(data, Constant.DEFAULT_SUCCESS_MESSAGE);
	}

	public static <T> R<T> data(T data, String msg) {
		return data(ResultCode.SUCCESS.code, data, msg);
	}

	public static <T> R<T> data(int code, T data, String msg) {
		return new R<>(code, data, data == null ? Constant.DEFAULT_NULL_MESSAGE : msg);
	}

	public static <T> R<T> fail() {
		return new R<>(ResultCode.FAILURE, ResultCode.FAILURE.getMsg());
	}

	public static <T> R<T> fail(String msg) {
		return new R<>(ResultCode.FAILURE, msg);
	}

	public static <T> R<T> fail(int code, String msg) {
		return new R<>(code, null, msg);
	}

	public static <T> R<T> fail(IResultCode resultCode) {
		return new R<>(resultCode);
	}

	public static <T> R<T> fail(IResultCode resultCode, String msg) {
		return new R<>(resultCode, msg);
	}

	public static <T> R<T> condition(boolean flag) {
		return flag ? success(Constant.DEFAULT_SUCCESS_MESSAGE) : fail(Constant.DEFAULT_FAIL_MESSAGE);
	}
}
