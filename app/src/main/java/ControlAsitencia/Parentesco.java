package ControlAsitencia;

import java.sql.Date;

public class Parentesco {

    private int idParentesco;
    private String Nombre;

    private Date fechaAlta;
    private Date fechaModificacion;
    private boolean Activo;
    private int idEstatus;
    private Usuario idusuario;

    public int getIdParentesco() {
        return idParentesco;
    }

    public void setIdParentesco(int idParentesco) {
        this.idParentesco = idParentesco;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean activo) {
        Activo = activo;
    }

    public int getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(int idEstatus) {
        this.idEstatus = idEstatus;
    }

    public Usuario getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Usuario idusuario) {
        this.idusuario = idusuario;
    }
}
