package com.auth.auth_jee_starter.repository;

import com.auth.auth_jee_starter.entity.Users;

public interface IUserRepository {
    Users add(Users user);
}
