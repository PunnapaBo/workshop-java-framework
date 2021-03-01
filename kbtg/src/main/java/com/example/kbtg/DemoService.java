package com.example.kbtg;

import java.util.Random;

public class DemoService {
    public String generateData(String name ){
        Random random = new Random();
        int number = random.nextInt(10);
        return name + number;
    }

    public static void main(String[] args) {
        DemoService demoService = new DemoService();
        System.out.println(demoService.generateData("punnapa"));
    }
}
