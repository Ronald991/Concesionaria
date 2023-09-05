
package com.ronald.concesionaria.persistencia;

import com.ronald.concesionaria.logica.Automovil;
import com.ronald.concesionaria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public void eliminarAutomovil(int id_cliente) {
        try {
            autoController.destroy(id_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenciaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
