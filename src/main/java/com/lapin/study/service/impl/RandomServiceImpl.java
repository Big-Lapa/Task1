package com.lapin.study.service.impl;

import com.lapin.study.service.RandomService;

import java.util.Random;

public class RandomServiceImpl implements RandomService {
    @Override
    public long RandomNumber() {
        Random random = new Random();
        return random.nextLong();
    }
}
