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
@Table(name = "boleto")
@NamedQueries({ @NamedQuery(name = "Boleto.findAll", query = "SELECT b FROM Boleto b") })
public class Boleto implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "codigo")
	private Integer codigo;
	@Basic(optional = false)
	@Column(name = "agencia")
	private int agencia;
	@Basic(optional = false)
	@Column(name = "conta")
	private int conta;
	@Basic(optional = false)
	@Column(name = "carteira")
	private int carteira;
	@Basic(optional = false)
	@Column(name = "cnpj_cpf")
	private String cnpjCpf;
	@Basic(optional = false)
	@Column(name = "conta_dv")
	private int contaDv;
	@Basic(optional = false)
	@Column(name = "numero")
	private int numero;
	@Basic(optional = false)
	@Column(name = "data")
	@Temporal(TemporalType.DATE)
	private Date data;
	@Basic(optional = false)
	@Column(name = "vencimento")
	@Temporal(TemporalType.DATE)
	private Date vencimento;
	@Basic(optional = false)
	@Column(name = "valor")
	private double valor;
	@Basic(optional = false)
	@Lob
	@Column(name = "demonstrativo")
	private String demonstrativo;
	@Basic(optional = false)
	@Column(name = "status")
	private String status;
	@JoinColumn(name = "nutricionista", referencedColumnName = "codigo")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Nutricionista nutricionista;

	public Boleto() {
	}

	public Boleto(Integer codigo) {
		this.codigo = codigo;
	}

	public Boleto(Integer codigo, int agencia, int conta, int carteira,
			String cnpjCpf, int contaDv, int numero, Date data,
			Date vencimento, double valor, String demonstrativo, String status) {
		this.codigo = codigo;
		this.agencia = agencia;
		this.conta = conta;
		this.carteira = carteira;
		this.cnpjCpf = cnpjCpf;
		this.contaDv = contaDv;
		this.numero = numero;
		this.data = data;
		this.vencimento = vencimento;
		this.valor = valor;
		this.demonstrativo = demonstrativo;
		this.status = status;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getCarteira() {
		return carteira;
	}

	public void setCarteira(int carteira) {
		this.carteira = carteira;
	}

	public String getCnpjCpf() {
		return cnpjCpf;
	}

	public void setCnpjCpf(String cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}

	public int getContaDv() {
		return contaDv;
	}

	public void setContaDv(int contaDv) {
		this.contaDv = contaDv;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDemonstrativo() {
		return demonstrativo;
	}

	public void setDemonstrativo(String demonstrativo) {
		this.demonstrativo = demonstrativo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
		if (!(object instanceof Boleto)) {
			return false;
		}
		Boleto other = (Boleto) object;
		if ((this.codigo == null && other.codigo != null)
				|| (this.codigo != null && !this.codigo.equals(other.codigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "javaapplication4.Boleto[ codigo=" + codigo + " ]";
	}

}
