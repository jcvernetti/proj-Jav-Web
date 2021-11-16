package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.modelo.Contato;
import br.com.caelum.jdbc.modelo.Funcionario;

public class FuncionarioDao {

	// a conexão com o banco de dados
    private Connection connection;

    public FuncionarioDao() {
      this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Funcionario funcionario) {
        String sql = "insert into funcionarios " +
                "(nome,usuario,senha)" +
                " values (?,?,?)";

        try {
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);

            // seta os valores
            stmt.setString(1,funcionario.getNome());
            stmt.setString(2,funcionario.getUsuario());
            stmt.setString(3,funcionario.getSenha());
            

            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new DAOException();
        }
    }
}
