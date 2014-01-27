package com.nutricao.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MultivaluedMap;

import com.nutricao.models.repository.mensagem.Mensagem;
import com.nutricao.models.repository.mensagem.MensagemService;
import com.nutricao.models.repository.nutricionista.Nutricionista;
import com.nutricao.models.repository.nutricionista.NutricionistaService;
import com.nutricao.models.repository.paciente.Paciente;
import com.nutricao.models.repository.paciente.PacienteService;
import com.nutricao.models.repository.receita.Receitas;
import com.nutricao.models.repository.receita.ReceitasService;
import com.nutricao.models.repository.usuario.Usuario;
import com.nutricao.models.repository.usuario.UsuarioService;

@Path("/nutricao")
public class NutricaoResource {

	@GET
	@Path("/nutricionistas")
	@Produces("application/json;charset=UTF-8;")
	public List<Nutricionista> listaNutricionistas() {
		NutricionistaService nutricionistaService = new NutricionistaService();
		System.out.println("entrou");
		return nutricionistaService.findAll();
	}

	@GET
	@Path("/receitas")
	@Produces("application/json;charset=UTF-8;")
	public List<Receitas> listaReceitas() {
		ReceitasService nutricionistaService = new ReceitasService();
		return nutricionistaService.findAll();
	}

	@GET
	@Path("/usuario/{email}/{pass}")
	@Produces("application/json;charset=UTF-8;")
	public Usuario login(@PathParam("email") String email,
			@PathParam("pass") String password) {
		UsuarioService userService = new UsuarioService();
		return userService.findUsuario(email, password);
	}

	@GET
	@Path("/mensagem/{paciente}")
	@Produces("application/json;charset=UTF-8;")
	public List<Mensagem> listaMensagens(@PathParam("paciente") String numero) {
		PacienteService pacienteService = new PacienteService();
		MensagemService msgService = new MensagemService();

		Paciente paciente = pacienteService.findPaciente(Integer
				.parseInt(numero));

		return msgService.findMensagens(paciente);
	}

	@GET
	@Path("/paciente/{paciente}")
	@Produces("application/json;charset=UTF-8;")
	public Paciente findPaciente(@PathParam("paciente") String numero) {
		try {
			PacienteService pacienteService = new PacienteService();
			return pacienteService.findPaciente(Integer.parseInt(numero));
		} catch (Exception ex) {
			return null;
		}
	}

	@POST
	@Path("/postMensagem")
	@Consumes("application/x-www-form-urlencoded")
	public MultivaluedMap<String, String> postMensagem(MultivaluedMap<String, String> formParams) {
		System.out.println(formParams.get("time"));
		return formParams;
	}
}
