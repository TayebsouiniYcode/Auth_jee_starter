package com.auth.auth_jee_starter.repository.implementation;

import com.auth.auth_jee_starter.dao.IUserDAO;
import com.auth.auth_jee_starter.dao.implementation.UserDAOImp;
import com.auth.auth_jee_starter.entity.Users;
import com.auth.auth_jee_starter.repository.IUserRepository;

public class UserRepositoryImp implements IUserRepository {
    IUserDAO userDAO = new UserDAOImp ();
    /**
     * @param user
     * @return
     */
    @Override
    public Users add ( Users user ) {
        System.out.println ("this is dao" );
        userDAO.add ( user );
        return user;
    }
}
