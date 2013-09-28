package com.com.helloworld;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * @author I. Golenko
 *         Date: 28.09.13
 */
@ManagedBean(name = "message", eager = true)
@RequestScoped
public class Message {

    private String message = "Hello World! Hi!";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}