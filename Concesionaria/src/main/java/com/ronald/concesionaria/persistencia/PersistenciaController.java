
package com.ronald.concesionaria.persistencia;

import com.ronald.concesionaria.logica.Automovil;

/**
 *
 * @author r
 */
public class PersistenciaController {
    
    private AutomovilJpaController autoController;
    
    public PersistenciaController(){
        autoController = new AutomovilJpaController();
    }

    public void altaAutomovil(Automovil auto) {
        autoController.create(auto);
    }
    
}
