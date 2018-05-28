/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.controller.Alumno;

import org.hibernate.service.Service;

/**
 *
 * @author Usuario
 */


public interface AlumnoService {
    void grabar(Alumno a);
}
