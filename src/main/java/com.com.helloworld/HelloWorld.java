package com.com.helloworld;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 * @author I. Golenko
 *         Date: 28.09.13
 */
@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {

    @ManagedProperty(value = "#{message}")
    private Message messageBean;

    private String message;

    public String getMessage() {
        if (messageBean != null) {
            message = messageBean.getMessage();
        }
        return message;
    }

    public void setMessageBean(Message message) {
        this.messageBean = message;
    }
}