package com.tang.redis.common.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * redis工具类
 *
 * @Author: TangSiQi
 * @Date: 2021/1/28 23:37
 */
public class RedisUtils {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;


}
