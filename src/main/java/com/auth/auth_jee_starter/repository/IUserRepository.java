package com.auth.auth_jee_starter.repository;

import com.auth.auth_jee_starter.entity.Users;

public interface IUserRepository {
    Users add(Users user);
    //Boolean remove(int UserId);


    Users login(Users user);
    Users findByUsername( String username);
}
