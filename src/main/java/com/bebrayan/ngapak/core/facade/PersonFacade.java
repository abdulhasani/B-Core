package com.bebrayan.ngapak.core.facade;

import com.bebrayan.ngapak.core.entity.Person;
import com.bebrayan.ngapak.core.facade.AbstractDatabaseFacade;
import com.bebrayan.ngapak.core.facade.PersonFacadeLocal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hasani
 */
@Stateless
public class PersonFacade extends AbstractDatabaseFacade<Person> implements PersonFacadeLocal {
    
    @PersistenceContext(unitName = "BebrayanLab")
    private EntityManager em;

    public PersonFacade() {
        super(Person.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
