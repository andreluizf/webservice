/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nutricao.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.nutricao.models.repository.paciente.Paciente;


/**
 *
 * @author Alex
 */
@Entity
@Table(name = "dieta")
@NamedQueries({
    @NamedQuery(name = "Dieta.findAll", query = "SELECT d FROM Dieta d")})
public class Dieta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "arquivo")
    private String arquivo;
    @Column(name = "dataCad")
    @Temporal(TemporalType.DATE)
    private Date dataCad;
    @JoinColumn(name = "anamnese_gestante", referencedColumnName = "codigo")
    @ManyToOne(fetch = FetchType.LAZY)
    private AnamneseGestante anamneseGestante;
    @JoinColumn(name = "anamnese", referencedColumnName = "codigo")
    @ManyToOne(fetch = FetchType.LAZY)
    private Anamnese anamnese;
    @JoinColumn(name = "paciente", referencedColumnName = "codigo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Paciente paciente;

    public Dieta() {
    }

    public Dieta(Integer codigo) {
        this.codigo = codigo;
    }

    public Dieta(Integer codigo, String arquivo) {
        this.codigo = codigo;
        this.arquivo = arquivo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public Date getDataCad() {
        return dataCad;
    }

    public void setDataCad(Date dataCad) {
        this.dataCad = dataCad;
    }

    public AnamneseGestante getAnamneseGestante() {
        return anamneseGestante;
    }

    public void setAnamneseGestante(AnamneseGestante anamneseGestante) {
        this.anamneseGestante = anamneseGestante;
    }

    public Anamnese getAnamnese() {
        return anamnese;
    }

    public void setAnamnese(Anamnese anamnese) {
        this.anamnese = anamnese;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dieta)) {
            return false;
        }
        Dieta other = (Dieta) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.Dieta[ codigo=" + codigo + " ]";
    }
    
}
