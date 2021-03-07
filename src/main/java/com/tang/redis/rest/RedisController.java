package com.tang.redis.rest;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 * @Author: TangSiQi
 * @Date: 2021/1/6 0:56
 */
@RestController
public class RedisController {



    @GetMapping("/test")
    public void test(){
        RedisTemplate<String, String> template = new RedisTemplate<>();
        //template.getVa
    }
}
