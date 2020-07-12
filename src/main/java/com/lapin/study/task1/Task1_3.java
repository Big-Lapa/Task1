package com.lapin.study.task1;

import java.util.Random;

public class Task1_3 {
    final Random random = new Random();
    long x = random.nextLong();
    long y = random.nextLong();

    public static long calc(long x, long y) {
        x*=y;
        x+=x;
        x+=y;

        return x;
    }
}
