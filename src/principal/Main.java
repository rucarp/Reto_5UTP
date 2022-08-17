
package principal;

import controller.Controlador;
import model.DAO.Modelo;
import view.Vista;

public class Main {

    public static void main(String[] args) {
        Modelo model = new Modelo();
        Vista vista = new Vista();
        
        Controlador controller = new Controlador(vista, model);
        controller.iniciar();
        vista.setVisible(true);
    }
    
}
