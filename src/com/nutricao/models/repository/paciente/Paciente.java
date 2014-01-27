/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nutricao.models.repository.paciente;

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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import com.nutricao.models.repository.mensagem.Mensagem;
import com.nutricao.models.repository.usuario.Usuario;




/**
 * 
 * @author Alex
 */
@Entity
@Table(name = "paciente")
@XmlRootElement
public class Paciente{
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
	@Column(name = "sexo")
	private String sexo;
	@Column(name = "gestante")
	private String gestante;
	@Column(name = "nascimento")
	@Temporal(TemporalType.DATE)
	private Date nascimento;
	@Column(name = "telefone")
	private String telefone;
	@Column(name = "celular")
	private String celular;
	@Basic(optional = false)
	@Column(name = "cidade")
	private String cidade;
	@Basic(optional = false)
	@Column(name = "uf")
	private String uf;
	@Column(name = "profissao")
	private String profissao;
	@Column(name = "convenio")
	private String convenio;
	@Column(name = "dataCad")
	@Temporal(TemporalType.DATE)
	private Date dataCad;
	@Column(name = "email")
	private String email;
	@Basic(optional = false)
	@Column(name = "newsletter")
	private String newsletter;
	@Basic(optional = false)
	@Column(name = "redesocial")
	private int redesocial;
	@Basic(optional = false)
	@Column(name = "mailing")
	private int mailing;
	@Basic(optional = false)
	@Column(name = "ativo")
	private int ativo;
	@Basic(optional = false)
	@Column(name = "nutri")
	private String nutri;
	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente", fetch =
	// FetchType.LAZY)
	// private List<Atualizacao> atualizacaoList;
	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente", fetch =
	// FetchType.LAZY)
	// private List<Exames> examesList;
	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente", fetch =
	// FetchType.LAZY)
	// private List<Recordatorio> recordatorioList;
	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente", fetch =
	// FetchType.LAZY)
	// private List<CalculoPercentual> calculoPercentualList;
	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente", fetch =
	// FetchType.LAZY)
	// private List<Comentario> comentarioList;
	 @JoinColumn(name = "usuario", referencedColumnName = "codigo")
	 @OneToOne(fetch = FetchType.LAZY)
	 private Usuario usuario;
	// @JoinColumn(name = "nutricionista", referencedColumnName = "codigo")
	// @ManyToOne(fetch = FetchType.LAZY)
	// private Nutricionista nutricionista;
	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente", fetch =
	// FetchType.LAZY)
	// private List<Objetivo> objetivoList;
	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente", fetch =
	// FetchType.LAZY)
	// private List<Retorno> retornoList;
	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente", fetch =
	// FetchType.LAZY)
	// private List<AnamneseGestante> anamneseGestanteList;
	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente", fetch =
	// FetchType.LAZY)
	// private List<AtualizacaoComentario> atualizacaoComentarioList;
	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente", fetch =
	// FetchType.LAZY)
	// private List<Gestante> gestanteList;
	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente", fetch =
	// FetchType.LAZY)
	// private List<Duvida> duvidaList;
	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente", fetch =
	// FetchType.LAZY)
	// private List<Dieta> dietaList;
	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente", fetch =
	// FetchType.LAZY)
	// private List<Arquivo> arquivoList;
	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente", fetch =
	// FetchType.LAZY)
	// private List<GaleriaImg> galeriaImgList;
	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente", fetch =
	// FetchType.LAZY)
	// private List<Anamnese> anamneseList;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente", fetch = FetchType.LAZY)
	private List<Mensagem> mensagemList;

	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente", fetch =
	// FetchType.LAZY)
	// private List<QuestionarioResposta> questionarioRespostaList;
	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente", fetch =
	// FetchType.LAZY)
	// private List<HumorHistorico> humorHistoricoList;

	public Paciente() {
	}

	public Paciente(Integer codigo) {
		this.codigo = codigo;
	}

	public Paciente(Integer codigo, String nome, String sexo, String cidade,
			String uf, String newsletter, int redesocial, int mailing,
			int ativo, String nutri) {
		this.codigo = codigo;
		this.nome = nome;
		this.sexo = sexo;
		this.cidade = cidade;
		this.uf = uf;
		this.newsletter = newsletter;
		this.redesocial = redesocial;
		this.mailing = mailing;
		this.ativo = ativo;
		this.nutri = nutri;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getGestante() {
		return gestante;
	}

	public void setGestante(String gestante) {
		this.gestante = gestante;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
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

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public Date getDataCad() {
		return dataCad;
	}

	public void setDataCad(Date dataCad) {
		this.dataCad = dataCad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNewsletter() {
		return newsletter;
	}

	public void setNewsletter(String newsletter) {
		this.newsletter = newsletter;
	}

	public int getRedesocial() {
		return redesocial;
	}

	public void setRedesocial(int redesocial) {
		this.redesocial = redesocial;
	}

	public int getMailing() {
		return mailing;
	}

	public void setMailing(int mailing) {
		this.mailing = mailing;
	}

	public int getAtivo() {
		return ativo;
	}

	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}

	public String getNutri() {
		return nutri;
	}

	public void setNutri(String nutri) {
		this.nutri = nutri;
	}

	// public List<Atualizacao> getAtualizacaoList() {
	// return atualizacaoList;
	// }
	//
	// public void setAtualizacaoList(List<Atualizacao> atualizacaoList) {
	// this.atualizacaoList = atualizacaoList;
	// }
	//
	// public List<Exames> getExamesList() {
	// return examesList;
	// }
	//
	// public void setExamesList(List<Exames> examesList) {
	// this.examesList = examesList;
	// }
	//
	// public List<Recordatorio> getRecordatorioList() {
	// return recordatorioList;
	// }
	//
	// public void setRecordatorioList(List<Recordatorio> recordatorioList) {
	// this.recordatorioList = recordatorioList;
	// }
	//
	// public List<CalculoPercentual> getCalculoPercentualList() {
	// return calculoPercentualList;
	// }
	//
	// public void setCalculoPercentualList(List<CalculoPercentual>
	// calculoPercentualList) {
	// this.calculoPercentualList = calculoPercentualList;
	// }
	//
	// public List<Comentario> getComentarioList() {
	// return comentarioList;
	// }
	//
	// public void setComentarioList(List<Comentario> comentarioList) {
	// this.comentarioList = comentarioList;
	// }
	//
	// public Usuario getUsuario() {
	// return usuario;
	// }
	//
	// public void setUsuario(Usuario usuario) {
	// this.usuario = usuario;
	// }
	//
	// public Nutricionista getNutricionista() {
	// return nutricionista;
	// }
	//
	// public void setNutricionista(Nutricionista nutricionista) {
	// this.nutricionista = nutricionista;
	// }
	//
	// public List<Objetivo> getObjetivoList() {
	// return objetivoList;
	// }
	//
	// public void setObjetivoList(List<Objetivo> objetivoList) {
	// this.objetivoList = objetivoList;
	// }
	//
	// public List<Retorno> getRetornoList() {
	// return retornoList;
	// }
	//
	// public void setRetornoList(List<Retorno> retornoList) {
	// this.retornoList = retornoList;
	// }
	//
	// public List<AnamneseGestante> getAnamneseGestanteList() {
	// return anamneseGestanteList;
	// }
	//
	// public void setAnamneseGestanteList(List<AnamneseGestante>
	// anamneseGestanteList) {
	// this.anamneseGestanteList = anamneseGestanteList;
	// }
	//
	// public List<AtualizacaoComentario> getAtualizacaoComentarioList() {
	// return atualizacaoComentarioList;
	// }
	//
	// public void setAtualizacaoComentarioList(List<AtualizacaoComentario>
	// atualizacaoComentarioList) {
	// this.atualizacaoComentarioList = atualizacaoComentarioList;
	// }
	//
	// public List<Gestante> getGestanteList() {
	// return gestanteList;
	// }
	//
	// public void setGestanteList(List<Gestante> gestanteList) {
	// this.gestanteList = gestanteList;
	// }
	//
	// public List<Duvida> getDuvidaList() {
	// return duvidaList;
	// }
	//
	// public void setDuvidaList(List<Duvida> duvidaList) {
	// this.duvidaList = duvidaList;
	// }
	//
	// public List<Dieta> getDietaList() {
	// return dietaList;
	// }
	//
	// public void setDietaList(List<Dieta> dietaList) {
	// this.dietaList = dietaList;
	// }
	//
	// public List<Arquivo> getArquivoList() {
	// return arquivoList;
	// }
	//
	// public void setArquivoList(List<Arquivo> arquivoList) {
	// this.arquivoList = arquivoList;
	// }
	//
	// public List<GaleriaImg> getGaleriaImgList() {
	// return galeriaImgList;
	// }
	//
	// public void setGaleriaImgList(List<GaleriaImg> galeriaImgList) {
	// this.galeriaImgList = galeriaImgList;
	// }
	//
	// public List<Anamnese> getAnamneseList() {
	// return anamneseList;
	// }
	//
	// public void setAnamneseList(List<Anamnese> anamneseList) {
	// this.anamneseList = anamneseList;
	// }

	// public List<Mensagem> getMensagemList() {
	// return mensagemList;
	// }
	//
	// public void setMensagemList(List<Mensagem> mensagemList) {
	// this.mensagemList = mensagemList;
	// }

	// public List<QuestionarioResposta> getQuestionarioRespostaList() {
	// return questionarioRespostaList;
	// }
	//
	// public void setQuestionarioRespostaList(List<QuestionarioResposta>
	// questionarioRespostaList) {
	// this.questionarioRespostaList = questionarioRespostaList;
	// }
	//
	// public List<HumorHistorico> getHumorHistoricoList() {
	// return humorHistoricoList;
	// }
	//
	// public void setHumorHistoricoList(List<HumorHistorico>
	// humorHistoricoList) {
	// this.humorHistoricoList = humorHistoricoList;
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
		if (!(object instanceof Paciente)) {
			return false;
		}
		Paciente other = (Paciente) object;
		if ((this.codigo == null && other.codigo != null)
				|| (this.codigo != null && !this.codigo.equals(other.codigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "javaapplication4.Paciente[ codigo=" + codigo + " ]";
	}

}
