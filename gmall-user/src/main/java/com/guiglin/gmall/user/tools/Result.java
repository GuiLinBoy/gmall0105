package com.guiglin.gmall.user.tools;

public class Result<T> {
    private int code;
    private String msg;
    private T res;

    public Result() {

    }

    /**
     *
     * @param code 状态码
     * @param msg 说明信息
     * @param res 返回的数据
     */
    public Result(int code, String msg, T res) {
        this.code = code;
        this.msg = msg;
        this.res = res;
    }

    /**
     *
     * @param msg 说明信息
     * @param res 返回的数据
     */
    public Result(String msg, T res) {
        this.msg = msg;
        this.res = res;
    }

    /**
     *
     * @param code 状态码
     * @param res 返回的数据
     */
    public Result(int code, T res) {
        this.code = code;
        this.res = res;
    }

    /**
     *
     * @param code 状态码
     * @param msg 说明信息
     */
    public Result(int code,String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getRes() {
        return res;
    }

    public void setRes(T res) {
        this.res = res;
    }
}
