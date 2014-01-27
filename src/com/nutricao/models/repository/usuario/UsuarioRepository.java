package com.nutricao.models.repository.usuario;

import com.nutricao.models.repository.Repository;




public interface UsuarioRepository extends Repository<Usuario> {

	Usuario findUsuario(String email, String password);

}
