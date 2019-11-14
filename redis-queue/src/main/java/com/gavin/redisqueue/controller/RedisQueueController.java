package com.gavin.redisqueue.controller;

import com.gavin.redisqueue.queue.RedisSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * **********************************************************
 *
 * @Project:
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2019-11-14 14:53
 * @description:
 ************************************************************/
@RestController
@RequestMapping(value = "/v1")
public class RedisQueueController {
    @Autowired
    private RedisSender redisSender;


    @GetMapping(value = "/redis")
    public String secKill(){
        //这边的seckill是在queue.RedisSubListenerConfig中定义的主题
        redisSender.sendChannelMess("seckill","success");
        return "success";
    }

    @GetMapping(value = "/test")
    public String test(){
        redisSender.sendChannelMess("test","success");
        return "success";
    }
}
