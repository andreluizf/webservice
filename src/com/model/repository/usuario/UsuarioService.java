package com.model.repository.usuario;

import java.util.List;

import javax.persistence.Query;

import br.com.axis2.EntityManagerHelper;

public class UsuarioService implements UsuarioRepository {

	@Override
	public List<Usuario> findAll() {
		return null;
	}

	@Override
	public Usuario findUsuario(String email, String password) {
		try {
			Query q = EntityManagerHelper
					.getEntityManager()
					.createQuery(
							"select u from Usuario u where u.login = :email and u.senha = :password",
							Usuario.class);

			q.setParameter("email", email);
			q.setParameter("password", password);

			System.err.println(q.toString());

			return (Usuario) q.getSingleResult();
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

}
