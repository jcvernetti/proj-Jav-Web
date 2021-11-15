package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		
		// pronto para gravar
		  Contato contato = new Contato();
		  contato.setNome("Jo�o");
		  contato.setEmail("joao@gmail.com");
		  contato.setEndereco("Rua Conselheiro, 2021");
		  contato.setDataNascimento(Calendar.getInstance());

		  // grave nessa conex�o!!!
		  ContatoDao dao = new ContatoDao();

		  // m�todo elegante
		  dao.adiciona(contato);

		  System.out.println("Gravado!");

	}

}
