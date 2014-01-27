package com.nutricao.models.repository.mensagem;


import java.util.List;

import com.nutricao.models.repository.Repository;
import com.nutricao.models.repository.paciente.Paciente;



public interface MensagemRepository extends Repository<Mensagem> {

	List<Mensagem> findMensagens(Paciente paciente);
}
