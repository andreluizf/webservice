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
import com.nutricao.models.repository.paciente.Paciente;


/**
 *
 * @author Alex
 */
@Entity
@Table(name = "recordatorio")
@NamedQueries({
    @NamedQuery(name = "Recordatorio.findAll", query = "SELECT r FROM Recordatorio r")})
public class Recordatorio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Lob
    @Column(name = "texto")
    private String texto;
    @Lob
    @Column(name = "resposta")
    private String resposta;
    @Column(name = "respostaData")
    @Temporal(TemporalType.TIMESTAMP)
    private Date respostaData;
    @Basic(optional = false)
    @Column(name = "lido")
    private String lido;
    @Basic(optional = false)
    @Column(name = "ativo")
    private String ativo;
    @Column(name = "dataCad")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCad;
    @Column(name = "lidoData")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lidoData;
    @JoinColumn(name = "nutricionista", referencedColumnName = "codigo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Nutricionista nutricionista;
    @JoinColumn(name = "humor", referencedColumnName = "codigo")
    @ManyToOne(fetch = FetchType.LAZY)
    private HumorHistorico humor;
    @JoinColumn(name = "paciente", referencedColumnName = "codigo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Paciente paciente;

    public Recordatorio() {
    }

    public Recordatorio(Integer codigo) {
        this.codigo = codigo;
    }

    public Recordatorio(Integer codigo, String texto, String lido, String ativo) {
        this.codigo = codigo;
        this.texto = texto;
        this.lido = lido;
        this.ativo = ativo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public Date getRespostaData() {
        return respostaData;
    }

    public void setRespostaData(Date respostaData) {
        this.respostaData = respostaData;
    }

    public String getLido() {
        return lido;
    }

    public void setLido(String lido) {
        this.lido = lido;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public Date getDataCad() {
        return dataCad;
    }

    public void setDataCad(Date dataCad) {
        this.dataCad = dataCad;
    }

    public Date getLidoData() {
        return lidoData;
    }

    public void setLidoData(Date lidoData) {
        this.lidoData = lidoData;
    }

    public Nutricionista getNutricionista() {
        return nutricionista;
    }

    public void setNutricionista(Nutricionista nutricionista) {
        this.nutricionista = nutricionista;
    }

    public HumorHistorico getHumor() {
        return humor;
    }

    public void setHumor(HumorHistorico humor) {
        this.humor = humor;
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
        if (!(object instanceof Recordatorio)) {
            return false;
        }
        Recordatorio other = (Recordatorio) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.Recordatorio[ codigo=" + codigo + " ]";
    }
    
}
