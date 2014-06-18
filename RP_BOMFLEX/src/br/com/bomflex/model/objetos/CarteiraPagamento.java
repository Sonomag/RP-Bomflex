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
	//Nome da Carteira de Pagamento
	private String nomeCarteiraPagamento;
	//Descri��o da Carteira de Pagamento;
	private String descricaoCarteiraPagamento;
	/**
	 * Construtor da Classe CarteiraPagamento.java 
	 * @param idCarteiraPagamento
	 * @param nomeCarteiraPagamento
	 */
	public CarteiraPagamento(int idCarteiraPagamento,
			String nomeCarteiraPagamento) {
		this.idCarteiraPagamento = idCarteiraPagamento;
		this.nomeCarteiraPagamento = nomeCarteiraPagamento;
	}
	/**
	 * M�todo para retorno do campo idCarteiraPagamento
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdCarteiraPagamento() {
		return idCarteiraPagamento;
	}
	/**
	 * M�todo de escrita do campo idCarteiraPagamento
	 * @param Requer um parametro do tipo int
	 */
	public void setIdCarteiraPagamento(int idCarteiraPagamento) {
		this.idCarteiraPagamento = idCarteiraPagamento;
	}
	/**
	 * M�todo para retorno do campo nomeCarteiraPagamento
	 * @return Retorna um objeto do tipo String
	 */
	public String getNomeCarteiraPagamento() {
		return nomeCarteiraPagamento;
	}
	/**
	 * M�todo de escrita do campo nomeCarteiraPagamento
	 * @param Requer um parametro do tipo String
	 */
	public void setNomeCarteiraPagamento(String nomeCarteiraPagamento) {
		this.nomeCarteiraPagamento = nomeCarteiraPagamento;
	}
	/**
	 * M�todo para retorno do campo descricaoCarteiraPagamento
	 * @return Retorna um objeto do tipo String
	 */
	public String getDescricaoCarteiraPagamento() {
		return descricaoCarteiraPagamento;
	}
	/**
	 * M�todo de escrita do campo descricaoCarteiraPagamento
	 * @param Requer um parametro do tipo String
	 */
	public void setDescricaoCarteiraPagamento(String descricaoCarteiraPagamento) {
		this.descricaoCarteiraPagamento = descricaoCarteiraPagamento;
	}
	
}
