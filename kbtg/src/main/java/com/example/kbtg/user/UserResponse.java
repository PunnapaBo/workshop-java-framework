package com.example.kbtg.user;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Data
@Getter
public class UserResponse {
    private Integer id;
    private String name;
    private Integer age;

    public UserResponse() {
    }

    public UserResponse(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }



// Setter and Getter methods
}