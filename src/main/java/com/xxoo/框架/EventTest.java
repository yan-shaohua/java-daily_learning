package com.xxoo.框架;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EventTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void publishTest() {
        TestEvent testEvent = new TestEvent("");
        testEvent.setMessage("hello world");
        applicationContext.publishEvent(testEvent);
    }
}
