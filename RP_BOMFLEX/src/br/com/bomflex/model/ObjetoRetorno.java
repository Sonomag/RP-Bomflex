/**
 * 
 */
package br.com.bomflex.model;

import java.util.ArrayList;

/**
 * @author Mailton Araújo - Analista de Sistemas
 * Telefone - 71 - 3301-9000
 * E-mail - mailton@sonomag.com.br
 * 		    pcmotion@gmail.com
 * Data de Criação 19/05/2014 - 10:18:29
 */
public class ObjetoRetorno {
	//String para exibir uma mensagem de erro seguindo um arquivo XML com os Erros.
	private String erro;
	//Retorno do Objeto.
	private ArrayList<Object> objeto;
	/**
	 * Método para retorno do campo erro
	 * @return Retorna um objeto do tipo String
	 */
	public String getErro() {
		return erro;
	}
	/**
	 * Método de escrita do campo erro
	 * @param Requer um parametro do tipo String
	 */
	public void setErro(String erro) {
		this.erro = erro;
	}
	/**
	 * Método para retorno do campo objeto
	 * @return Retorna um objeto do tipo ArrayList<Object>
	 */
	public ArrayList<Object> getObjeto() {
		return objeto;
	}
	/**
	 * Método de escrita do campo objeto
	 * @param Requer um parametro do tipo ArrayList<Object>
	 */
	public void setObjeto(ArrayList<Object> objeto) {
		this.objeto = objeto;
	}
}
