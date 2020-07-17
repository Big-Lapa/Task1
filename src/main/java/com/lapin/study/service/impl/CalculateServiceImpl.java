package com.lapin.study.service.impl;

import com.lapin.study.service.CalculateService;

public class CalculateServiceImpl implements CalculateService {
    @Override
    public long CalculateAverageOfThree(long a, long b, long c, long numberOfNumbers) {
        return (a + b + c) / numberOfNumbers;
    }

    @Override
    public long CalculateExample(long a, long b) {
        return a * b + a + b;
    }
}
