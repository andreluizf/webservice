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
@Table(name = "historico")
@NamedQueries({
    @NamedQuery(name = "Historico.findAll", query = "SELECT h FROM Historico h")})
public class Historico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "tabela")
    private String tabela;
    @Basic(optional = false)
    @Column(name = "tabelaCodigo")
    private int tabelaCodigo;
    @Column(name = "tabelaTitulo")
    private String tabelaTitulo;
    @Basic(optional = false)
    @Column(name = "acao")
    private String acao;
    @Lob
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "usuario")
    private Integer usuario;
    @Basic(optional = false)
    @Column(name = "ip")
    private String ip;
    @Basic(optional = false)
    @Column(name = "datacad")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datacad;
    @JoinColumn(name = "nutricionista", referencedColumnName = "codigo")
    @ManyToOne(fetch = FetchType.LAZY)
    private Nutricionista nutricionista;

    public Historico() {
    }

    public Historico(Integer codigo) {
        this.codigo = codigo;
    }

    public Historico(Integer codigo, String tabela, int tabelaCodigo, String acao, String ip, Date datacad) {
        this.codigo = codigo;
        this.tabela = tabela;
        this.tabelaCodigo = tabelaCodigo;
        this.acao = acao;
        this.ip = ip;
        this.datacad = datacad;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTabela() {
        return tabela;
    }

    public void setTabela(String tabela) {
        this.tabela = tabela;
    }

    public int getTabelaCodigo() {
        return tabelaCodigo;
    }

    public void setTabelaCodigo(int tabelaCodigo) {
        this.tabelaCodigo = tabelaCodigo;
    }

    public String getTabelaTitulo() {
        return tabelaTitulo;
    }

    public void setTabelaTitulo(String tabelaTitulo) {
        this.tabelaTitulo = tabelaTitulo;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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
        if (!(object instanceof Historico)) {
            return false;
        }
        Historico other = (Historico) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.Historico[ codigo=" + codigo + " ]";
    }
    
}
