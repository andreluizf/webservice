package br.com.axis2;

import java.util.List;

import com.model.repository.mensagem.Mensagem;
import com.model.repository.mensagem.MensagemService;
import com.model.repository.nutricionista.NutricionistaService;
import com.model.repository.nutricionista.Nutricionista;
import com.model.repository.paciente.Paciente;
import com.model.repository.paciente.PacienteService;
import com.model.repository.receita.Receitas;
import com.model.repository.receita.ReceitasService;
import com.model.repository.usuario.Usuario;
import com.model.repository.usuario.UsuarioService;

public class webservice {
	public List<Nutricionista> listaNutricionistas() {
		NutricionistaService nutricionistaService = new NutricionistaService();

		return nutricionistaService.findAll();
	}

	public List<Receitas> listaReceitas() {
		ReceitasService nutricionistaService = new ReceitasService();

		return nutricionistaService.findAll();
	}

	public Usuario login(String email, String password) {
		UsuarioService userService = new UsuarioService();

		return userService.findUsuario(email, password);
	}

	public List<Mensagem> listaMensagens(String numero) {
		PacienteService pacienteService = new PacienteService();
		MensagemService msgService = new MensagemService();
		
		Paciente paciente = pacienteService.findPaciente(Integer
				.parseInt(numero));
		
		return msgService.findMensagens(paciente);
	}

	public Paciente findPaciente(String numero) {
		try {
			PacienteService pacienteService = new PacienteService();

			return pacienteService.findPaciente(Integer.parseInt(numero));
		} catch (Exception ex) {
			return null;
		}
	}
}
