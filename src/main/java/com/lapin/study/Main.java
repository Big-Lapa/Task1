package com.lapin.study;

import com.lapin.study.repository.Strings;
import com.lapin.study.service.CalculateService;
import com.lapin.study.service.PrintService;
import com.lapin.study.service.RandomService;
import com.lapin.study.service.impl.CalculateServiceImpl;
import com.lapin.study.service.impl.PrintServiceImpl;
import com.lapin.study.service.impl.RandomServiceImpl;

public class Main {
    public static void main(String[] args) {
        RandomService random = new RandomServiceImpl();
        CalculateService calculate = new CalculateServiceImpl();
        PrintService print = new PrintServiceImpl();
        Strings str = new Strings();
        long a = random.RandomNumber();
        long b = random.RandomNumber();
        long c = random.RandomNumber();
        String string = str.phrase;
        long result1 = calculate.CalculateAverageOfThree(a, b, c, 3);
        long result2 = calculate.CalculateExample(a,b);
        print.PrintNumbers(result1);
        print.PrintString(string);
        print.PrintNumbers(result2);


    }
}
