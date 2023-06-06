/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tendencias.app.Prueba.repository;

import com.tendencias.app.Prueba.model.Ingresos_Egresos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author tefip
 */
public interface Ingresos_EgresosRepository extends JpaRepository<Ingresos_Egresos, Integer>{
        
    @Query(value = "Select * from ingresos_egresos u where u.id_inge = :id_inge", nativeQuery = true)
    public Ingresos_Egresos buscarInge(String id_inge);
}
