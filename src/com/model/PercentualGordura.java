/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Alex
 */
@Entity
@Table(name = "percentual_gordura")
@NamedQueries({
    @NamedQuery(name = "PercentualGordura.findAll", query = "SELECT p FROM PercentualGordura p")})
public class PercentualGordura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "sexo")
    private String sexo;
    @Basic(optional = false)
    @Column(name = "idade1")
    private int idade1;
    @Basic(optional = false)
    @Column(name = "idade2")
    private int idade2;
    @Basic(optional = false)
    @Column(name = "pregas")
    private int pregas;
    @Basic(optional = false)
    @Column(name = "valor")
    private double valor;

    public PercentualGordura() {
    }

    public PercentualGordura(Integer codigo) {
        this.codigo = codigo;
    }

    public PercentualGordura(Integer codigo, String sexo, int idade1, int idade2, int pregas, double valor) {
        this.codigo = codigo;
        this.sexo = sexo;
        this.idade1 = idade1;
        this.idade2 = idade2;
        this.pregas = pregas;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade1() {
        return idade1;
    }

    public void setIdade1(int idade1) {
        this.idade1 = idade1;
    }

    public int getIdade2() {
        return idade2;
    }

    public void setIdade2(int idade2) {
        this.idade2 = idade2;
    }

    public int getPregas() {
        return pregas;
    }

    public void setPregas(int pregas) {
        this.pregas = pregas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
        if (!(object instanceof PercentualGordura)) {
            return false;
        }
        PercentualGordura other = (PercentualGordura) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.PercentualGordura[ codigo=" + codigo + " ]";
    }
    
}
