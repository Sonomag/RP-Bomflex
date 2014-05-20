/**
 * 
 */
package br.com.bomflex.model.objetos;

/**
 * @author Mailton Ara�jo - Analista de Sistemas
 * Telefone - 71 - 3301-9000
 * E-mail - mailton@sonomag.com.br
 * 		    pcmotion@gmail.com
 */
public class OpEstoque {
	//Chave identificadora da Operacao do Estoque, que pode ser SAIDA, ENTRADA, etc.
	private int idOpEstoque;
	//Nome da Opera��o
	private String nomeOpEstoque;
	/**
	 * Construtor da Classe OpEstoque.java 
	 * @param idOpEstoque Requer um paramentro do tipo INTEIRO
	 * @param nomeOpEstoque Requer um paramentro do tipo String
	 */
	public OpEstoque(int idOpEstoque, String nomeOpEstoque) {
		setIdOpEstoque(idOpEstoque);
		setNomeOpEstoque(nomeOpEstoque);
	}
	/**
	 * M�todo para retorno do campo idOpEstoque
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdOpEstoque() {
		return idOpEstoque;
	}
	/**
	 * M�todo de escrita do campo idOpEstoque
	 * @param Requer um parametro do tipo int
	 */
	private void setIdOpEstoque(int idOpEstoque) {
		this.idOpEstoque = idOpEstoque;
	}
	/**
	 * M�todo para retorno do campo nomeOpEstoque
	 * @return Retorna um objeto do tipo String
	 */
	public String getNomeOpEstoque() {
		return nomeOpEstoque;
	}
	/**
	 * M�todo de escrita do campo nomeOpEstoque
	 * @param Requer um parametro do tipo String
	 */
	private void setNomeOpEstoque(String nomeOpEstoque) {
		this.nomeOpEstoque = nomeOpEstoque;
	}
	
}
