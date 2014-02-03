package com.nutricao.ws;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MultivaluedMap;

import com.nutricao.helpers.UsuarioHelper;
import com.nutricao.models.repository.diarioAlimentar.DiarioAlimentar;
import com.nutricao.models.repository.diarioAlimentar.DiarioService;
import com.nutricao.models.repository.mensagem.Mensagem;
import com.nutricao.models.repository.mensagem.MensagemService;
import com.nutricao.models.repository.nutricionista.Nutricionista;
import com.nutricao.models.repository.nutricionista.NutricionistaService;
import com.nutricao.models.repository.paciente.Paciente;
import com.nutricao.models.repository.paciente.PacienteService;
import com.nutricao.models.repository.receita.Receitas;
import com.nutricao.models.repository.receita.ReceitasService;
import com.nutricao.models.repository.refeicao.Refeicao;
import com.nutricao.models.repository.refeicao.RefeicaoService;
import com.nutricao.models.repository.usuario.Usuario;
import com.nutricao.models.repository.usuario.UsuarioService;

@Path("/nutricao")
public class NutricaoResource {

	@POST
	@Path("/nutricionistas")
	@Consumes("application/x-www-form-urlencoded")
	@Produces("application/json;charset=UTF-8;")
	public List<Nutricionista> listaNutricionistas(
			MultivaluedMap<String, String> formParams) {
		try {
			if (UsuarioHelper.login(formParams.get("login").get(0),
					formParams.get("pass").get(0))) {
				NutricionistaService nutricionistaService = new NutricionistaService();
				return nutricionistaService.findAll();
			} else {
				return new ArrayList<Nutricionista>();
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@POST
	@Path("/receitas")
	@Consumes("application/x-www-form-urlencoded")
	@Produces("application/json;charset=UTF-8;")
	public List<Receitas> listaReceitas(
			MultivaluedMap<String, String> formParams) {
		try {
			if (UsuarioHelper.login(formParams.get("login").get(0),
					formParams.get("pass").get(0))) {
				ReceitasService nutricionistaService = new ReceitasService();
				return nutricionistaService.findAll();
			} else {
				return new ArrayList<Receitas>();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@POST
	@Path("/usuario")
	@Consumes("application/x-www-form-urlencoded")
	@Produces("application/json;charset=UTF-8;")
	public Usuario login(MultivaluedMap<String, String> formParams) {
		try {

			UsuarioService userService = new UsuarioService();
			return userService.findUsuario(formParams.get("login").get(0),
					formParams.get("pass").get(0));

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	

	@POST
	@Path("/paciente")
	@Consumes("application/x-www-form-urlencoded")
	@Produces("application/json;charset=UTF-8;")
	public Paciente findPaciente(MultivaluedMap<String, String> formParams) {
		try {
			if (UsuarioHelper.login(formParams.get("login").get(0),
					formParams.get("pass").get(0))) {
				PacienteService pacienteService = new PacienteService();
				return pacienteService.findPaciente(Integer.parseInt(formParams
						.get("usuario").get(0)));
			} else {
				return new Paciente();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@POST
	@Path("/mensagem")
	@Consumes("application/x-www-form-urlencoded")
	@Produces("application/json;charset=UTF-8;")
	public List<Mensagem> listaMensagens(
			MultivaluedMap<String, String> formParams) {
		try {
			if (UsuarioHelper.login(formParams.get("login").get(0),
					formParams.get("pass").get(0))) {
				PacienteService pacienteService = new PacienteService();
				MensagemService msgService = new MensagemService();

				Paciente paciente = pacienteService.findPaciente(Integer
						.parseInt(formParams.get("usuario").get(0)));

				return msgService.findMensagens(paciente);
			} else {
				return new ArrayList<Mensagem>();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@POST
	@Path("/setMensagem")
	@Consumes("application/x-www-form-urlencoded")
	public String setMensagem(MultivaluedMap<String, String> formParams) {
		try {
			if (UsuarioHelper.login(formParams.get("login").get(0),
					formParams.get("pass").get(0))) {
				PacienteService pacienteService = new PacienteService();
				Paciente paciente = pacienteService.findPaciente(Integer
						.parseInt(formParams.get("usuario").get(0)));
				MensagemService msgService = new MensagemService();
				Mensagem msg = new Mensagem();
				msg.setDatacad(new Date());
				msg.setMensagem(formParams.get("mensagem").get(0));
				msg.setPaciente(paciente);
				msgService.insert(msg);
				return "salvo com sucesso";
			} else {
				return "acesso invalido";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "erro";
		}

	}

	@POST
	@Path("/setDiario")
	@Consumes("application/x-www-form-urlencoded")
	public String postDiario(MultivaluedMap<String, String> formParams) {
		try {
			if (UsuarioHelper.login(formParams.get("login").get(0),
					formParams.get("pass").get(0))) {
				DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				Date date = (Date) formatter.parse(formParams.get("data")
						.get(0));
				DiarioService diarioService = new DiarioService();
				System.out.println(formParams);
				PacienteService pacienteService = new PacienteService();
				Paciente paciente = pacienteService.findPaciente(Integer
						.parseInt(formParams.get("usuario").get(0)));

				RefeicaoService refeicaoService = new RefeicaoService();
				List<Refeicao> refeicaos = refeicaoService.findAll();
				List<DiarioAlimentar> diarioAlimentars = new ArrayList<DiarioAlimentar>();
				diarioAlimentars.add(new DiarioAlimentar(formParams.get(
						"cafe_manha[mensagem]").get(0), formParams
						.get("cafe_manha[imagem]").get(0).getBytes(), date,
						paciente, refeicaos.get(0)));

				diarioAlimentars.add(new DiarioAlimentar(formParams.get(
						"lanche_manha[mensagem]").get(0), formParams
						.get("lanche_manha[imagem]").get(0).getBytes(), date,
						paciente, refeicaos.get(1)));

				diarioAlimentars.add(new DiarioAlimentar(formParams.get(
						"almoco[mensagem]").get(0), formParams
						.get("almoco[imagem]").get(0).getBytes(), date,
						paciente, refeicaos.get(2)));

				diarioAlimentars.add(new DiarioAlimentar(formParams.get(
						"lanche_tarde[mensagem]").get(0), formParams
						.get("lanche_tarde[imagem]").get(0).getBytes(), date,
						paciente, refeicaos.get(3)));

				diarioAlimentars.add(new DiarioAlimentar(formParams.get(
						"jantar[mensagem]").get(0), formParams
						.get("jantar[imagem]").get(0).getBytes(), date,
						paciente, refeicaos.get(4)));
				if (formParams.get("lanche_noite[mensagem]") != null) {
					diarioAlimentars.add(new DiarioAlimentar(formParams.get(
							"lanche_noite[mensagem]").get(0), formParams
							.get("lanche_noite[imagem]").get(0).getBytes(),
							date, paciente, refeicaos.get(5)));
				} else {

				}

				diarioService.insert(diarioAlimentars);
				return "salvo com sucesso";
			} else {
				return "acesso negado.";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "erro";
		}

	}

	@POST
	@Path("/diario")
	@Consumes("application/x-www-form-urlencoded")
	@Produces("application/json;charset=UTF-8;")
	public List<DiarioAlimentar> diario(
			MultivaluedMap<String, String> formParams) {
		try {
			if (UsuarioHelper.login(formParams.get("login").get(0),
					formParams.get("pass").get(0))) {
				PacienteService pacienteService = new PacienteService();
				Paciente paciente = pacienteService.findPaciente(Integer
						.parseInt(formParams.get("usuario").get(0)));

				DiarioService diarioService = new DiarioService();
				DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				Date date = (Date) formatter.parse(formParams.get("data")
						.get(0));

				return diarioService.findDiario(paciente, date);
			} else {
				return new ArrayList<DiarioAlimentar>();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
