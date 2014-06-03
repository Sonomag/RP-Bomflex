/**
 * 
 */
package br.com.bomflex.model;

/**
 * @author Mailton Araújo - Analista de Sistemas
 * Telefone - 71 - 3301-9000
 * E-mail - mailton@sonomag.com.br
 * 		    pcmotion@gmail.com
 */
public class Erros {

	//Codigo do Erro
	private String codErro;
	//nome do Erro
	private String nomeErro;
	/**
	 * Método para retorno do campo codErro
	 * @return Retorna um objeto do tipo String
	 */
	public String getCodErro() {
		return codErro;
	}
	/**
	 * Método de escrita do campo codErro
	 * @param Requer um parametro do tipo String
	 */
	public void setCodErro(String codErro) {
		this.codErro = codErro;
	}
	/**
	 * Método para retorno do campo nomeErro
	 * @return Retorna um objeto do tipo String
	 */
	public String getNomeErro() {
		return nomeErro;
	}
	/**
	 * Método de escrita do campo nomeErro
	 * @param Requer um parametro do tipo String
	 */
	public void setNomeErro(String nomeErro) {
		this.nomeErro = nomeErro;
	}
	
}
