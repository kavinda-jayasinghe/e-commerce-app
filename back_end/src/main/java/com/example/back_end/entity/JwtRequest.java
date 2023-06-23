package com.example.back_end.entity;


import lombok.Data;


@Data

public class JwtRequest {
    private String userName;
    private String userPassword;
}
