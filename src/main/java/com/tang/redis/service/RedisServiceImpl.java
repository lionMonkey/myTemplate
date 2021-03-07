package com.tang.redis.service;/**
 * @author: TangSiQi
 * @create: 2021-01-06 01:06
 **/

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 *
 *
 * @Author: TangSiQi
 * @Date: 2021/1/6 1:06
 */
@Service
public class RedisServiceImpl{

    @Autowired
    private RedisTemplate redisTemplate;


    public boolean put(String key, Object value, long seconds) throws JsonProcessingException {
        redisTemplate.opsForValue().set(key, value, seconds, TimeUnit.SECONDS);
        return true;
    }

    public <T> T get(String key, Class<T> clazz) throws IOException {
        Object o = redisTemplate.opsForValue().get(key);
        if (o != null) {
            String json = String.valueOf(o);
            //T t = JsonUtil.stringToObject(json, clazz);
            return null;
        }
        return null;
    }
}