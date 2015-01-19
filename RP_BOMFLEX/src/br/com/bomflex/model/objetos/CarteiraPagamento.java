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
public class CarteiraPagamento {
	//Id Carteira de Pagamento
	private int idCarteiraPagamento;
	//Id do Tipo de Carteira de Pagamento Exemplo: A receber, A pagar, Empréstimo, etc.
	private int idTipoCarteiraPagamento;
	//Nome da Carteira de Pagamento
	private String nomeCarteiraPagamento;
	//Descri��o da Carteira de Pagamento;
	private String descricaoCarteiraPagamento;
	
	/**
	 * Construtor da Classe CarteiraPagamento.java 
	 * @param idCarteiraPagamento
	 * @param idTipoCarteiraPagamento
	 * @param nomeCarteiraPagamento
	 * @param descricaoCarteiraPagamento
	 */
	public CarteiraPagamento(int idCarteiraPagamento,
			int idTipoCarteiraPagamento, String nomeCarteiraPagamento,
			String descricaoCarteiraPagamento) {
		this.idCarteiraPagamento = idCarteiraPagamento;
		this.idTipoCarteiraPagamento = idTipoCarteiraPagamento;
		this.nomeCarteiraPagamento = nomeCarteiraPagamento;
		this.descricaoCarteiraPagamento = descricaoCarteiraPagamento;
	}

	/**
	 * Método para retorno do campo idCarteiraPagamento
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdCarteiraPagamento() {
		return idCarteiraPagamento;
	}

	/**
	 * Método de escrita do campo idCarteiraPagamento
	 * @param Requer um parametro do tipo int
	 */
	public void setIdCarteiraPagamento(int idCarteiraPagamento) {
		this.idCarteiraPagamento = idCarteiraPagamento;
	}

	/**
	 * Método para retorno do campo idTipoCarteiraPagamento
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdTipoCarteiraPagamento() {
		return idTipoCarteiraPagamento;
	}

	/**
	 * Método de escrita do campo idTipoCarteiraPagamento
	 * @param Requer um parametro do tipo int
	 */
	public void setIdTipoCarteiraPagamento(int idTipoCarteiraPagamento) {
		this.idTipoCarteiraPagamento = idTipoCarteiraPagamento;
	}

	/**
	 * Método para retorno do campo nomeCarteiraPagamento
	 * @return Retorna um objeto do tipo String
	 */
	public String getNomeCarteiraPagamento() {
		return nomeCarteiraPagamento;
	}

	/**
	 * Método de escrita do campo nomeCarteiraPagamento
	 * @param Requer um parametro do tipo String
	 */
	public void setNomeCarteiraPagamento(String nomeCarteiraPagamento) {
		this.nomeCarteiraPagamento = nomeCarteiraPagamento;
	}

	/**
	 * Método para retorno do campo descricaoCarteiraPagamento
	 * @return Retorna um objeto do tipo String
	 */
	public String getDescricaoCarteiraPagamento() {
		return descricaoCarteiraPagamento;
	}

	/**
	 * Método de escrita do campo descricaoCarteiraPagamento
	 * @param Requer um parametro do tipo String
	 */
	public void setDescricaoCarteiraPagamento(String descricaoCarteiraPagamento) {
		this.descricaoCarteiraPagamento = descricaoCarteiraPagamento;
	}
	
}
