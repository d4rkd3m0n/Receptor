/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esperapp.metodos;
//import com.esperapp.ws.TurnoBackUp;
import com.esperapp.ws.Entidad;
import com.esperapp.ws.Sede;
import com.esperapp.ws.Turno;
import com.google.gson.Gson;
import java.util.List;



/**
 *
 * @author Joako
 */

public class Receptor {
    
    public Receptor() {
    }
    public boolean login(String cedula, String contrasena, String idSede){
        boolean retorno = false;
        System.out.println("id sede"+idSede+"a");
        retorno = loginEmpleado(cedula, contrasena, idSede);
        return retorno;
    }
    public List<String> LlenarTextField(String cedulaEmp, String idSede){
        List<String> respuesta = atenderCliente(idSede, cedulaEmp);
        if(respuesta.equals(null)){
            
            System.out.println("Entro if");
            return null;
        }
        return respuesta;
       
    }
    public List<Sede> LlenarComboBox(String Nit){
        List<Sede> sedes = buscarSedesClaseXEntidad(Nit);
        return sedes;
    }
    public String RegistrarComoAtendido(String idTurno, String idSede){
        String respuesta = registrarComoAtendido(idTurno, idSede);
        return respuesta;
    }
    public List<Turno> TurnosNoAtendidos(String idSede){
        List<Turno> retorno;
        System.out.println("id sede"+idSede);
        retorno = turnosNoAtendidosEmpleado(idSede);
        return retorno;
    }
    public String buscarNombreEntidadXNit(String Nit){
        
        List<String> retorno = buscarEntidad(Nit);
        String nombre = retorno.get(1);
        return nombre;
    }

    private static boolean loginEmpleado(java.lang.String cedula, java.lang.String contra, java.lang.String sede) {
        com.esperapp.ws.AsignarTurnos_Service service = new com.esperapp.ws.AsignarTurnos_Service();
        com.esperapp.ws.AsignarTurnos port = service.getAsignarTurnosPort();
        return port.loginEmpleado(cedula, contra, sede);
    }

    private static java.util.List<java.lang.String> atenderCliente(java.lang.String idSede, java.lang.String cedula) {
        com.esperapp.ws.AsignarTurnos_Service service = new com.esperapp.ws.AsignarTurnos_Service();
        com.esperapp.ws.AsignarTurnos port = service.getAsignarTurnosPort();
        return port.atenderCliente(idSede, cedula);
    }

    private static String registrarComoAtendido(java.lang.String idTurno, java.lang.String idReceptor) {
        com.esperapp.ws.AsignarTurnos_Service service = new com.esperapp.ws.AsignarTurnos_Service();
        com.esperapp.ws.AsignarTurnos port = service.getAsignarTurnosPort();
        return port.registrarComoAtendido(idTurno, idReceptor);
    }

    private static java.util.List<com.esperapp.ws.Turno> turnosNoAtendidosEmpleado(java.lang.String idSede) {
        com.esperapp.ws.AsignarTurnos_Service service = new com.esperapp.ws.AsignarTurnos_Service();
        com.esperapp.ws.AsignarTurnos port = service.getAsignarTurnosPort();
        return port.turnosNoAtendidosEmpleado(idSede);
    }


    private static java.util.List<com.esperapp.ws.Sede> buscarSedesClaseXEntidad(java.lang.String nit) {
        com.esperapp.ws.AsignarTurnos_Service service = new com.esperapp.ws.AsignarTurnos_Service();
        com.esperapp.ws.AsignarTurnos port = service.getAsignarTurnosPort();
        return port.buscarSedesClaseXEntidad(nit);
    }

    private static java.util.List<java.lang.String> buscarEntidad(java.lang.String nit) {
        com.esperapp.ws.AsignarTurnos_Service service = new com.esperapp.ws.AsignarTurnos_Service();
        com.esperapp.ws.AsignarTurnos port = service.getAsignarTurnosPort();
        return port.buscarEntidad(nit);
    }

   

    

    

    

    

    

    
}
