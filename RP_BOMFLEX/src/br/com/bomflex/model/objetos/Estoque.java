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
public class Estoque {
	//Chave do id da Opera��o do Estoque - Que pode ser Saida, Entrada, etc.
	private int idOpEstoque;
	//Chave do id do Produto
	private int idProduto;
	//Quantidade
	private float quantidade;
	
	/**
	 * Construtor da Classe Estoque.java 
	 * @param idOpEstoque Requer um parametro do tipo INTEIRO
	 * @param idProduto Requer um paramentro do tipo INTEIRO
	 * @param quantidade Requer um paramentro do tipo FLOAT
	 */
	public Estoque(int idOpEstoque, int idProduto, float quantidade) {
		setIdOpEstoque(idOpEstoque);
		setIdProduto(idProduto);
		setQuantidade(quantidade);
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
	 * M�todo para retorno do campo idProduto
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdProduto() {
		return idProduto;
	}
	/**
	 * M�todo de escrita do campo idProduto
	 * @param Requer um parametro do tipo int
	 */
	private void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	/**
	 * M�todo para retorno do campo quantidade
	 * @return Retorna um objeto do tipo float
	 */
	public float getQuantidade() {
		return quantidade;
	}
	/**
	 * M�todo de escrita do campo quantidade
	 * @param Requer um parametro do tipo float
	 */
	private void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}
	
}
