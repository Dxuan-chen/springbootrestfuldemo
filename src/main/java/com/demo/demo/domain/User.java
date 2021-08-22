package com.demo.demo.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private Long id;
    private String userName;
    private String passWord;
    private String phone;
    private String realName;
    private String sex;
    private String address;
    private String email;

}
