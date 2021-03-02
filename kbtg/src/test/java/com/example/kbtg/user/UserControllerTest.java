package com.example.kbtg.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void success_get_user_1(){
        UserResponse response = testRestTemplate.getForObject("/user/1",UserResponse.class);
        assertEquals(1,response.getId());
        assertEquals("punnapa",response.getName());
        assertEquals(23,response.getAge());

        UserResponse expected = new UserResponse(1, "punnapa", 23);
        assertEquals(expected,response);
    }

    @Test
    public void fail_get_user_1(){
//        UserResponse response = ;
        assertThrows(RuntimeException.class, () -> {
            testRestTemplate.getForObject("/user/11",UserResponse.class);
        });
    }

    @Test
    public void user_not_found_with_user_id_15() {
        ErrorResponse errorExpected = new ErrorResponse(1234,"User not found id=15");
        ErrorResponse errorActual = testRestTemplate.getForObject("/user/15",ErrorResponse.class);
        assertEquals(errorExpected,errorActual);
    }
}
