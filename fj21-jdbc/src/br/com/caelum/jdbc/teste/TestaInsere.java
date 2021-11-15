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

		// grave nessa conex�o!!!
		ContatoDao dao = new ContatoDao();

		// m�todo elegante
		dao.adiciona(contato);

		System.out.println("Gravado!");

	}

}
