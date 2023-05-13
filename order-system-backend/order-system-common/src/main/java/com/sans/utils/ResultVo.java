package com.sans.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

import static com.sans.utils.status.StatusCode.SUCCESS_CODE;

/**
 * @author Sans
 */
@Data
@AllArgsConstructor
public class ResultVo<T> {

    private String msg;
    private int code;
    private T data;

    private ResultVo(){}

    public static <T> ResultVo<T>  ok(T data) {
        return new ResultVo<>("ok", SUCCESS_CODE, data);
    }

    // 业务异常
    //public static <T> ResultVo<T> err(ErrorCode errorCode, String msg) {
    //    return new ResultVo<>(errorCode.getCode(), null, msg);
    //}
    // 系统异常
    //public static <T> ResultVo<T> err() {
    //    return new ResultVo<>(ErrorCode.SYSTEM_ERROR.getCode(), null, ErrorCode.SYSTEM_ERROR.getMessage());
    //}

}
