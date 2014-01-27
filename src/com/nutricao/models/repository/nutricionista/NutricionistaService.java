package com.nutricao.models.repository.nutricionista;

import java.util.List;

import javax.persistence.Query;

import com.nutricao.helpers.EntityManagerHelper;


public class NutricionistaService implements NutricionistaRepository {

	
	@Override
	public List<Nutricionista> findAll() {
		return EntityManagerHelper.getEntityManager().createQuery("select n from Nutricionista n").getResultList();
		
	}

}
