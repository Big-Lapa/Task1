package com.lapin.study.task1;

import java.util.Random;

public class Task1_1 {
    final Random random = new Random();
    long a = random.nextLong();
    long b = random.nextLong();
    long c = random.nextLong();

    public static long average(long a, long b, long c) {
        return (a + b + c) / 3;
    }
}
