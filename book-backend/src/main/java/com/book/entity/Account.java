package com.book.entity;

import lombok.Data;

@Data
public class Account {
    Integer id;
    String username;
    String password;
    String role;
}
