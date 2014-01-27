/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.repository.nutricionista;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "nutricionista")
@NamedQueries({
    @NamedQuery(name = "Nutricionista.findAll", query = "SELECT n FROM Nutricionista n")})
public class Nutricionista implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "crn")
    private String crn;
    @Basic(optional = false)
    @Column(name = "regiao")
    private String regiao;
    @Basic(optional = false)
    @Column(name = "nome_clinica")
    private String nomeClinica;
    @Basic(optional = false)
    @Column(name = "subdominio")
    private String subdominio;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "sexo")
    private String sexo;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "celular")
    private String celular;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "rg")
    private String rg;
    @Basic(optional = false)
    @Column(name = "cep")
    private String cep;
    @Basic(optional = false)
    @Column(name = "logradouro")
    private String logradouro;
    @Basic(optional = false)
    @Column(name = "numero")
    private String numero;
    @Basic(optional = false)
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "complemento")
    private String complemento;
    @Basic(optional = false)
    @Column(name = "cidade")
    private String cidade;
    @Basic(optional = false)
    @Column(name = "uf")
    private String uf;
    @Basic(optional = false)
    @Column(name = "pais")
    private String pais;
    @Basic(optional = false)
    @Column(name = "idioma")
    private String idioma;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorMensalidade")
    private Double valorMensalidade;
    @Column(name = "dataInicio")
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Column(name = "dataFimTeste")
    @Temporal(TemporalType.DATE)
    private Date dataFimTeste;
    @Column(name = "diaVencimentoBoleto")
    private String diaVencimentoBoleto;
    @Basic(optional = false)
    @Column(name = "gratuito")
    private String gratuito;
    @Column(name = "imagem")
    private String imagem;
    @Basic(optional = false)
    @Column(name = "ativo")
    private String ativo;
    @Basic(optional = false)
    @Column(name = "mail_ativo")
    private String mailAtivo;
    @Basic(optional = false)
    @Column(name = "mailing")
    private int mailing;
    @Basic(optional = false)
    @Column(name = "cor")
    private int cor;
    @Basic(optional = false)
    @Column(name = "pago")
    private int pago;
//    @JoinColumn(name = "usuario", referencedColumnName = "codigo")
//    @OneToOne(fetch = FetchType.LAZY)
//    private Usuario usuario;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nutricionista", fetch = FetchType.LAZY)
//    private List<Receitas> receitasList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nutricionista", fetch = FetchType.LAZY)
//    private List<Download> downloadList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nutricionista", fetch = FetchType.LAZY)
//    private List<UsuarioInvalido> usuarioInvalidoList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nutricionista", fetch = FetchType.LAZY)
//    private List<Recordatorio> recordatorioList;
//    @OneToMany(mappedBy = "nutricionista", fetch = FetchType.LAZY)
//    private List<Newsletter> newsletterList;
//    @OneToMany(mappedBy = "nutricionista", fetch = FetchType.LAZY)
//    private List<Historico> historicoList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nutricionista", fetch = FetchType.LAZY)
//    private List<Financeiro> financeiroList;
//    @OneToMany(mappedBy = "nutricionista", fetch = FetchType.LAZY)
//    private List<Paciente> pacienteList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nutricionista", fetch = FetchType.LAZY)
//    private List<Boleto> boletoList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nutricionista", fetch = FetchType.LAZY)
//    private List<EmailComemorativo> emailComemorativoList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nutricionista", fetch = FetchType.LAZY)
//    private List<FaleAdministrador> faleAdministradorList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nutricionista", fetch = FetchType.LAZY)
//    private List<ArtigosNoticias> artigosNoticiasList;
//    @OneToMany(mappedBy = "nutricionista", fetch = FetchType.LAZY)
//    private List<Dica> dicaList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nutricionista", fetch = FetchType.LAZY)
//    private List<Duvida> duvidaList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nutricionista", fetch = FetchType.LAZY)
//    private List<Agenda> agendaList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nutricionista", fetch = FetchType.LAZY)
//    private List<Lembrete> lembreteList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nutricionista", fetch = FetchType.LAZY)
//    private List<Tabela> tabelaList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nutricionista", fetch = FetchType.LAZY)
//    private List<Prescricao> prescricaoList;

    public Nutricionista() {
    }

    public Nutricionista(Integer codigo) {
        this.codigo = codigo;
    }

    public Nutricionista(Integer codigo, String regiao, String nomeClinica, String subdominio, String nome, String sexo, String email, String telefone, String cep, String logradouro, String numero, String bairro, String cidade, String uf, String pais, String idioma, String gratuito, String ativo, String mailAtivo, int mailing, int cor, int pago) {
        this.codigo = codigo;
        this.regiao = regiao;
        this.nomeClinica = nomeClinica;
        this.subdominio = subdominio;
        this.nome = nome;
        this.sexo = sexo;
        this.email = email;
        this.telefone = telefone;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.pais = pais;
        this.idioma = idioma;
        this.gratuito = gratuito;
        this.ativo = ativo;
        this.mailAtivo = mailAtivo;
        this.mailing = mailing;
        this.cor = cor;
        this.pago = pago;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getNomeClinica() {
        return nomeClinica;
    }

    public void setNomeClinica(String nomeClinica) {
        this.nomeClinica = nomeClinica;
    }

    public String getSubdominio() {
        return subdominio;
    }

    public void setSubdominio(String subdominio) {
        this.subdominio = subdominio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Double getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(Double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFimTeste() {
        return dataFimTeste;
    }

    public void setDataFimTeste(Date dataFimTeste) {
        this.dataFimTeste = dataFimTeste;
    }

    public String getDiaVencimentoBoleto() {
        return diaVencimentoBoleto;
    }

    public void setDiaVencimentoBoleto(String diaVencimentoBoleto) {
        this.diaVencimentoBoleto = diaVencimentoBoleto;
    }

    public String getGratuito() {
        return gratuito;
    }

    public void setGratuito(String gratuito) {
        this.gratuito = gratuito;
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

    public String getMailAtivo() {
        return mailAtivo;
    }

    public void setMailAtivo(String mailAtivo) {
        this.mailAtivo = mailAtivo;
    }

    public int getMailing() {
        return mailing;
    }

    public void setMailing(int mailing) {
        this.mailing = mailing;
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }

//    public Usuario getUsuario() {
//        return usuario;
//    }
//
//    public void setUsuario(Usuario usuario) {
//        this.usuario = usuario;
//    }
//
//    public List<Receitas> getReceitasList() {
//        return receitasList;
//    }
//
//    public void setReceitasList(List<Receitas> receitasList) {
//        this.receitasList = receitasList;
//    }
//
//    public List<Download> getDownloadList() {
//        return downloadList;
//    }
//
//    public void setDownloadList(List<Download> downloadList) {
//        this.downloadList = downloadList;
//    }
//
//    public List<UsuarioInvalido> getUsuarioInvalidoList() {
//        return usuarioInvalidoList;
//    }
//
//    public void setUsuarioInvalidoList(List<UsuarioInvalido> usuarioInvalidoList) {
//        this.usuarioInvalidoList = usuarioInvalidoList;
//    }
//
//    public List<Recordatorio> getRecordatorioList() {
//        return recordatorioList;
//    }
//
//    public void setRecordatorioList(List<Recordatorio> recordatorioList) {
//        this.recordatorioList = recordatorioList;
//    }
//
//    public List<Newsletter> getNewsletterList() {
//        return newsletterList;
//    }
//
//    public void setNewsletterList(List<Newsletter> newsletterList) {
//        this.newsletterList = newsletterList;
//    }
//
//    public List<Historico> getHistoricoList() {
//        return historicoList;
//    }
//
//    public void setHistoricoList(List<Historico> historicoList) {
//        this.historicoList = historicoList;
//    }
//
//    public List<Financeiro> getFinanceiroList() {
//        return financeiroList;
//    }
//
//    public void setFinanceiroList(List<Financeiro> financeiroList) {
//        this.financeiroList = financeiroList;
//    }
//
//    public List<Paciente> getPacienteList() {
//        return pacienteList;
//    }
//
//    public void setPacienteList(List<Paciente> pacienteList) {
//        this.pacienteList = pacienteList;
//    }
//
//    public List<Boleto> getBoletoList() {
//        return boletoList;
//    }
//
//    public void setBoletoList(List<Boleto> boletoList) {
//        this.boletoList = boletoList;
//    }
//
//    public List<EmailComemorativo> getEmailComemorativoList() {
//        return emailComemorativoList;
//    }
//
//    public void setEmailComemorativoList(List<EmailComemorativo> emailComemorativoList) {
//        this.emailComemorativoList = emailComemorativoList;
//    }
//
//    public List<FaleAdministrador> getFaleAdministradorList() {
//        return faleAdministradorList;
//    }
//
//    public void setFaleAdministradorList(List<FaleAdministrador> faleAdministradorList) {
//        this.faleAdministradorList = faleAdministradorList;
//    }
//
//    public List<ArtigosNoticias> getArtigosNoticiasList() {
//        return artigosNoticiasList;
//    }
//
//    public void setArtigosNoticiasList(List<ArtigosNoticias> artigosNoticiasList) {
//        this.artigosNoticiasList = artigosNoticiasList;
//    }
//
//    public List<Dica> getDicaList() {
//        return dicaList;
//    }
//
//    public void setDicaList(List<Dica> dicaList) {
//        this.dicaList = dicaList;
//    }
//
//    public List<Duvida> getDuvidaList() {
//        return duvidaList;
//    }
//
//    public void setDuvidaList(List<Duvida> duvidaList) {
//        this.duvidaList = duvidaList;
//    }
//
//    public List<Agenda> getAgendaList() {
//        return agendaList;
//    }
//
//    public void setAgendaList(List<Agenda> agendaList) {
//        this.agendaList = agendaList;
//    }
//
//    public List<Lembrete> getLembreteList() {
//        return lembreteList;
//    }
//
//    public void setLembreteList(List<Lembrete> lembreteList) {
//        this.lembreteList = lembreteList;
//    }
//
//    public List<Tabela> getTabelaList() {
//        return tabelaList;
//    }
//
//    public void setTabelaList(List<Tabela> tabelaList) {
//        this.tabelaList = tabelaList;
//    }
//
//    public List<Prescricao> getPrescricaoList() {
//        return prescricaoList;
//    }
//
//    public void setPrescricaoList(List<Prescricao> prescricaoList) {
//        this.prescricaoList = prescricaoList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nutricionista)) {
            return false;
        }
        Nutricionista other = (Nutricionista) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.Nutricionista[ codigo=" + codigo + " ]";
    }
    
}
