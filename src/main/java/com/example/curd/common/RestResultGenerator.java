package com.example.curd.common;

public class RestResultGenerator {
    /**
     * 生成响应成功(带正文)的结果
     *
     * @param data    结果正文
     * @param message 成功提示信息
     * @return ResponseResult
     */
    public static <T> ResponseResult<T> genResult(T data,String message){
        ResponseResult<T> result = new ResponseResult<T>();
        com.example.curd.common.data<T> dataResult=new data<T>();
        result.setData(data);
        result.setStatus("SUCCESS");
        result.setMessage(message);
        return result;
    }

    /**
     * 生成响应成功(带正文)的结果
     *
     * @param message 成功提示信息
     * @return ResponseResult
     */
    public static <T> ResponseResult<T> genResult(String message){
        ResponseResult<T> result = new ResponseResult<T>();
        result.setStatus("SUCCESS");
        result.setMessage(message);
        return result;
    }
}
