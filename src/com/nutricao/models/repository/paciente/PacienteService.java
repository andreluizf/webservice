package com.nutricao.models.repository.paciente;

import java.util.List;

import javax.persistence.Query;

import com.nutricao.helpers.EntityManagerHelper;

public class PacienteService implements PacienteRepository {

	@Override
	public List<Paciente> findAll() {
		return EntityManagerHelper.getEntityManager()
				.createQuery("select p from Paciente p").getResultList();
	}

	@Override
	public Paciente findPaciente(Integer usuario) {
		try {
			Query q = EntityManagerHelper
					.getEntityManager()
					.createQuery(
							"select p from Paciente p where p.usuario.codigo = :codigo");
			q.setParameter("codigo", usuario);
			return (Paciente) q.getSingleResult();
		} catch (Exception ex) {
			return null;
		}
	}

}
