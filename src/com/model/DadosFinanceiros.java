/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Alex
 */
@Entity
@Table(name = "dados_financeiros")
@NamedQueries({
    @NamedQuery(name = "DadosFinanceiros.findAll", query = "SELECT d FROM DadosFinanceiros d")})
public class DadosFinanceiros implements Serializable {
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
    @Column(name = "cedente")
    private String cedente;
    @Basic(optional = false)
    @Column(name = "cnpj_cpf")
    private String cnpjCpf;
    @Basic(optional = false)
    @Column(name = "endereco")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "cidade")
    private String cidade;
    @Basic(optional = false)
    @Lob
    @Column(name = "instrucoes")
    private String instrucoes;
    @Column(name = "aceite")
    private String aceite;
    @Basic(optional = false)
    @Column(name = "especie")
    private String especie;
    @Basic(optional = false)
    @Column(name = "especie_doc")
    private String especieDoc;
    @Basic(optional = false)
    @Column(name = "conta_dv")
    private int contaDv;

    public DadosFinanceiros() {
    }

    public DadosFinanceiros(Integer codigo) {
        this.codigo = codigo;
    }

    public DadosFinanceiros(Integer codigo, int agencia, int conta, int carteira, String cedente, String cnpjCpf, String endereco, String cidade, String instrucoes, String especie, String especieDoc, int contaDv) {
        this.codigo = codigo;
        this.agencia = agencia;
        this.conta = conta;
        this.carteira = carteira;
        this.cedente = cedente;
        this.cnpjCpf = cnpjCpf;
        this.endereco = endereco;
        this.cidade = cidade;
        this.instrucoes = instrucoes;
        this.especie = especie;
        this.especieDoc = especieDoc;
        this.contaDv = contaDv;
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

    public String getCedente() {
        return cedente;
    }

    public void setCedente(String cedente) {
        this.cedente = cedente;
    }

    public String getCnpjCpf() {
        return cnpjCpf;
    }

    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getInstrucoes() {
        return instrucoes;
    }

    public void setInstrucoes(String instrucoes) {
        this.instrucoes = instrucoes;
    }

    public String getAceite() {
        return aceite;
    }

    public void setAceite(String aceite) {
        this.aceite = aceite;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getEspecieDoc() {
        return especieDoc;
    }

    public void setEspecieDoc(String especieDoc) {
        this.especieDoc = especieDoc;
    }

    public int getContaDv() {
        return contaDv;
    }

    public void setContaDv(int contaDv) {
        this.contaDv = contaDv;
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
        if (!(object instanceof DadosFinanceiros)) {
            return false;
        }
        DadosFinanceiros other = (DadosFinanceiros) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.DadosFinanceiros[ codigo=" + codigo + " ]";
    }
    
}
