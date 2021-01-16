package com.ssau.JavaEE_ESA.beans;

import com.ssau.JavaEE_ESA.entities.User;

import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class UserBean {
    @PersistenceContext(unitName = "default")
    private EntityManager em;

    public List<User> getAllUsers(){
        return em.createNamedQuery("User.all", User.class).getResultList();
    }
}
