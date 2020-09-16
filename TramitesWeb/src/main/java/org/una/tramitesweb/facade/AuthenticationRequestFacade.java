/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.tramitesweb.facade;

import org.una.tramitesweb.DTO.AuthenticationRequest;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.una.tramitesweb.AbstractFacade;

/**
 *
 * @author Esteban Vargas
 */
@Stateless
public class AuthenticationRequestFacade extends AbstractFacade<AuthenticationRequest> {

    @PersistenceContext(unitName = "my_persistence_unit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AuthenticationRequestFacade() {
        super(AuthenticationRequest.class);
    }
    
}
