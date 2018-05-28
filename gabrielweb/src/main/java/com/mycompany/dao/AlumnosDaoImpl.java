/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.controller.Alumno;
import com.mycompany.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Usuario
 */
public class AlumnosDaoImpl implements AlumnosDao{

    
    private Session sesion;
    private Transaction trx;
    @Override
    public void grabar(Alumno a) {
       sesion = HibernateUtil.getSessionFactory().getCurrentSession();
      try{
          sesion.beginTransaction();
          sesion.save(a);
          sesion.getTransaction().commit();
      }catch(Exception e){}
    }

    @Override
    public void borrar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
