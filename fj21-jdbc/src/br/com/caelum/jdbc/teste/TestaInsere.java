package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {

		// pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Rejane Yara");
		contato.setEmail("rejaneyara@gmail.com");
		contato.setEndereco("Avenida Beira Mar, 2233");
		contato.setDataNascimento(Calendar.getInstance());

		// grave nessa conexão!!!
		ContatoDao dao = new ContatoDao();

		// método elegante
		dao.adiciona(contato);

		System.out.println("Gravado!");

	}

}
