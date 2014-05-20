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
public class HistoricoProduto {
	//Chave Idenficadora do idNumeroSerie do Produto
	private String idNumeroSerie;
	//Chave Identificadora do id do Funcionario Faixa
	private int idFuncFaixa;
	//Chave Identificadora do id do Funcionario Revisor
	private int idFuncRevisor;
	//Chave Identificadora do id do Funcionario Forro
	private int idFuncForro;
	//Chave Identificadora do id do Funcionario Capa
	private int idFuncCapa;
	//Chave Identificadora do id do Pedido
	private int idPedido;
	//Chave Identificadora do id do Produto
	private int idProduto;
	//Data de Produção do Produto
	private String dataFab;
	//Hora de Producao do Produto
	private String horaFab;
	//Numero de Série do Esqueleto de Madeira da Cama
	private String numSerieCaixa;
	
	/**
	 * Método para retorno do campo idNumeroSerie
	 * @return Retorna um objeto do tipo String
	 */
	public String getIdNumeroSerie() {
		return idNumeroSerie;
	}
	/**
	 * Método de escrita do campo idNumeroSerie
	 * @param Requer um parametro do tipo String
	 */
	public void setIdNumeroSerie(String idNumeroSerie) {
		this.idNumeroSerie = idNumeroSerie;
	}
	/**
	 * Método para retorno do campo idFuncFaixa
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdFuncFaixa() {
		return idFuncFaixa;
	}
	/**
	 * Método de escrita do campo idFuncFaixa
	 * @param Requer um parametro do tipo int
	 */
	public void setIdFuncFaixa(int idFuncFaixa) {
		this.idFuncFaixa = idFuncFaixa;
	}
	/**
	 * Método para retorno do campo idFuncRevisor
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdFuncRevisor() {
		return idFuncRevisor;
	}
	/**
	 * Método de escrita do campo idFuncRevisor
	 * @param Requer um parametro do tipo int
	 */
	public void setIdFuncRevisor(int idFuncRevisor) {
		this.idFuncRevisor = idFuncRevisor;
	}
	/**
	 * Método para retorno do campo idFuncForro
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdFuncForro() {
		return idFuncForro;
	}
	/**
	 * Método de escrita do campo idFuncForro
	 * @param Requer um parametro do tipo int
	 */
	public void setIdFuncForro(int idFuncForro) {
		this.idFuncForro = idFuncForro;
	}
	/**
	 * Método para retorno do campo idFuncCapa
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdFuncCapa() {
		return idFuncCapa;
	}
	/**
	 * Método de escrita do campo idFuncCapa
	 * @param Requer um parametro do tipo int
	 */
	public void setIdFuncCapa(int idFuncCapa) {
		this.idFuncCapa = idFuncCapa;
	}
	/**
	 * Método para retorno do campo idPedido
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdPedido() {
		return idPedido;
	}
	/**
	 * Método de escrita do campo idPedido
	 * @param Requer um parametro do tipo int
	 */
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	/**
	 * Método para retorno do campo idProduto
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdProduto() {
		return idProduto;
	}
	/**
	 * Método de escrita do campo idProduto
	 * @param Requer um parametro do tipo int
	 */
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	/**
	 * Método para retorno do campo dataFab
	 * @return Retorna um objeto do tipo String
	 */
	public String getDataFab() {
		return dataFab;
	}
	/**
	 * Método de escrita do campo dataFab
	 * @param Requer um parametro do tipo String
	 */
	public void setDataFab(String dataFab) {
		this.dataFab = dataFab;
	}
	/**
	 * Método para retorno do campo horaFab
	 * @return Retorna um objeto do tipo String
	 */
	public String getHoraFab() {
		return horaFab;
	}
	/**
	 * Método de escrita do campo horaFab
	 * @param Requer um parametro do tipo String
	 */
	public void setHoraFab(String horaFab) {
		this.horaFab = horaFab;
	}
	/**
	 * Método para retorno do campo numSerieCaixa
	 * @return Retorna um objeto do tipo String
	 */
	public String getNumSerieCaixa() {
		return numSerieCaixa;
	}
	/**
	 * Método de escrita do campo numSerieCaixa
	 * @param Requer um parametro do tipo String
	 */
	public void setNumSerieCaixa(String numSerieCaixa) {
		this.numSerieCaixa = numSerieCaixa;
	}
	
}
