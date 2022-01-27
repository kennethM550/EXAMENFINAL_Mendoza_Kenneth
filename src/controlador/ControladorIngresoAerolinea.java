/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import modelo.Aerolinea;
import vista.IngresoAerolinea;
import vista.MenuAerolinea;

/**
 *
 * @author Kenneth
 */
public class ControladorIngresoAerolinea {
    private Aerolinea modelo;
    private IngresoAerolinea fIngresoAerolinea;

    public ControladorIngresoAerolinea(IngresoAerolinea fIngresoAerolinea) {
        this.fIngresoAerolinea = fIngresoAerolinea;
    }
    
    this.fIngresoAerolinea.BtnIngresar.addActionListener(new ActionListener()
    public void actionPerformed(ActionEvent e){
        if (modelo.ingresar(fIngresoAerolinea.txtNombre.getText(), fIngresoAerolinea.txtRuc.getText())) {
            MenuAerolinea vista = new MenuAerolinea();
            ControladorIngresoAerolinea controlador = new ControladorIngresoAerolinea(vista);
        }
    });
   

    
}
