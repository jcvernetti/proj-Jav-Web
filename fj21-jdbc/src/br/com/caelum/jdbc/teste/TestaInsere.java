package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {

		// pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Maria Joana");
		contato.setEmail("mariajoana@gmail.com");
		contato.setEndereco("Rua do ouvidor, 345");
		contato.setDataNascimento(Calendar.getInstance());

		// grave nessa conex�o!!!
		ContatoDao dao = new ContatoDao();

		// m�todo elegante
		dao.adiciona(contato);

		System.out.println("Gravado!");

	}

}
