/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.app.Prueba.controller;
import com.tendencias.app.Prueba.model.Ingresos_Egresos;
import com.tendencias.app.Prueba.service.Ingreso_EgresoServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author tefip
 */
@RestController
@RequestMapping("/ingresos_egresos")
public class IngeController {
    
    @Autowired
    Ingreso_EgresoServiceImpl ingeService;

    @Operation(summary = "Se obtiene la lista de Usuarios")
    @GetMapping("/listar")
    public ResponseEntity<List<Ingresos_Egresos>> listaIngresos_Egresos() {
        return new ResponseEntity<>(ingeService.findByAll(), HttpStatus.OK);
    }

    @Operation(summary = "Debe enviar los campos del Ingresos_Egresos")
    @PostMapping("/crear")
    public ResponseEntity<Ingresos_Egresos> crearIngresos_Egresos(@RequestBody Ingresos_Egresos u) {
        return new ResponseEntity<>(ingeService.save(u), HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Ingresos_Egresos> actualizarIngresos_Egresos(@PathVariable Integer id, @RequestBody Ingresos_Egresos u) {
        Ingresos_Egresos inge = ingeService.findById(id);
        if (inge != null) {
            try {
                inge.setInge_envio(u.getInge_envio());
                return new ResponseEntity<>(ingeService.save(inge), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Ingresos_Egresos> elimiarIngresos_Egresos(@PathVariable Integer id) {
        ingeService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
