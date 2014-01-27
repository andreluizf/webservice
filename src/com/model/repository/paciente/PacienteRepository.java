package com.model.repository.paciente;

import com.model.repository.Repository;

public interface PacienteRepository extends Repository<Paciente> {

	Paciente findPaciente(Integer usuario);
}
