/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.controller.Alumno;
import com.mycompany.dao.AlumnosDao;

/**
 *
 * @author Usuario
 */

public class AlumnoServiceImpl implements AlumnoService{

    private AlumnosDao alumnoDao;
    @Override
    public void grabar(Alumno a) {
        alumnoDao.grabar(a);
    }
    
}
