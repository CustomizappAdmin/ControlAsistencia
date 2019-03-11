package ControlAsitencia;

import java.sql.Date;

public class DetalleHorarioNivel {
    private Organizacion organizacion;
    private HorarioNivel horarioNivel;
    private int idHorarioDetalleNivel;
    private Date horaInicio;
    private Date horaFin;
    private String dia;

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

    public HorarioNivel getHorarioNivel() {
        return horarioNivel;
    }

    public void setHorarioNivel(HorarioNivel horarioNivel) {
        this.horarioNivel = horarioNivel;
    }

    public int getIdHorarioDetalleNivel() {
        return idHorarioDetalleNivel;
    }

    public void setIdHorarioDetalleNivel(int idHorarioDetalleNivel) {
        this.idHorarioDetalleNivel = idHorarioDetalleNivel;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
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
