package com.lapin.study;

import com.lapin.study.repository.Strings;
import com.lapin.study.service.CalculateService;
import com.lapin.study.service.PrintService;
import com.lapin.study.service.RandomService;
import com.lapin.study.service.impl.CalculateServiceImpl;
import com.lapin.study.service.impl.PrintServiceConsoleImpl;
import com.lapin.study.service.impl.RandomServiceImpl;

public class Main {
    public static void main(String[] args) {
        RandomService random = new RandomServiceImpl();
        CalculateService calculate = new CalculateServiceImpl();
        PrintService printConsole = new PrintServiceConsoleImpl();
        Strings strings = new Strings();
        long a = random.RandomNumber();
        long b = random.RandomNumber();
        long c = random.RandomNumber();
        String string = strings.getPhrase();
        long result1 = calculate.CalculateAverageOfThree(a, b, c, 3);
        long result2 = calculate.CalculateExample(a, b);
        printConsole.PrintNumbers(result1);
        printConsole.PrintString(string);
        printConsole.PrintNumbers(result2);
    }
}
