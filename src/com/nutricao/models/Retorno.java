/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nutricao.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.nutricao.models.repository.paciente.Paciente;


/**
 *
 * @author Alex
 */
@Entity
@Table(name = "retorno")
@NamedQueries({
    @NamedQuery(name = "Retorno.findAll", query = "SELECT r FROM Retorno r")})
public class Retorno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Basic(optional = false)
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @Basic(optional = false)
    @Column(name = "datacad")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datacad;
    @JoinColumn(name = "paciente", referencedColumnName = "codigo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Paciente paciente;
    @OneToMany(mappedBy = "retornos", fetch = FetchType.LAZY)
    private List<AnamneseGestante> anamneseGestanteList;
    @OneToMany(mappedBy = "retornos", fetch = FetchType.LAZY)
    private List<Anamnese> anamneseList;

    public Retorno() {
    }

    public Retorno(Integer codigo) {
        this.codigo = codigo;
    }

    public Retorno(Integer codigo, Date data, Date hora, Date datacad) {
        this.codigo = codigo;
        this.data = data;
        this.hora = hora;
        this.datacad = datacad;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Date getDatacad() {
        return datacad;
    }

    public void setDatacad(Date datacad) {
        this.datacad = datacad;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<AnamneseGestante> getAnamneseGestanteList() {
        return anamneseGestanteList;
    }

    public void setAnamneseGestanteList(List<AnamneseGestante> anamneseGestanteList) {
        this.anamneseGestanteList = anamneseGestanteList;
    }

    public List<Anamnese> getAnamneseList() {
        return anamneseList;
    }

    public void setAnamneseList(List<Anamnese> anamneseList) {
        this.anamneseList = anamneseList;
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
        if (!(object instanceof Retorno)) {
            return false;
        }
        Retorno other = (Retorno) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.Retorno[ codigo=" + codigo + " ]";
    }
    
}
