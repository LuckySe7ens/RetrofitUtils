package com.itheima.retrofitutils;

public enum RequestMethod {
    GET("GET"),
    PUT("PUT"),
    DELETE("DELETE"),
    POST("POST");
    private final String value;

    RequestMethod(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
