package com.example.test.demos.pojo;

public class Result {
    private String msg;
    private int code;
    private Object data;

    public static Result success(){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("success");
        return result;
    }

    public static Result success(Object obj){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("success");
        result.setData(obj);
        return result;
    }

    public static Result failure(String Msg){
        Result result = new Result();
        result.setCode(1);
        result.setMsg(Msg);
        return result;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }

    public Object getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "msg='" + msg + '\'' +
                ", code=" + code +
                ", data=" + data +
                '}';
    }
}
