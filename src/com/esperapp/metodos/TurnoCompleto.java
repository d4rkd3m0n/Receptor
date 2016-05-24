/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esperapp.metodos;

import java.util.Date;

/**
 *
 * @author Joako
 */
public class TurnoCompleto {

    String consecutivo=new String();
    String turno = new String();
    String Correo_Id = new String();
    Date Fecha = new Date(); 
    String Receptor = new String();
    String Cedula = new String();
    
    public TurnoCompleto() {
    }

    public void setConsecutivo(String consecutivo) {
        this.consecutivo = consecutivo;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setCorreo_Id(String Correo_Id) {
        this.Correo_Id = Correo_Id;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public void setReceptor(String Receptor) {
        this.Receptor = Receptor;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getConsecutivo() {
        return consecutivo;
    }

    public String getTurno() {
        return turno;
    }

    public String getCorreo_Id() {
        return Correo_Id;
    }

    public Date getFecha() {
        return Fecha;
    }

    public String getReceptor() {
        return Receptor;
    }

    public String getCedula() {
        return Cedula;
    }
    
    

}