package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaExcluir {

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

		dao.remove(contato);
		
		System.out.println("Registro excluído com sucesso!");

	}

}
