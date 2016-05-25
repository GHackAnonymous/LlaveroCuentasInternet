/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llaverocuentasinternet.Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GHackAnonymous
 */
public class MySQL {
    
    private Connection conexion;
    
    /*
    *Funcion inicializa el controlador jar de mysql.
    */
    public void Init(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e){
            e.printStackTrace();
        } 
    }
    
    /*
    *Funcion Crea Conexion
    * Recurso: http://www.chuidiang.com/java/mysql/EjemploJava.php
    */
    public Connection Conexion(){
        try {
            this.conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/cuentas","root", "usbw");
            
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        return conexion;
    }
}
