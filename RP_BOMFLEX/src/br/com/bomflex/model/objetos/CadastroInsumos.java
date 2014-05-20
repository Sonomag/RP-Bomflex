/**
 * 
 */
package br.com.bomflex.model.objetos;

/**
 * @author Mailton Araújo - Analista de Sistemas
 * Telefone - 71 - 3301-9000
 * E-mail - mailton@sonomag.com.br
 * 		    pcmotion@gmail.com
 */
public class CadastroInsumos {
	//Chave do Id do Produto Final
	private int idProdutoFinal;
	//Chave do Id dos Insumos do Produto
	private int idComponente;
	//Quantidade 
	private float quantidade;
	/**
	 * Construtor da Classe CadastroInsumos.java 
	 * @param idProdutoFinal Requer um paramentro do tipo INTEIRO
	 * @param idComponente Requer um paramentro do tipo INTEIRO
	 * @param quantidade Requer um parametro do tipo FLOAT
	 */
	public CadastroInsumos(int idProdutoFinal, int idComponente, float quantidade) {
		setIdComponente(idComponente);
		setIdProdutoFinal(idProdutoFinal);
		setQuantidade(quantidade);
	}
	/**
	 * Método para retorno do campo idProdutoFinal
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdProdutoFinal() {
		return idProdutoFinal;
	}
	/**
	 * Método de escrita do campo idProdutoFinal
	 * @param Requer um parametro do tipo int
	 */
	private void setIdProdutoFinal(int idProdutoFinal) {
		this.idProdutoFinal = idProdutoFinal;
	}
	/**
	 * Método para retorno do campo idComponente
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdComponente() {
		return idComponente;
	}
	/**
	 * Método de escrita do campo idComponente
	 * @param Requer um parametro do tipo int
	 */
	private void setIdComponente(int idComponente) {
		this.idComponente = idComponente;
	}
	/**
	 * Método para retorno do campo quantidade
	 * @return Retorna um objeto do tipo float
	 */
	public float getQuantidade() {
		return quantidade;
	}
	/**
	 * Método de escrita do campo quantidade
	 * @param Requer um parametro do tipo float
	 */
	private void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}
	
}
