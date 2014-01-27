package com.nutricao.models.repository.paciente;

import com.nutricao.models.repository.Repository;

public interface PacienteRepository extends Repository<Paciente> {

	Paciente findPaciente(Integer usuario);
}
