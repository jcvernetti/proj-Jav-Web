package br.com.caelum.jdbc.teste;

import java.util.Calendar;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteAltera {

	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();

		Contato contato = new Contato();

		long id = 4;

		contato.setId(id);
		contato.setNome("Rejane Teresa");
		contato.setEmail("rejaneteresa@gmail.com");
		contato.setEndereco("Avenida Taquara, 72");
		Calendar novaData = Calendar.getInstance();

		contato.setDataNascimento(novaData);

		dao.altera(contato);

		// Lista dos contatos:
		List<Contato> contatos = dao.getLista();

		// Iterar nessa lista e imprimir as informações dos contatos:
		for (Contato contatonovo : contatos) {
			System.out.println("Nome: " + contatonovo.getNome());
			System.out.println("Email: " + contatonovo.getEmail());
			System.out.println("Endereço: " + contatonovo.getEndereco());
			System.out.println("Data de Nascimento: " + contatonovo.getDataNascimento().getTime() + "\n");
		}
	}
}
