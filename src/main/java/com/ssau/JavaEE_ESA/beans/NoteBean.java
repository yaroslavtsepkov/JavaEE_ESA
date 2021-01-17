package com.ssau.JavaEE_ESA.beans;

import com.ssau.JavaEE_ESA.entities.Notes;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Singleton
public class NoteBean {
    @PersistenceContext(unitName = "default")
    private EntityManager em;

    public Collection<Notes> findAll(){
        return em.createNamedQuery("Notes.all", Notes.class).getResultList();
    }
}