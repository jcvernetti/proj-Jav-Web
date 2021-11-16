package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaInsereFuncionario {

	public static void main(String[] args) {

		// pronto para gravar
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Roberta V C");
		funcionario.setUsuario("RVC");
		funcionario.setSenha("111");

		// grave nessa conex�o!!!
		FuncionarioDao dao = new FuncionarioDao();

		// m�todo elegante
		dao.adiciona(funcionario);

		System.out.println("Gravado!");
	}

}
