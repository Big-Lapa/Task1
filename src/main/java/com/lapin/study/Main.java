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
        long a = random.randomNumber();
        long b = random.randomNumber();
        long c = random.randomNumber();
        String string = strings.getPhrase();
        long result1 = calculate.calculateAverageOfThree(a, b, c, 3);
        long result2 = calculate.calculateExample(a, b);
        printConsole.printNumbers(result1);
        printConsole.printString(string);
        printConsole.printNumbers(result2);
    }
}
