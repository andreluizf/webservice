package com.nutricao.models.repository.mensagem;

import java.util.List;

import javax.persistence.Query;

import com.nutricao.helpers.EntityManagerHelper;
import com.nutricao.models.repository.paciente.Paciente;


public class MensagemService implements MensagemRepository {

	@Override
	public List<Mensagem> findAll() {
		return EntityManagerHelper.getEntityManager()
				.createQuery("select m from Mensagem m")
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Mensagem> findMensagens(Paciente paciente) {
		Query q = EntityManagerHelper.getEntityManager().createQuery(
				"select m from Mensagem m where m.paciente = :paciente");

		q.setParameter("paciente", paciente);

		return q.getResultList();
	}

}
