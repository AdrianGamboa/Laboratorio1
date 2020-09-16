/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.tramitesweb.facade;

import org.una.tramitesweb.DTO.TransaccionDTO;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.una.tramitesweb.AbstractFacade;

/**
 *
 * @author Esteban Vargas
 */
@Stateless
public class TransaccionDTOFacade extends AbstractFacade<TransaccionDTO> {

    @PersistenceContext(unitName = "my_persistence_unit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TransaccionDTOFacade() {
        super(TransaccionDTO.class);
    }
    
}