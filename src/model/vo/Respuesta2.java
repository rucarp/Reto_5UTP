/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.vo;

/**
 *
 * @author USUARIO
 */
public class Respuesta2 {
    private Integer id_proyecto;
    private String constructora;
    private String numero_habitaciones ;
    private String ciudad;

    public Respuesta2() {
    }

    public Respuesta2(Integer id_proyecto, String constructora, String numero_habitaciones, String ciudad) {
        this.id_proyecto = id_proyecto;
        this.constructora = constructora;
        this.numero_habitaciones = numero_habitaciones;
        this.ciudad = ciudad;
    }

    public Integer getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(Integer id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getNumero_habitaciones() {
        return numero_habitaciones;
    }

    public void setNumero_habitaciones(String numero_habitaciones) {
        this.numero_habitaciones = numero_habitaciones;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

   
}
