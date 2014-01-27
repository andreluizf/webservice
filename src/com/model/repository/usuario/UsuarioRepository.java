package com.model.repository.usuario;

import com.model.repository.Repository;

public interface UsuarioRepository extends Repository<Usuario> {

	Usuario findUsuario(String email, String password);

}
