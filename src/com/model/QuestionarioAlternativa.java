/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Alex
 */
@Entity
@Table(name = "questionario_alternativa")
@NamedQueries({
    @NamedQuery(name = "QuestionarioAlternativa.findAll", query = "SELECT q FROM QuestionarioAlternativa q")})
public class QuestionarioAlternativa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "valor")
    private int valor;
    @Basic(optional = false)
    @Column(name = "texto")
    private String texto;
    @Basic(optional = false)
    @Column(name = "datacad")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datacad;

    public QuestionarioAlternativa() {
    }

    public QuestionarioAlternativa(Integer codigo) {
        this.codigo = codigo;
    }

    public QuestionarioAlternativa(Integer codigo, int valor, String texto, Date datacad) {
        this.codigo = codigo;
        this.valor = valor;
        this.texto = texto;
        this.datacad = datacad;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getDatacad() {
        return datacad;
    }

    public void setDatacad(Date datacad) {
        this.datacad = datacad;
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
        if (!(object instanceof QuestionarioAlternativa)) {
            return false;
        }
        QuestionarioAlternativa other = (QuestionarioAlternativa) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.QuestionarioAlternativa[ codigo=" + codigo + " ]";
    }
    
}
