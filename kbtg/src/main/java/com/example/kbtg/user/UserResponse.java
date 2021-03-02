package com.example.kbtg.user;

import lombok.*;

import java.util.Objects;

//@Data
@Getter
@EqualsAndHashCode
@ToString
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