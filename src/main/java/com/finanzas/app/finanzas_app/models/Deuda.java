package com.finanzas.app.finanzas_app.models;

import java.sql.Date;

public class Deuda {
    private Long monto;
    private boolean deuda_a_meses;
    private Integer meses_sin_intereses;
    private Integer id;
    private Date fecha_de_pago;
    private User deudor;
    public Long getMonto() {
        return monto;
    }
    public void setMonto(Long monto) {
        this.monto = monto;
    }
    public boolean isDeuda_a_meses() {
        return deuda_a_meses;
    }
    public void setDeuda_a_meses(boolean deuda_a_meses) {
        this.deuda_a_meses = deuda_a_meses;
    }
    public Integer getMeses_sin_intereses() {
        return meses_sin_intereses;
    }
    public void setMeses_sin_intereses(Integer meses_sin_intereses) {
        this.meses_sin_intereses = meses_sin_intereses;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Date getFecha_de_pago() {
        return fecha_de_pago;
    }
    public void setFecha_de_pago(Date fecha_de_pago) {
        this.fecha_de_pago = fecha_de_pago;
    }
    public User getDeudor() {
        return deudor;
    }
    public void setDeudor(User deudor) {
        this.deudor = deudor;
    }
    public User getAcreedor() {
        return acreedor;
    }
    public void setAcreedor(User acreedor) {
        this.acreedor = acreedor;
    }
    private User acreedor;


}
