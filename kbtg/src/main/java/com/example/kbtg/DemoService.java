package com.example.kbtg;

import lombok.Data;

import java.util.Random;

@Data
public class DemoService {
    private  Random random;

    public String generateData(String name ){
        Random random = new Random();
        int number = random.nextInt(10);
        return name + number;
    }

    public static void main(String[] args) {
        Random random = new Random();
        DemoService demoService = new DemoService();
        demoService.setRandom(random);
        System.out.println(demoService.generateData("punnapa"));
    }
}
