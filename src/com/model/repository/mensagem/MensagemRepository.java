package com.model.repository.mensagem;

import java.util.List;

import com.model.repository.Repository;
import com.model.repository.paciente.Paciente;

public interface MensagemRepository extends Repository<Mensagem> {

	List<Mensagem> findMensagens(Paciente paciente);
}
