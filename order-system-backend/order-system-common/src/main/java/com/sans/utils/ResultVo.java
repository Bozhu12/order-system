package com.sans.utils;

import lombok.AllArgsConstructor;
import lombok.Data;


/**
 * @author Sans
 */
@Data
@AllArgsConstructor
public class ResultVo<T> {

    private String msg;
    private int code;
    private T data;
}
