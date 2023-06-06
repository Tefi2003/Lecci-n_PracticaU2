/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.app.Prueba.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author tefip
 */
@Data
@Entity
public class Ventas {
    
  
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ventas")
    private int id_ventas;
    
    @NotBlank(message = "El nombre no puede estar en blanco")
    @Column(name = "ven_nombre")
    private String ven_nombre;
    
    @NotBlank(message = "La cantidad no puede estar en blanco")
    @Column(name = "ven_cantidad")
    private int ven_cantidad;
    
    @NotBlank(message = "El precio no puede estar en blanco")
    @Column(name = "ven_precio")
    private double ven_precio;
    
    @NotBlank(message = "La fecha no puede estar en blanco")
    @Column(name = "ven_fecha")
    private Date ven_fecha;
    
}
