package com.msk.controller;

import com.msk.aop.DistributedLock;
import lombok.RequiredArgsConstructor;
import org.redisson.api.RedissonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: MSK
 * @date: 2023/11/30 16:27
 */
@RestController
@RequestMapping("/redisson")
@RequiredArgsConstructor
public class RedissonLockController {
    private final RedissonClient redissonClient;

    @GetMapping("/getLock")
    @DistributedLock(key = "#key", keyPrefix = "lock:")
    public String getLock(String key) {
        System.out.println(key);
        return "lock";
    }
}
