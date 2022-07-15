package com.xxoo.框架;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


@Component
public class InitializingBeanExample implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean...");
    }


}
