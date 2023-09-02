
package com.ronald.concesionaria.logica;

import com.ronald.concesionaria.persistencia.PersistenciaController;

/**
 *
 * @author Ronald
 */
public class LogicaController {
    
    private Automovil auto;
    private PersistenciaController persistenciaController;
    
    public LogicaController(){
        auto = new Automovil();
        persistenciaController = new PersistenciaController();
    }

    public void altaAutomovil(String modelo, String marca, String motor, String color, String patente, int puertas) {
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantidadPuertas(puertas);
        
        persistenciaController.altaAutomovil(auto);
    }
    
}
