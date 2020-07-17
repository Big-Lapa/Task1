package com.lapin.study.service.impl;

import com.lapin.study.service.RandomService;

import java.util.Random;

public class RandomServiceImpl implements RandomService {
    @Override
    public long randomNumber() {
        Random random = new Random();
        return random.nextLong();
    }
}
