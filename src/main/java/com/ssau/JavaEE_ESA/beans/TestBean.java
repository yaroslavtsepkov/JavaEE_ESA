package com.ssau.JavaEE_ESA.beans;

import javax.annotation.ManagedBean;
import javax.faces.view.ViewScoped;

@ViewScoped
@ManagedBean
public class TestBean {
    private String message = "Hello world";

    public TestBean() {
        System.out.println("TestBean instantiated.");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String fetchMsg() {
        return "Msg fetched: " + message;
    }
}
