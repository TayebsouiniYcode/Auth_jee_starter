package com.auth.auth_jee_starter.service;

import com.auth.auth_jee_starter.entity.Users;

public interface IUserService {
    Users add(Users user);

    Users login(Users user);
}
