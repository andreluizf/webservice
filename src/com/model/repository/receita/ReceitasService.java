package com.model.repository.receita;

import java.util.List;

import br.com.axis2.EntityManagerHelper;

public class ReceitasService implements ReceitasRepository{

	@Override
	public List<Receitas> findAll() {
		return EntityManagerHelper.getEntityManager().createQuery("select r from Receitas r", Receitas.class).getResultList();
	}

}
