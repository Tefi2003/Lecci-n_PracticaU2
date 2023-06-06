/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.app.Prueba.service;

import com.tendencias.app.Prueba.model.Ingresos_Egresos;
import com.tendencias.app.Prueba.repository.Ingresos_EgresosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author tefip
 */
@Service
public class Ingreso_EgresoServiceImpl extends GenericServiceImpl<Ingresos_Egresos, Integer> implements GenericService<Ingresos_Egresos, Integer> {

    @Autowired
    Ingresos_EgresosRepository ingresos_EgresosRepository;

    @Override
    public CrudRepository<Ingresos_Egresos, Integer> getDao() {
        return ingresos_EgresosRepository;
    }
    
}
