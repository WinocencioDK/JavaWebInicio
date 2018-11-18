package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		testExc();

	}
	
	public static void testExc() {
		
		Usuario usu = new Usuario();
		
		usu.setId(4);
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.Excluir(usu);

		
		System.out.println("Excluido com sucesso!");
	}
	
	public static void testAlt() {
			
			Usuario usu = new Usuario();
			
			usu.setId(1);
			usu.setNome("João da Silva Sauro");
			usu.setLogin("jsauro");
			usu.setSenha("15478698");
			
			UsuarioDAO usuDAO = new UsuarioDAO();
			usuDAO.Alterar(usu);
	
			
			System.out.println("Alterado com sucesso!");
		}
	
	public static void testCad() {
		
		Usuario usu = new Usuario();
		
		usu.setNome("João da Silva");
		usu.setLogin("jsilva");
		usu.setSenha("15478");
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.Cadastrar(usu);

		
		System.out.println("Cadastrado com sucesso!");
	}

}
