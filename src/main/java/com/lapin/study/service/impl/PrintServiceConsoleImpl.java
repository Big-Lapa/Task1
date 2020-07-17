package com.lapin.study.service.impl;

import com.lapin.study.service.PrintService;

public class PrintServiceConsoleImpl implements PrintService {
    @Override
    public void printString(String string) {
        System.out.println(string);
    }

    @Override
    public void printNumbers(Long number) {
        System.out.println(number);
    }
}
