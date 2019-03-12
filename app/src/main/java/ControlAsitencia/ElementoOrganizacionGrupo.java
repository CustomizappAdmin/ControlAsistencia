package ControlAsitencia;

import java.sql.Date;

public class ElementoOrganizacionGrupo {

    private Organizacion organizacion;
    private int idElementoOrganizacion;
    private Grupo grupo;

    private Date fechaAlta;
    private Date fechaModificacion;
    private boolean Activo;
    private int idEstatus;
    private Usuario idusuario;


    public Organizacion getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(Organizacion organizacion) {
        this.organizacion = organizacion;
    }

    public int getIdElementoOrganizacion() {
        return idElementoOrganizacion;
    }

    public void setIdElementoOrganizacion(int idElementoOrganizacion) {
        this.idElementoOrganizacion = idElementoOrganizacion;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
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
