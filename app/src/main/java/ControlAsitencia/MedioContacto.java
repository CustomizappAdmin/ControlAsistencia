package ControlAsitencia;

import java.sql.Date;

public class MedioContacto {
    private int idElementoOrganizacion;
    private MedioContacto medioContacto;
    private String nombre;
    private String descripcion;
    private String valor;
    private Parentesco parentesco;//Checar de que catalogo viene;

    private Date fechaAlta;
    private Date fechaModificacion;
    private boolean Activo;
    private int idEstatus;
    private Usuario idusuario;

    public int getIdElementoOrganizacion() {
        return idElementoOrganizacion;
    }

    public void setIdElementoOrganizacion(int idElementoOrganizacion) {
        this.idElementoOrganizacion = idElementoOrganizacion;
    }

    public MedioContacto getMedioContacto() {
        return medioContacto;
    }

    public void setMedioContacto(MedioContacto medioContacto) {
        this.medioContacto = medioContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
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

    public Parentesco getParentesco() {
        return parentesco;
    }

    public void setParentesco(Parentesco parentesco) {
        this.parentesco = parentesco;
    }
}
