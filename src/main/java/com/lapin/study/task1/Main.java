package com.lapin.study.task1;

public class Main {
    public static void main(String[] args) {
        Task1_1 task1_1 = new Task1_1();
        System.out.println("Your average of 3 numbers: " + Task1_1.average(task1_1.a, task1_1.b, task1_1.c));

        Task1_2.phrase();

        Task1_3 task1_3 = new Task1_3();
        System.out.println("Your expression: " + Task1_3.calc(task1_3.x, task1_3.y));
    }
}
