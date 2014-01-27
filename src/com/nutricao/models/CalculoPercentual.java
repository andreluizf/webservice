/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nutricao.models;

import java.io.Serializable;

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

import com.nutricao.models.repository.paciente.Paciente;


/**
 *
 * @author Alex
 */
@Entity
@Table(name = "calculo_percentual")
@NamedQueries({
    @NamedQuery(name = "CalculoPercentual.findAll", query = "SELECT c FROM CalculoPercentual c")})
public class CalculoPercentual implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "resultado")
    private String resultado;
    @JoinColumn(name = "paciente", referencedColumnName = "codigo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Paciente paciente;

    public CalculoPercentual() {
    }

    public CalculoPercentual(Integer codigo) {
        this.codigo = codigo;
    }

    public CalculoPercentual(Integer codigo, String resultado) {
        this.codigo = codigo;
        this.resultado = resultado;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
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
        if (!(object instanceof CalculoPercentual)) {
            return false;
        }
        CalculoPercentual other = (CalculoPercentual) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.CalculoPercentual[ codigo=" + codigo + " ]";
    }
    
}
