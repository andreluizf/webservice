package com.model.repository.mensagem;

import java.util.List;

import javax.persistence.Query;

import br.com.axis2.EntityManagerHelper;

import com.model.repository.paciente.Paciente;

public class MensagemService implements MensagemRepository {

	@Override
	public List<Mensagem> findAll() {
		return EntityManagerHelper.getEntityManager()
				.createQuery("select m from Mensagem m", Mensagem.class)
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Mensagem> findMensagens(Paciente paciente) {
		Query q = EntityManagerHelper.getEntityManager().createQuery(
				"select m from Mensagem m where m.paciente = :paciente",
				Mensagem.class);

		q.setParameter("paciente", paciente);

		return q.getResultList();
	}

}
