
package com.ronald.concesionaria.logica;

import com.ronald.concesionaria.persistencia.PersistenciaController;
import java.util.List;

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

    public List<Automovil> getAllAutomoviles() {
        return persistenciaController.getAllAutomoviles();
    }

    public void eliminarAutomovil(int id_cliente) {
        persistenciaController.eliminarAutomovil(id_cliente);
    }

    public Automovil getAutomovil(int id_auto) {
        return persistenciaController.getAutomovil(id_auto);
    }

    public void editarAutomovil(int id_auto, String modelo, String marca, String motor, String color,
                String patente, int puertas) {
        
        auto.setId(id_auto);
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantidadPuertas(puertas);
        
        persistenciaController.editarAutomovil(auto);
        
    }
    
}
