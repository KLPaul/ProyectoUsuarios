/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5a.proyectousarios.service;

import com.tendencias.m5a.proyectousarios.model.Usuario;
import com.tendencias.m5a.proyectousarios.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class ServicioUsuarioImpl extends ServicioGenericoImpl<Usuario, Integer>implements ServicioGenerico<Usuario, Integer>{

    @Autowired
    UsuarioRepositorio usuarioRepositorio;
    
    @Override
    public CrudRepository<Usuario, Integer> getDao() {
        return usuarioRepositorio;
    }
    
}
