package com.originbackend.entity;

import java.util.HashMap;
import java.util.Map;

public class R extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public static final int code_ok = 1;
    public static final int code_unknow_error = 99;

    private R() {
        put("ok", true);
        put("code", code_ok);
    }

    public static R error() {
        return error(code_unknow_error, "未知异常，请联系管理员");
    }

    public static R error(String msg) {
        return error(code_unknow_error, msg);
    }

    public static R error(int code, String msg) {
        R r = new R();
        r.put("ok", false);
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static R ok(String msg) {
        R r = new R();
        r.put("msg", msg);
        return r;
    }

    public static R ok(Map<String, Object> map) {
        R r = new R();
        r.putAll(map);
        return r;
    }

    public static R ok() {
        return new R();
    }

    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
