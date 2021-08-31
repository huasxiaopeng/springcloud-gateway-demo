package com.example.webdubbo.config;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/31
 * @desc
 */
public class JsonResult {
    private String status = null;

    private Object result = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
