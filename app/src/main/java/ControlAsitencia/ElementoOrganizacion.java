package ControlAsitencia;

import java.sql.Date;

public class ElementoOrganizacion {
    private int idExterno;
    private int idElementoOrganizacion;
    private String nombre;
    private String paterno;
    private String materno;
    private int idTipoElemento;
    private Media media;

    private Date fechaAlta;
    private Date fechaModificacion;
    private boolean Activo;
    private int idEstatus;
    private Usuario idusuario;

    public int getIdExterno() {
        return idExterno;
    }

    public void setIdExterno(int idExterno) {
        this.idExterno = idExterno;
    }

    public int getIdElementoOrganizacion() {
        return idElementoOrganizacion;
    }

    public void setIdElementoOrganizacion(int idElementoOrganizacion) {
        this.idElementoOrganizacion = idElementoOrganizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public int getIdTipoElemento() {
        return idTipoElemento;
    }

    public void setIdTipoElemento(int idTipoElemento) {
        this.idTipoElemento = idTipoElemento;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
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
