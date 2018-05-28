/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.service.AlumnoService;
import javax.ejb.BeforeCompletion;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Usuario
 */

@ManagedBean(name = "alumno")
public class Bean {
    private AlumnoService alumnoService;
    private Alumno a;

    public Alumno getA() {
        return a;
    }

    public void setA(Alumno a) {
        this.a = a;
    }
    public void grabar(){
        alumnoService.grabar(a);
    }

    public AlumnoService getAlumnoService() {
        return alumnoService;
    }

    public void setAlumnoService(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }
    
    
}
