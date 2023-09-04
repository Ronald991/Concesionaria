
package com.ronald.concesionaria.persistencia;

import com.ronald.concesionaria.logica.Automovil;
import java.util.List;

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

    public List<Automovil> getAllAutomoviles() {
        return autoController.findAutomovilEntities();
    }
    
}
