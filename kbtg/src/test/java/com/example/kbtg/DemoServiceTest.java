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
    @Test
    @DisplayName("throw exception")
    public void exception_random_5(){
        DemoService demoService = new DemoService();
        demoService.setRandom(new Random5());
        String actualResult = demoService.generateData("punnapa");
        assertEquals("punnapa5",actualResult);
    }


    @Test
    public void throw_exception_1() {
        DemoService demoService = new DemoService();
        demoService.setRandom(new MockRandom(1));
        try {
            demoService.generateData("somkiat");
            fail();
        }catch (RuntimeException e) {
            assertEquals("Invalid number with:1", e.getMessage());
        }
    }

    @Test
    public void throw_exception_with_juit5() {
        DemoService demoService = new DemoService();
        demoService.setRandom(new MockRandom(1));
        // JUnit 5 style
        Exception exception = assertThrows(RuntimeException.class, () -> {
            demoService.generateData("somkiat");
        });
        assertEquals("Invalid number with:1", exception.getMessage());
    }

}
class Random5 extends Random{
    @Override
    public  int nextInt(int bound){
        return 5;
    }
}

class MockRandom extends Random {
    private final int result;

    MockRandom(int result) {
        this.result = result;
    }

    @Override
    public int nextInt(int bound) {
        return result;
    }
}