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
@Table(name = "anamnese_gestante")
@NamedQueries({
    @NamedQuery(name = "AnamneseGestante.findAll", query = "SELECT a FROM AnamneseGestante a")})
public class AnamneseGestante implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "pesoPreGestacional")
    private String pesoPreGestacional;
    @Column(name = "dataParto")
    @Temporal(TemporalType.DATE)
    private Date dataParto;
    @Column(name = "semana_gestacional")
    private String semanaGestacional;
    @Column(name = "peso")
    private String peso;
    @Basic(optional = false)
    @Column(name = "altura")
    private String altura;
    @Column(name = "cintura")
    private String cintura;
    @Column(name = "cintura2")
    private String cintura2;
    @Column(name = "gordura")
    private String gordura;
    @Column(name = "objetivo")
    private String objetivo;
    @Lob
    @Column(name = "observacoes")
    private String observacoes;
    @Basic(optional = false)
    @Column(name = "datacad")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datacad;
    @Column(name = "retorno")
    private Integer retorno;
    @Lob
    @Column(name = "exames")
    private String exames;
    @Basic(optional = false)
    @Column(name = "grafico")
    private String grafico;
    @Column(name = "atividade")
    private String atividade;
    @JoinColumn(name = "retornos", referencedColumnName = "codigo")
    @ManyToOne(fetch = FetchType.LAZY)
    private Retorno retornos;
    @JoinColumn(name = "paciente", referencedColumnName = "codigo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Paciente paciente;
    @OneToMany(mappedBy = "anamneseGestante", fetch = FetchType.LAZY)
    private List<Dieta> dietaList;
    @OneToMany(mappedBy = "anamneseGestante", fetch = FetchType.LAZY)
    private List<Arquivo> arquivoList;

    public AnamneseGestante() {
    }

    public AnamneseGestante(Integer codigo) {
        this.codigo = codigo;
    }

    public AnamneseGestante(Integer codigo, String altura, Date datacad, String grafico) {
        this.codigo = codigo;
        this.altura = altura;
        this.datacad = datacad;
        this.grafico = grafico;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getPesoPreGestacional() {
        return pesoPreGestacional;
    }

    public void setPesoPreGestacional(String pesoPreGestacional) {
        this.pesoPreGestacional = pesoPreGestacional;
    }

    public Date getDataParto() {
        return dataParto;
    }

    public void setDataParto(Date dataParto) {
        this.dataParto = dataParto;
    }

    public String getSemanaGestacional() {
        return semanaGestacional;
    }

    public void setSemanaGestacional(String semanaGestacional) {
        this.semanaGestacional = semanaGestacional;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getCintura() {
        return cintura;
    }

    public void setCintura(String cintura) {
        this.cintura = cintura;
    }

    public String getCintura2() {
        return cintura2;
    }

    public void setCintura2(String cintura2) {
        this.cintura2 = cintura2;
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

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Date getDatacad() {
        return datacad;
    }

    public void setDatacad(Date datacad) {
        this.datacad = datacad;
    }

    public Integer getRetorno() {
        return retorno;
    }

    public void setRetorno(Integer retorno) {
        this.retorno = retorno;
    }

    public String getExames() {
        return exames;
    }

    public void setExames(String exames) {
        this.exames = exames;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnamneseGestante)) {
            return false;
        }
        AnamneseGestante other = (AnamneseGestante) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.AnamneseGestante[ codigo=" + codigo + " ]";
    }
    
}
