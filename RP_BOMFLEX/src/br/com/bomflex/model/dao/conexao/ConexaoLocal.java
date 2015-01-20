/**
 * 
 */
package br.com.bomflex.model.dao.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.bomflex.controller.erro.StringErros;

/**
 * @author Mailton Ara�jo - Analista de Sistemas
 * Telefone - 71 - 3301-9000
 * E-mail - mailton@sonomag.com.br
 * 		    pcmotion@gmail.com
 */
public class ConexaoLocal {

	/***
	 * Declara��o das Constantes Principais da Classe
	 */
	private static final String STR_DRIVER= "org.postgresql.Driver";//Driver Respons�vel para a conex�o com o Banco de Dados Postgres
	private static final String DATABASE = "ERP-BOMFLEX";//Nome do Database
	private static final String IP_LOCAL = "localhost";//Caso Deseje Acessar a maquina Local Alterar este dado
	private static final String USER = "erp-bomflex";//Usu�rio do Banco de Dados
	private static final String PASSWORD = "vk32lcvop123";//Senha do Usu�rio do Banco de Dados
	private static final String STR_CONEXAO = "jdbc:postgresql://" + IP_LOCAL + ":8751/" + DATABASE ;//Uma String de Conex�es Local
	
	
	/***
	 * M�todo para retorno do Ponteiro de Conexao com o Banco de Dados
	 * @return Retorna um objeto do tipo Connection
	 */
	public static Connection getConection(StringErros erros) {
		Connection con = null;
		try{
			Class.forName(STR_DRIVER);
			con = DriverManager.getConnection(STR_CONEXAO,USER,PASSWORD);
			return con; 
		}catch(ClassNotFoundException e){
			erros.exibeErroTela(erros.getErros("30001")); 
		} catch (SQLException e) {
			erros.exibeErroTela(erros.getErros("30002"));
		}
		return null;
	}
}
