/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5a.proyectousarios.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Usuario
 */
public abstract class ServicioGenericoImpl<T, ID extends Serializable> implements ServicioGenerico<T,ID> {

    public abstract CrudRepository<T,ID> getDao();
    
    @Override
    public T save(T entity) {
        
        return getDao().save(entity);
        
    }

    @Override
    public T findById(ID id) {
        Optional<T> obj= getDao().findById(id);
        
        if(obj.isPresent()){
            return obj.get();
        }
    
        return null;
    }

    @Override
    public List<T> findByAll() {
        
        List<T> list = new ArrayList<>();
        getDao().findAll().forEach(obj->list.add( obj));
        return list;
    }

    @Override
    public void delete(ID id) {
        
        getDao().deleteById(id);
    
    }
    
}
