package com.msk;

import com.msk.aop.EnableDistributedLock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: MSK
 * @date: 2023/11/30 15:44
 */
@SpringBootApplication
@EnableDistributedLock
public class RedissonLockApplication {
    public static void main(String[] args) {
        SpringApplication.run(RedissonLockApplication.class);
    }
}
