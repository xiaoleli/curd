package com.example.curd.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ResponseResult<T> {
    private String status;
    private String message;
    private T data;
    private String errorCode;
    public ResponseResult() {
    }
}
