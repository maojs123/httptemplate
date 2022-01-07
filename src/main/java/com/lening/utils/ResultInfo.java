package com.lening.utils;

/**
 * 本类作者：关乐乐
 * 创建时间为：2021/12/25 10:00
 * 本类作用：xxxx
 */
public class ResultInfo {

    private boolean flag;
    private String msg;

    public ResultInfo() {
    }

    public ResultInfo(boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
