/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.MenuAerolinea;

/**
 *
 * @author Kenneth
 */
public class ControladorMenuAerolinea {
    MenuAerolinea fMenuAerolinea = new MenuAerolinea();
    public void iniciar(){
        fMenuAerolinea.setLocationRelativeTo(null);
        fMenuAerolinea.setVisible(true);
    }
}
