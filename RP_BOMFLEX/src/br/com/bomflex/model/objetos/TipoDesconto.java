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
public class TipoDesconto {
	//Id do Tipo de Desconto
	private int idTipoDesconto;
	//Nome do Desconto
	private String nomeDesconto;
	//Operação do Desconto
	private String operacaoDesconto;
	/**
	 * Construtor da Classe TipoDesconto.java 
	 * @param idTipoDesconto
	 * @param nomeDesconto
	 * @param operacaoDesconto
	 */
	public TipoDesconto(int idTipoDesconto, String nomeDesconto,
			String operacaoDesconto) {
		setIdTipoDesconto(idTipoDesconto);
		setNomeDesconto(nomeDesconto);
		setOperacaoDesconto(operacaoDesconto);
	}
	/**
	 * Método para retorno do campo idTipoDesconto
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdTipoDesconto() {
		return idTipoDesconto;
	}
	/**
	 * Método de escrita do campo idTipoDesconto
	 * @param Requer um parametro do tipo int
	 */
	public void setIdTipoDesconto(int idTipoDesconto) {
		this.idTipoDesconto = idTipoDesconto;
	}
	/**
	 * Método para retorno do campo nomeDesconto
	 * @return Retorna um objeto do tipo String
	 */
	public String getNomeDesconto() {
		return nomeDesconto;
	}
	/**
	 * Método de escrita do campo nomeDesconto
	 * @param Requer um parametro do tipo String
	 */
	public void setNomeDesconto(String nomeDesconto) {
		this.nomeDesconto = nomeDesconto;
	}
	/**
	 * Método para retorno do campo operacaoDesconto
	 * @return Retorna um objeto do tipo String
	 */
	public String getOperacaoDesconto() {
		return operacaoDesconto;
	}
	/**
	 * Método de escrita do campo operacaoDesconto
	 * @param Requer um parametro do tipo String
	 */
	public void setOperacaoDesconto(String operacaoDesconto) {
		this.operacaoDesconto = operacaoDesconto;
	}
	
}
