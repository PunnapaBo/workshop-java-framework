package com.example.kbtg;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class DemoServiceTest {
    @Test
    @DisplayName("expected return is 5")
    public void random_5(){
        DemoService demoService = new DemoService();
        demoService.setRandom(new Random5());
        String actualResult = demoService.generateData("punnapa");
        assertEquals("punnapa5",actualResult);
    }

}
class Random5 extends Random{
    @Override
    public  int nextInt(int bound){
        return 5;
    }
}