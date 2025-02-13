package com.spring.squaregames;

import org.springframework.stereotype.Service;

import java.security.SecureRandom;

@Service
public class RandomHeartbeat implements HeartbeatSensor {
    private final SecureRandom random = new SecureRandom();

    @Override
    public int get() {
        return this.random.nextInt(40,230);
    }
}


