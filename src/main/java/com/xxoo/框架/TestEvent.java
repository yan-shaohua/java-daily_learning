package com.xxoo.框架;

import org.springframework.context.ApplicationEvent;

public class TestEvent extends ApplicationEvent {

    private static final long serialVersionUID = -376299954511699499L;
    private String message;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public TestEvent(Object source) {
        super(source);
    }

    public void getMessage() {
        System.out.println(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

}