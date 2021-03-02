package com.example.kbtg;

import lombok.Data;

import java.util.Random;

@Data
public class DemoService {
    private  Random random;

    public String generateData(String name ){
        int number = random.nextInt(10);
        if(number >= 5 && number <= 8 ){ // 5 - 8
            return name + number;
        }
        throw new RuntimeException("Invalid number with:"+number);
    }

//    public static void main(String[] args) {
//        Random random = new Random();
//        DemoService demoService = new DemoService();
//        demoService.setRandom(random);
//        System.out.println(demoService.generateData("punnapa"));
//    }
}
