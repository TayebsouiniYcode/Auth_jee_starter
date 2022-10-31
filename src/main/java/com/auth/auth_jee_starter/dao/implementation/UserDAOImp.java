package com.auth.auth_jee_starter.dao.implementation;

import com.auth.auth_jee_starter.dao.IUserDAO;
import com.auth.auth_jee_starter.entity.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UserDAOImp implements IUserDAO {
    /**
     * @param user
     * @return
     */
    @Override
    public Users add ( Users user ) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ( "authPersistence" );
        EntityManager entityManager = emf.createEntityManager ( );
        entityManager.getTransaction ( ).begin ( );
        entityManager.persist ( user );
        entityManager.getTransaction ( ).commit ( );
        return user;
    }
}
