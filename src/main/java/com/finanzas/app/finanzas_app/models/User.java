package com.finanzas.app.finanzas_app.models;

public class User {
    private String nombre;
    private Integer id;
    private String correo;
    private Long total_de_deuda;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Long getTotal_de_deuda() {
        return total_de_deuda;
    }
    public void setTotal_de_deuda(Long total_de_deuda) {
        this.total_de_deuda = total_de_deuda;
    }


}
