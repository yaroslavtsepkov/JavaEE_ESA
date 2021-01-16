package com.ssau.JavaEE_ESA.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
public class ExampleBean {
    private String text = "Hello CDI";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
