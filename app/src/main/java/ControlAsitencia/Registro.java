package ControlAsitencia;

import java.sql.Date;

public class Registro {
    private Ciclo ciclo;
    private Grupo grupo;
    private Usuario usuario;
    private Evento evento;
    private int idElementoOrganizacion;
    private Date fechaHora;
    private String coordenadas;
    private String observaciones;
    private Byte imagen;

    private Date fechaAlta;
    private Date fechaModificacion;
    private boolean Activo;
    private int idEstatus;
    private Usuario idusuario;

    public Ciclo getCiclo() {
        return ciclo;
    }

    public void setCiclo(Ciclo ciclo) {
        this.ciclo = ciclo;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public int getIdElementoOrganizacion() {
        return idElementoOrganizacion;
    }

    public void setIdElementoOrganizacion(int idElementoOrganizacion) {
        this.idElementoOrganizacion = idElementoOrganizacion;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Byte getImagen() {
        return imagen;
    }

    public void setImagen(Byte imagen) {
        this.imagen = imagen;
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
}
