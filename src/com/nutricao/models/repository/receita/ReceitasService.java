package com.nutricao.models.repository.receita;



import java.util.List;

import com.nutricao.helpers.EntityManagerHelper;



public class ReceitasService implements ReceitasRepository{

	@Override
	public List<Receitas> findAll() {
		return EntityManagerHelper.getEntityManager().createQuery("select r from Receitas r").getResultList();
	}

}
