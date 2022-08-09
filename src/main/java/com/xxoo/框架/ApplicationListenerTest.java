package com.xxoo.框架;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 创建事件监听者
 * 有两种方法可以创建监听者，一种是直接实现ApplicationListener的接口，
 *                      一种是使用注解 @EventListener，注解是添加在监听方法上的，下面的例子是直接实现的接口
 */
@Component
public class ApplicationListenerTest implements ApplicationListener<TestEvent> {
    @Override
    public void onApplicationEvent(TestEvent testEvent) {
        testEvent.getMessage();
    }
}
