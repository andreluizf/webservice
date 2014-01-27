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

import com.model.repository.nutricionista.Nutricionista;
import com.model.repository.paciente.Paciente;

/**
 *
 * @author Alex
 */
@Entity
@Table(name = "duvida")
@NamedQueries({
    @NamedQuery(name = "Duvida.findAll", query = "SELECT d FROM Duvida d")})
public class Duvida implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "dataPergunta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataPergunta;
    @Basic(optional = false)
    @Lob
    @Column(name = "pergunta")
    private String pergunta;
    @Column(name = "dataResposta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataResposta;
    @Lob
    @Column(name = "resposta")
    private String resposta;
    @Basic(optional = false)
    @Column(name = "lido")
    private String lido;
    @Basic(optional = false)
    @Column(name = "ativo")
    private String ativo;
    @JoinColumn(name = "nutricionista", referencedColumnName = "codigo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Nutricionista nutricionista;
    @JoinColumn(name = "paciente", referencedColumnName = "codigo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Paciente paciente;

    public Duvida() {
    }

    public Duvida(Integer codigo) {
        this.codigo = codigo;
    }

    public Duvida(Integer codigo, Date dataPergunta, String pergunta, String lido, String ativo) {
        this.codigo = codigo;
        this.dataPergunta = dataPergunta;
        this.pergunta = pergunta;
        this.lido = lido;
        this.ativo = ativo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getDataPergunta() {
        return dataPergunta;
    }

    public void setDataPergunta(Date dataPergunta) {
        this.dataPergunta = dataPergunta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public Date getDataResposta() {
        return dataResposta;
    }

    public void setDataResposta(Date dataResposta) {
        this.dataResposta = dataResposta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
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

    public Nutricionista getNutricionista() {
        return nutricionista;
    }

    public void setNutricionista(Nutricionista nutricionista) {
        this.nutricionista = nutricionista;
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
        if (!(object instanceof Duvida)) {
            return false;
        }
        Duvida other = (Duvida) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.Duvida[ codigo=" + codigo + " ]";
    }
    
}
