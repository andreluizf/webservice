/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nutricao.models.repository.receita;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Alex
 */
@Entity
@Table(name = "receitas")
@XmlRootElement
public class Receitas  {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "codigo")
	private Integer codigo;
	@Basic(optional = false)
	@Column(name = "data")
	@Temporal(TemporalType.DATE)
	private Date data;
	@Basic(optional = false)
	@Column(name = "titulo")
	private String titulo;
	@Basic(optional = false)
	@Column(name = "resumo")
	private String resumo;
	@Basic(optional = false)
	@Lob
	@Column(name = "texto")
	private String texto;
	@Basic(optional = false)
	@Column(name = "ativo")
	private int ativo;
	@Lob
	@Column(name = "receita")
	private String receita;
	@Lob
	@Column(name = "link_imagem")
	private String linkImagem;

	// @JoinColumn(name = "nutricionista", referencedColumnName = "codigo")
	// @ManyToOne(optional = false, fetch = FetchType.LAZY)
	// private Nutricionista nutricionista;

	public Receitas() {
	}

	public Receitas(Integer codigo) {
		this.codigo = codigo;
	}

	public Receitas(Integer codigo, Date data, String titulo, String resumo,
			String texto, int ativo) {
		this.codigo = codigo;
		this.data = data;
		this.titulo = titulo;
		this.resumo = resumo;
		this.texto = texto;
		this.ativo = ativo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getAtivo() {
		return ativo;
	}

	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}

	public String getReceita() {
		return receita;
	}

	public void setReceita(String receita) {
		this.receita = receita;
	}

	public String getLinkImagem() {
		return linkImagem;
	}

	public void setLinkImagem(String linkImagem) {
		this.linkImagem = linkImagem;
	}

	// public Nutricionista getNutricionista() {
	// return nutricionista;
	// }
	//
	// public void setNutricionista(Nutricionista nutricionista) {
	// this.nutricionista = nutricionista;
	// }

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
		if (!(object instanceof Receitas)) {
			return false;
		}
		Receitas other = (Receitas) object;
		if ((this.codigo == null && other.codigo != null)
				|| (this.codigo != null && !this.codigo.equals(other.codigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "javaapplication4.Receitas[ codigo=" + codigo + " ]";
	}

}
