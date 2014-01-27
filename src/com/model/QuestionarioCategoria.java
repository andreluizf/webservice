/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Alex
 */
@Entity
@Table(name = "questionario_categoria")
@NamedQueries({
    @NamedQuery(name = "QuestionarioCategoria.findAll", query = "SELECT q FROM QuestionarioCategoria q")})
public class QuestionarioCategoria implements Serializable {
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
    @Column(name = "datacad")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datacad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria", fetch = FetchType.LAZY)
    private List<Questionario> questionarioList;

    public QuestionarioCategoria() {
    }

    public QuestionarioCategoria(Integer codigo) {
        this.codigo = codigo;
    }

    public QuestionarioCategoria(Integer codigo, String nome, Date datacad) {
        this.codigo = codigo;
        this.nome = nome;
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

    public Date getDatacad() {
        return datacad;
    }

    public void setDatacad(Date datacad) {
        this.datacad = datacad;
    }

    public List<Questionario> getQuestionarioList() {
        return questionarioList;
    }

    public void setQuestionarioList(List<Questionario> questionarioList) {
        this.questionarioList = questionarioList;
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
        if (!(object instanceof QuestionarioCategoria)) {
            return false;
        }
        QuestionarioCategoria other = (QuestionarioCategoria) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.QuestionarioCategoria[ codigo=" + codigo + " ]";
    }
    
}
