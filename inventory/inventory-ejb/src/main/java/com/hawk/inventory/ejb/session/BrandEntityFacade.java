/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hawk.inventory.ejb.session;

import com.hawk.inventory.ejb.local.BrandEntityFacadeLocal;
import com.hawk.core.ejb.entity.session.AbstractFacade;
import com.hawk.inventory.ejb.remote.BrandEntityFacadeRemote;
import com.hawk.inventory.entity.BrandEntity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Nisheeth Shah
 */
@Stateless
public class BrandEntityFacade extends AbstractFacade<BrandEntity> implements BrandEntityFacadeLocal, BrandEntityFacadeRemote {

    @PersistenceContext(unitName = "inventory_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BrandEntityFacade() {
        super(BrandEntity.class);
    }

}
