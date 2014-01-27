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
import javax.persistence.CascadeType;
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
@Table(name = "anamnese")
@NamedQueries({
    @NamedQuery(name = "Anamnese.findAll", query = "SELECT a FROM Anamnese a")})
public class Anamnese implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "dataCad")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "peso")
    private Double peso;
    @Basic(optional = false)
    @Column(name = "altura")
    private double altura;
    @Column(name = "cintura")
    private Integer cintura;
    @Column(name = "cintura2")
    private Integer cintura2;
    @Column(name = "cb")
    private String cb;
    @Column(name = "gordura")
    private String gordura;
    @Column(name = "objetivo")
    private String objetivo;
    @Lob
    @Column(name = "obs")
    private String obs;
    @Column(name = "retorno")
    private Integer retorno;
    @Basic(optional = false)
    @Column(name = "grafico")
    private String grafico;
    @Column(name = "atividade")
    private String atividade;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anamnese", fetch = FetchType.LAZY)
    private List<Exames> examesList;
    @OneToMany(mappedBy = "anamnese", fetch = FetchType.LAZY)
    private List<Dieta> dietaList;
    @OneToMany(mappedBy = "anamnese", fetch = FetchType.LAZY)
    private List<Arquivo> arquivoList;
    @JoinColumn(name = "retornos", referencedColumnName = "codigo")
    @ManyToOne(fetch = FetchType.LAZY)
    private Retorno retornos;
    @JoinColumn(name = "paciente", referencedColumnName = "codigo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Paciente paciente;

    public Anamnese() {
    }

    public Anamnese(Integer codigo) {
        this.codigo = codigo;
    }

    public Anamnese(Integer codigo, Date dataCad, double altura, String grafico) {
        this.codigo = codigo;
        this.dataCad = dataCad;
        this.altura = altura;
        this.grafico = grafico;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getDataCad() {
        return dataCad;
    }

    public void setDataCad(Date dataCad) {
        this.dataCad = dataCad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Integer getCintura() {
        return cintura;
    }

    public void setCintura(Integer cintura) {
        this.cintura = cintura;
    }

    public Integer getCintura2() {
        return cintura2;
    }

    public void setCintura2(Integer cintura2) {
        this.cintura2 = cintura2;
    }

    public String getCb() {
        return cb;
    }

    public void setCb(String cb) {
        this.cb = cb;
    }

    public String getGordura() {
        return gordura;
    }

    public void setGordura(String gordura) {
        this.gordura = gordura;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Integer getRetorno() {
        return retorno;
    }

    public void setRetorno(Integer retorno) {
        this.retorno = retorno;
    }

    public String getGrafico() {
        return grafico;
    }

    public void setGrafico(String grafico) {
        this.grafico = grafico;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public List<Exames> getExamesList() {
        return examesList;
    }

    public void setExamesList(List<Exames> examesList) {
        this.examesList = examesList;
    }

    public List<Dieta> getDietaList() {
        return dietaList;
    }

    public void setDietaList(List<Dieta> dietaList) {
        this.dietaList = dietaList;
    }

    public List<Arquivo> getArquivoList() {
        return arquivoList;
    }

    public void setArquivoList(List<Arquivo> arquivoList) {
        this.arquivoList = arquivoList;
    }

    public Retorno getRetornos() {
        return retornos;
    }

    public void setRetornos(Retorno retornos) {
        this.retornos = retornos;
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
        if (!(object instanceof Anamnese)) {
            return false;
        }
        Anamnese other = (Anamnese) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.Anamnese[ codigo=" + codigo + " ]";
    }
    
}
