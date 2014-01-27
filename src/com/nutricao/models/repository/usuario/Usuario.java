/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nutricao.models.repository.usuario;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.nutricao.models.repository.paciente.Paciente;



/**
 * 
 * @author Alex
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
public class Usuario {
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
	@Column(name = "permissao")
	private String permissao;
	@Basic(optional = false)
	@Column(name = "login")
	private String login;
	@Basic(optional = false)
	@Column(name = "senha")
	private String senha;
	@Column(name = "imagem")
	private String imagem;
	@Basic(optional = false)
	@Column(name = "ativo")
	private String ativo;
	@Basic(optional = false)
	@Column(name = "atraso")
	private String atraso;
	@Basic(optional = false)
	@Column(name = "periodoTeste")
	private String periodoTeste;

	// @OneToOne(mappedBy = "usuario", fetch = FetchType.LAZY)
	// private Nutricionista nutricionista;
	 @OneToOne(mappedBy = "usuario", fetch = FetchType.LAZY)
	 private Paciente paciente;

	public Usuario() {
	}

	public Usuario(Integer codigo) {
		this.codigo = codigo;
	}

	public Usuario(Integer codigo, String nome, String permissao, String login,
			String senha, String ativo, String atraso, String periodoTeste) {
		this.codigo = codigo;
		this.nome = nome;
		this.permissao = permissao;
		this.login = login;
		this.senha = senha;
		this.ativo = ativo;
		this.atraso = atraso;
		this.periodoTeste = periodoTeste;
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

	public String getPermissao() {
		return permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	public String getAtraso() {
		return atraso;
	}

	public void setAtraso(String atraso) {
		this.atraso = atraso;
	}

	public String getPeriodoTeste() {
		return periodoTeste;
	}

	public void setPeriodoTeste(String periodoTeste) {
		this.periodoTeste = periodoTeste;
	}

	// public Nutricionista getNutricionista() {
	// return nutricionista;
	// }
	//
	// public void setNutricionista(Nutricionista nutricionista) {
	// this.nutricionista = nutricionista;
	// }

	// public Paciente getPaciente() {
	// return paciente;
	// }
	//
	// public void setPaciente(Paciente paciente) {
	// this.paciente = paciente;
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
		if (!(object instanceof Usuario)) {
			return false;
		}
		Usuario other = (Usuario) object;
		if ((this.codigo == null && other.codigo != null)
				|| (this.codigo != null && !this.codigo.equals(other.codigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "javaapplication4.Usuario[ codigo=" + codigo + " ]";
	}

}
