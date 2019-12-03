package com.baxianguohai.hetao.h5.common;

import java.io.Serializable;

public class Result implements Serializable, Cloneable {

    private static final long serialVersionUID = 8000349409315221668L;
    private Object data;
    private String errorMessage;
    private boolean success;

    public static Result failure(String errorMessage) {
        Result result = new Result();
        result.errorMessage = errorMessage;
        result.success = false;
        return result;
    }

    public static Result success(Object data) {
        Result result = new Result();
        result.errorMessage = "";
        result.data = data;
        result.success = true;
        return result;
    }

    public static Result success() {
        Result result = new Result();
        result.errorMessage = "";
        result.data = "success";
        result.success = true;
        return result;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
