package br.com.fabricadeprogramador.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;

public class UsuarioDAO {
	private Connection conn = ConexaoFactory.getConnection();
	
	public void Cadastrar(Usuario usu) {
		
		String sql = "insert into usuario (nome, login,senha) values ('" + usu.getNome() + "','" + usu.getLogin() + "','" + usu.getSenha() + "')";
		
		try {
			PreparedStatement preparador = conn.prepareStatement(sql);
			preparador.execute();
			preparador.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void Alterar(Usuario usu) {
			
			String sql = "update usuario set nome ='" + usu.getNome() + "', login ='" + usu.getLogin() + "', senha ='" + usu.getSenha() + "' where id =" + usu.getId();
			
			try {
				PreparedStatement preparador = conn.prepareStatement(sql);
				preparador.execute();
				preparador.close();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}

	public void Excluir(Usuario usu) {
		
		String sql = "delete from usuario where id = " + usu.getId();
		
		try {
			PreparedStatement preparador = conn.prepareStatement(sql);
			preparador.execute();
			preparador.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
		
	

}
