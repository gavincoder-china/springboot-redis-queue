package com.gavin.redisqueue.queue;

import com.gavin.redisqueue.config.RedisUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * redis队列消费者
 */
@Service
public class RedisConsumer {
	

	@Autowired
	private RedisUtil redisUtil;
	
    public void receiveMessage(String message) {
		Thread th=Thread.currentThread();
		System.out.println("Tread name:"+th.getName());



		System.out.println("进来啦:"+message);
    }

}