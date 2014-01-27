package com.model.repository.mensagem;

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

import com.model.repository.paciente.Paciente;

@Entity
@Table(name = "mensagem")
@NamedQueries({ @NamedQuery(name = "Mensagem.findAll", query = "SELECT m FROM Mensagem m") })
public class Mensagem implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "codigo")
	private Integer codigo;
	@Basic(optional = false)
	@Lob
	@Column(name = "mensagem")
	private String mensagem;
	@Basic(optional = false)
	@Column(name = "datacad")
	@Temporal(TemporalType.TIMESTAMP)
	private Date datacad;
	@JoinColumn(name = "paciente", referencedColumnName = "codigo")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Paciente paciente;

	public Mensagem() {
	}

	public Mensagem(Integer codigo) {
		this.codigo = codigo;
	}

	public Mensagem(Integer codigo, String mensagem, Date datacad) {
		this.codigo = codigo;
		this.mensagem = mensagem;
		this.datacad = datacad;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Date getDatacad() {
		return datacad;
	}

	public void setDatacad(Date datacad) {
		this.datacad = datacad;
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
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Mensagem)) {
			return false;
		}
		Mensagem other = (Mensagem) object;
		if ((this.codigo == null && other.codigo != null)
				|| (this.codigo != null && !this.codigo.equals(other.codigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "javaapplication4.Mensagem[ codigo=" + codigo + " ]";
	}

}
