package com.originbackend.component;

import com.originbackend.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class RedisComponentTest extends BaseTest {
    @Autowired
    private RedisComponent redisComponent;

    @Test
    public void RedisTest(){
        redisComponent.set("key","value");
        String value = (String)redisComponent.get("key");
        System.out.println(value);
    }

}
