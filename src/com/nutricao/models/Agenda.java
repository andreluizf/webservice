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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.nutricao.models.repository.nutricionista.Nutricionista;


/**
 *
 * @author Alex
 */
@Entity
@Table(name = "agenda")
@NamedQueries({
    @NamedQuery(name = "Agenda.findAll", query = "SELECT a FROM Agenda a")})
public class Agenda implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "contato")
    private String contato;
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "telefone")
    private String telefone;
    @Lob
    @Column(name = "observacao")
    private String observacao;
    @Basic(optional = false)
    @Column(name = "datacad")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datacad;
    @JoinColumn(name = "nutricionista", referencedColumnName = "codigo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Nutricionista nutricionista;

    public Agenda() {
    }

    public Agenda(Integer codigo) {
        this.codigo = codigo;
    }

    public Agenda(Integer codigo, String nome, String contato, String telefone, Date datacad) {
        this.codigo = codigo;
        this.nome = nome;
        this.contato = contato;
        this.telefone = telefone;
        this.datacad = datacad;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getDatacad() {
        return datacad;
    }

    public void setDatacad(Date datacad) {
        this.datacad = datacad;
    }

    public Nutricionista getNutricionista() {
        return nutricionista;
    }

    public void setNutricionista(Nutricionista nutricionista) {
        this.nutricionista = nutricionista;
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
        if (!(object instanceof Agenda)) {
            return false;
        }
        Agenda other = (Agenda) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.Agenda[ codigo=" + codigo + " ]";
    }
    
}
