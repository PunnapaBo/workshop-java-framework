package com.example.kbtg.user;

public class UserService {

    public UserResponse getInfo(int id) {
        if( id <= 10){
            return  new UserResponse(id,"punnapa",23);
        }
       throw  new RuntimeException("User not found id="+id);

    }
}
