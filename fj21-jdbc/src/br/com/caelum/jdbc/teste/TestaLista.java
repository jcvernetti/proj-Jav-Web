package br.com.caelum.jdbc.teste;

import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaLista {

	public static void main(String[] args) {

		// Cria um ContatoDao
		ContatoDao dao = new ContatoDao();

		// Lista os contatos com o DAO:
		List<Contato> contatos = dao.getLista();

		// Iterar nessa lista e imprimir as informações dos contatos:
		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("Data de Nascimento: " + contato.getDataNascimento().getTime() + "\n");
		}
	}

}
