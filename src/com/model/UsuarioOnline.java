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
@Table(name = "usuario_online")
@NamedQueries({
    @NamedQuery(name = "UsuarioOnline.findAll", query = "SELECT u FROM UsuarioOnline u")})
public class UsuarioOnline implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "chave")
    private String chave;
    @Basic(optional = false)
    @Column(name = "usuario")
    private int usuario;
    @Basic(optional = false)
    @Column(name = "online")
    private int online;
    @Basic(optional = false)
    @Column(name = "ip")
    private String ip;
    @Basic(optional = false)
    @Column(name = "ultimoAcesso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimoAcesso;

    public UsuarioOnline() {
    }

    public UsuarioOnline(String chave) {
        this.chave = chave;
    }

    public UsuarioOnline(String chave, int usuario, int online, String ip, Date ultimoAcesso) {
        this.chave = chave;
        this.usuario = usuario;
        this.online = online;
        this.ip = ip;
        this.ultimoAcesso = ultimoAcesso;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getOnline() {
        return online;
    }

    public void setOnline(int online) {
        this.online = online;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getUltimoAcesso() {
        return ultimoAcesso;
    }

    public void setUltimoAcesso(Date ultimoAcesso) {
        this.ultimoAcesso = ultimoAcesso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chave != null ? chave.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioOnline)) {
            return false;
        }
        UsuarioOnline other = (UsuarioOnline) object;
        if ((this.chave == null && other.chave != null) || (this.chave != null && !this.chave.equals(other.chave))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.UsuarioOnline[ chave=" + chave + " ]";
    }
    
}
