package llaverocuentasinternet.Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author GHackAnonymous
 */
public class Cuenta {
    private int id = 0;
    private String web = "";
    private String usuario = "";
    private String correo = "";
    private String clave = "";
    
    public Cuenta(){}
    public Cuenta(int id, String web, String usuario, String correo, String clave){
        this.id = id;
        this.web = web;
        this.usuario = usuario;
        this.correo = correo;
        this.clave = clave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
}
