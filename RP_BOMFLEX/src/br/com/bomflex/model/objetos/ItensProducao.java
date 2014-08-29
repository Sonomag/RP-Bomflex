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
public class ItensProducao {
	//idProdu��o
	private int idProducao;
	//idProduto
	private int idProduto;
	//Quantidade
	private int quantidade;
	/**
	 * M�todo para retorno do campo idProducao
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdProducao() {
		return idProducao;
	}
	/**
	 * M�todo de escrita do campo idProducao
	 * @param Requer um parametro do tipo int
	 */
	public void setIdProducao(int idProducao) {
		this.idProducao = idProducao;
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
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	/**
	 * M�todo para retorno do campo quantidade
	 * @return Retorna um objeto do tipo int
	 */
	public int getQuantidade() {
		return quantidade;
	}
	/**
	 * M�todo de escrita do campo quantidade
	 * @param Requer um parametro do tipo int
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
