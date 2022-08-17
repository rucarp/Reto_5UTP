
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.DAO.Modelo;
import model.vo.Respuesta2;
import model.vo.Respuesta1;
import model.vo.Respuesta3;
import view.Vista;
import java.sql.*;
import java.util.List;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener{
    
    private Vista view;
    private Modelo model;

    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.jButton1.addActionListener(this);
        this.view.jButton2.addActionListener(this);
        this.view.jButton3.addActionListener(this);
    }
    
    public void iniciar(){
        view.setTitle("Reto 5 - UTP");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {//actionPerformed es para cuando de click me ejecute la accion
        if (e.getSource()== view.jButton1){
            String[] titulo = new String [] {"ID_Lider", "Nombre", "Primer_Apellido", "Ciudad_Residencia"};
            view.mostrar.setColumnIdentifiers(titulo);
            view.mostrar.setNumRows(0);
            
            List<Respuesta1> Listado;
            try{
                Listado = model.con1();
                Listado.forEach(consulta ->{
                    view.mostrar.addRow(new Object[]{
                        consulta.getId_lider(),
                        consulta.getNombre(),
                        consulta.getPrimer_apellido(),
                        consulta.getCiudad_residencia()
                    });
                });
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error en la consulta " + ex);
            }
            
            
        }
        
        if (e.getSource()== view.jButton2){
            String[] titulo = new String [] {"ID_Proyecto", "Constructora", "Numero_Habitaciones", "Ciudad"};
            view.mostrar.setColumnIdentifiers(titulo);
            view.mostrar.setNumRows(0);
            
            List<Respuesta2> Listado;
            try{
                 Listado = model.con2();
                Listado.forEach(consulta ->{
                    view.mostrar.addRow(new Object[]{
                        consulta.getId_proyecto(),
                        consulta.getConstructora(),
                        consulta.getNumero_habitaciones(),
                        consulta.getCiudad()
                    });
                });
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error en la consulta " + ex);
            }
           }
        if (e.getSource()== view.jButton3){
            String[] titulo = new String [] {"ID_Compra", "Constructora", "Banco_Vinculado"};
            view.mostrar.setColumnIdentifiers(titulo);
            view.mostrar.setNumRows(0);
            
            List<Respuesta3> Listado;
             try{
                 Listado = model.con3();
                Listado.forEach(consulta ->{
                    view.mostrar.addRow(new Object[]{
                        consulta.getId_compra(),
                        consulta.getConstructora(),
                        consulta.getBanco_vinculado()
                    });    
                });            
                 
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error en la consulta " + ex);
                       
            
            
        }
    }
 }
}