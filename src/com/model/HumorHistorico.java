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

import com.model.repository.paciente.Paciente;

/**
 *
 * @author Alex
 */
@Entity
@Table(name = "humor_historico")
@NamedQueries({
    @NamedQuery(name = "HumorHistorico.findAll", query = "SELECT h FROM HumorHistorico h")})
public class HumorHistorico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "humor")
    private String humor;
    @Lob
    @Column(name = "mensagem")
    private String mensagem;
    @Column(name = "dataCad")
    @Temporal(TemporalType.DATE)
    private Date dataCad;
    @OneToMany(mappedBy = "humor", fetch = FetchType.LAZY)
    private List<Recordatorio> recordatorioList;
    @JoinColumn(name = "paciente", referencedColumnName = "codigo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Paciente paciente;

    public HumorHistorico() {
    }

    public HumorHistorico(Integer codigo) {
        this.codigo = codigo;
    }

    public HumorHistorico(Integer codigo, String humor) {
        this.codigo = codigo;
        this.humor = humor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getHumor() {
        return humor;
    }

    public void setHumor(String humor) {
        this.humor = humor;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Date getDataCad() {
        return dataCad;
    }

    public void setDataCad(Date dataCad) {
        this.dataCad = dataCad;
    }

    public List<Recordatorio> getRecordatorioList() {
        return recordatorioList;
    }

    public void setRecordatorioList(List<Recordatorio> recordatorioList) {
        this.recordatorioList = recordatorioList;
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
        if (!(object instanceof HumorHistorico)) {
            return false;
        }
        HumorHistorico other = (HumorHistorico) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.HumorHistorico[ codigo=" + codigo + " ]";
    }
    
}
