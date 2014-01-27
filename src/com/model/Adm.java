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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Alex
 */
@Entity
@Table(name = "adm")
@NamedQueries({
    @NamedQuery(name = "Adm.findAll", query = "SELECT a FROM Adm a")})
public class Adm implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "valorMensalidadePadrao")
    private double valorMensalidadePadrao;
    @Basic(optional = false)
    @Column(name = "diasDeTeste")
    private int diasDeTeste;
    @Basic(optional = false)
    @Column(name = "bloquearAposVencimento")
    private int bloquearAposVencimento;
    @Lob
    @Column(name = "manual")
    private String manual;
    @Column(name = "email")
    private String email;

    public Adm() {
    }

    public Adm(Integer codigo) {
        this.codigo = codigo;
    }

    public Adm(Integer codigo, double valorMensalidadePadrao, int diasDeTeste, int bloquearAposVencimento) {
        this.codigo = codigo;
        this.valorMensalidadePadrao = valorMensalidadePadrao;
        this.diasDeTeste = diasDeTeste;
        this.bloquearAposVencimento = bloquearAposVencimento;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public double getValorMensalidadePadrao() {
        return valorMensalidadePadrao;
    }

    public void setValorMensalidadePadrao(double valorMensalidadePadrao) {
        this.valorMensalidadePadrao = valorMensalidadePadrao;
    }

    public int getDiasDeTeste() {
        return diasDeTeste;
    }

    public void setDiasDeTeste(int diasDeTeste) {
        this.diasDeTeste = diasDeTeste;
    }

    public int getBloquearAposVencimento() {
        return bloquearAposVencimento;
    }

    public void setBloquearAposVencimento(int bloquearAposVencimento) {
        this.bloquearAposVencimento = bloquearAposVencimento;
    }

    public String getManual() {
        return manual;
    }

    public void setManual(String manual) {
        this.manual = manual;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        if (!(object instanceof Adm)) {
            return false;
        }
        Adm other = (Adm) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.Adm[ codigo=" + codigo + " ]";
    }
    
}
