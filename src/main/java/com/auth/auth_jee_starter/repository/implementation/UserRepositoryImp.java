package com.auth.auth_jee_starter.repository.implementation;

import com.auth.auth_jee_starter.dao.IUserDAO;
import com.auth.auth_jee_starter.dao.implementation.UserDAOImp;
import com.auth.auth_jee_starter.entity.Users;
import com.auth.auth_jee_starter.repository.IUserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.sql.SQLException;
import java.util.List;

public class UserRepositoryImp implements IUserRepository {
    IUserDAO userDAO = new UserDAOImp ();

    EntityManagerFactory emf = Persistence.createEntityManagerFactory ( "authPersistence" );
    EntityManager entityManager = emf.createEntityManager ( );
    /**
     * @param user
     * @return
     */
    @Override
    public Users add ( Users user ) {
        return userDAO.add ( user );
    }

    /**
     * @param user
     * @return
     */
    @Override
    public Users login ( Users user ) {
        Users u;
        try {
            Query query = entityManager.createQuery ( "SELECT u FROM Users  u WHERE u.username= :username" );
            query.setParameter("username", user.getUsername ());
            u = (Users) query.getSingleResult ();
            return u;
        } catch (Exception e){
            System.out.println (e.toString () );
            return null;
        }

    }

    /**
     * @param username
     * @return
     */
    @Override
    public Users findByUsername ( String username ) {
        Users user = new Users (  );
        Query query = entityManager.createQuery ( "SELECT u FROM Users  u WHERE u.username= :username" );
        query.setParameter("username", username);
        user = (Users) query.getSingleResult ();
        return  user;
    }

}
