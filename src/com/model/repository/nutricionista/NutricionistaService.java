package com.model.repository.nutricionista;

import java.util.List;

import br.com.axis2.EntityManagerHelper;

public class NutricionistaService implements NutricionistaRepository {

	@Override
	public List<Nutricionista> findAll() {
		return EntityManagerHelper.getEntityManager().createQuery("select n from Nutricionista n", Nutricionista.class).getResultList();
	}

}
