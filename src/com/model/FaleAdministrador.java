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

/**
 * 
 * @author Alex
 */
@Entity
@Table(name = "fale_administrador")
@NamedQueries({ @NamedQuery(name = "FaleAdministrador.findAll", query = "SELECT f FROM FaleAdministrador f") })
public class FaleAdministrador implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "codigo")
	private Integer codigo;
	@Basic(optional = false)
	@Column(name = "titulo")
	private String titulo;
	@Basic(optional = false)
	@Lob
	@Column(name = "texto")
	private String texto;
	@Basic(optional = false)
	@Column(name = "datacad")
	@Temporal(TemporalType.DATE)
	private Date datacad;
	@Lob
	@Column(name = "resposta")
	private String resposta;
	@Column(name = "dataResposta")
	@Temporal(TemporalType.DATE)
	private Date dataResposta;
	@Basic(optional = false)
	@Column(name = "status")
	private String status;
	@Basic(optional = false)
	@Column(name = "lido")
	private String lido;
	@JoinColumn(name = "nutricionista", referencedColumnName = "codigo")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Nutricionista nutricionista;

	public FaleAdministrador() {
	}

	public FaleAdministrador(Integer codigo) {
		this.codigo = codigo;
	}

	public FaleAdministrador(Integer codigo, String titulo, String texto,
			Date datacad, String status, String lido) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.texto = texto;
		this.datacad = datacad;
		this.status = status;
		this.lido = lido;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public Date getDataResposta() {
		return dataResposta;
	}

	public void setDataResposta(Date dataResposta) {
		this.dataResposta = dataResposta;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLido() {
		return lido;
	}

	public void setLido(String lido) {
		this.lido = lido;
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
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof FaleAdministrador)) {
			return false;
		}
		FaleAdministrador other = (FaleAdministrador) object;
		if ((this.codigo == null && other.codigo != null)
				|| (this.codigo != null && !this.codigo.equals(other.codigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "javaapplication4.FaleAdministrador[ codigo=" + codigo + " ]";
	}

}
