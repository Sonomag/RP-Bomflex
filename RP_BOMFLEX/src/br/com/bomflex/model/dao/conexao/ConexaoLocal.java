/**
 * 
 */
package br.com.bomflex.model.dao.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.bomflex.controller.erro.StringErros;

/**
 * @author Mailton Araújo - Analista de Sistemas
 * Telefone - 71 - 3301-9000
 * E-mail - mailton@sonomag.com.br
 * 		    pcmotion@gmail.com
 */
public class ConexaoLocal {

	/***
	 * Declaração das Constantes Principais da Classe
	 */
	private static final String STR_DRIVER= "org.postgresql.Driver";//Driver Responsável para a conexão com o Banco de Dados Postgres
	private static final String DATABASE = "ERP-BOMFLEX";//Nome do Database
	private static final String IP_LOCAL = "10.1.1.104";//Caso Deseje Acessar a maquina Local Alterar este dado
	private static final String USER = "erp-bomflex";//Usuário do Banco de Dados
	private static final String PASSWORD = "vk32lcvop123";//Senha do Usuário do Banco de Dados
	private static final String STR_CONEXAO = "jdbc:postgresql://" + IP_LOCAL + ":8751/" + DATABASE ;//Uma String de Conexï¿½es Local
	
	//String dos Erros do Sistema
	private static StringErros teste = new StringErros();
	
	/***
	 * Método para retorno do Ponteiro de Conexao com o Banco de Dados
	 * @return Retorna um objeto do tipo Connection
	 */
	public static Connection getConection() {
		Connection con = null;
		try{
			Class.forName(STR_DRIVER);
			con = DriverManager.getConnection(STR_CONEXAO,USER,PASSWORD);
			return con; 
		}catch(ClassNotFoundException e){
			teste.exibeErroTela(teste.getErros("30001")); 
		} catch (SQLException e) {
			
			teste.exibeErroTela(teste.getErros("30001"));
		}
		
		
		return null;
		
	}
	
}
