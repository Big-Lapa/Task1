package com.lapin.study.service.impl;

import com.lapin.study.service.PrintService;

public class PrintServiceImpl implements PrintService {
    @Override
    public void PrintString(String string) {
        System.out.println(string);
    }

    @Override
    public void PrintNumbers(Long number) {
        System.out.println(number);
    }
}
