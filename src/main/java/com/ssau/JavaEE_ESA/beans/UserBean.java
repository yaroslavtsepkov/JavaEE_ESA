package com.ssau.JavaEE_ESA.beans;

import com.ssau.JavaEE_ESA.entities.User;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Singleton
public class UserBean {
    @PersistenceContext(unitName = "default")
    private EntityManager em;

    public Collection<User> findAll(){
        return em.createNamedQuery("User.all",User.class).getResultList();
    }
}
