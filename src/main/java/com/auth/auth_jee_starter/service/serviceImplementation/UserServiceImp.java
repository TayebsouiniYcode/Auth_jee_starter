package com.auth.auth_jee_starter.service.serviceImplementation;

import com.auth.auth_jee_starter.entity.Users;
import com.auth.auth_jee_starter.repository.IUserRepository;
import com.auth.auth_jee_starter.repository.implementation.UserRepositoryImp;
import com.auth.auth_jee_starter.service.IUserService;

public class UserServiceImp implements IUserService {
    IUserRepository userRepository = new UserRepositoryImp ();
    /**
     * this method for register a new user in this app
     * @param user
     * @return user
     */
    @Override
    public Users add ( Users user ) {
        return userRepository.add ( user );
    }

    /**
     * @param user
     * @return
     */
    @Override
    public Users login ( Users user ) {
        return userRepository.login(user);
    }
}
