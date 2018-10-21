package com.imooc.util;

import java.util.HashMap;
import java.util.Map;


public class JsonMsg {

    //状态码：100--成功  200--失败
    private int code;
    //提示信息
    private String msg;
    //用户要返回给浏览器的数据
    private Map<String, Object> extendInfo = new HashMap<String, Object>();

    //返回成功操作提示
    public static JsonMsg success(){
        JsonMsg res = new JsonMsg();
        res.setCode(100);
        res.setMsg("操作成功！");
        return res;
    }
    //返回失败操作提示
    public static JsonMsg fail(){
        JsonMsg res = new JsonMsg();
        res.setCode(200);
        res.setMsg("操作失败！");
        return res;
    }
    //添加键值对对象
    public JsonMsg addInfo(String key, Object value){
        this.extendInfo.put(key, value);
        return this;
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

    public Map<String, Object> getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(Map<String, Object> extendInfo) {
        this.extendInfo = extendInfo;
    }



}
