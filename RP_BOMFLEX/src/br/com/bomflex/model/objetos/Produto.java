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
public class Produto {
	//Chave identificadora do idProduto
	private int idProduto;
	//Chave identificadora da Unidade de Medida do Produto
	private int idUnidadeMedida;
	//Chave identificadora do Id Usuario que Cadastrou o Produto
	private int idUsuario;
	//Chave identificadora do Id do Fabricante
	private int idFabricante;
	//Chave identificadora do id da Situacao do Produto
	private int idSituacaoProduto;
	//Chave do id Grupo Produto
	private int idGrupoProduto;
	//Chave do id Tipo de Produto
	private int idTipoProduto;
	//Nome do Produto
	private String nomeProduto;
	//Quantidade Minima do Produto
	private float qtdMinima;
	//Data de Cadastro do Produto
	private String dataCadastro;
	//Pre�o de Compra do Produto
	private float precoCompra;
	//Pre�o de Venda do Produto
	private float precoVenda;
	
	/**
	 * Construtor da Classe Produto.java 
	 * @param idProduto
	 * @param idUnidadeMedida
	 * @param idUsuario
	 * @param idFabricante
	 * @param idSituacaoProduto
	 * @param idGrupoProduto
	 * @param idTipoProduto
	 * @param nomeProduto
	 * @param dataCadastro
	 */
	public Produto(int idProduto,int idUnidadeMedida,int idUsuario, int idFabricante,
			int idSituacaoProduto, int idGrupoProduto, int idTipoProduto,
			String nomeProduto, String dataCadastro) {
		super();
		this.idProduto = idProduto;
		this.idUsuario = idUsuario;
		this.idFabricante = idFabricante;
		this.idSituacaoProduto = idSituacaoProduto;
		this.idGrupoProduto = idGrupoProduto;
		this.idTipoProduto = idTipoProduto;
		this.nomeProduto = nomeProduto;
		this.dataCadastro = dataCadastro;
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
	 * M�todo para retorno do campo idUnidadeMedida
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdUnidadeMedida() {
		return idUnidadeMedida;
	}
	/**
	 * M�todo de escrita do campo idUnidadeMedida
	 * @param Requer um parametro do tipo int
	 */
	public void setIdUnidadeMedida(int idUnidadeMedida) {
		this.idUnidadeMedida = idUnidadeMedida;
	}
	/**
	 * M�todo para retorno do campo idUsuario
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdUsuario() {
		return idUsuario;
	}
	/**
	 * M�todo de escrita do campo idUsuario
	 * @param Requer um parametro do tipo int
	 */
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	/**
	 * M�todo para retorno do campo idFabricante
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdFabricante() {
		return idFabricante;
	}
	/**
	 * M�todo de escrita do campo idFabricante
	 * @param Requer um parametro do tipo int
	 */
	public void setIdFabricante(int idFabricante) {
		this.idFabricante = idFabricante;
	}
	/**
	 * M�todo para retorno do campo idSituacaoProduto
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdSituacaoProduto() {
		return idSituacaoProduto;
	}
	/**
	 * M�todo de escrita do campo idSituacaoProduto
	 * @param Requer um parametro do tipo int
	 */
	public void setIdSituacaoProduto(int idSituacaoProduto) {
		this.idSituacaoProduto = idSituacaoProduto;
	}
	/**
	 * M�todo para retorno do campo idGrupoProduto
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdGrupoProduto() {
		return idGrupoProduto;
	}
	/**
	 * M�todo de escrita do campo idGrupoProduto
	 * @param Requer um parametro do tipo int
	 */
	public void setIdGrupoProduto(int idGrupoProduto) {
		this.idGrupoProduto = idGrupoProduto;
	}
	/**
	 * M�todo para retorno do campo idTipoProduto
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdTipoProduto() {
		return idTipoProduto;
	}
	/**
	 * M�todo de escrita do campo idTipoProduto
	 * @param Requer um parametro do tipo int
	 */
	public void setIdTipoProduto(int idTipoProduto) {
		this.idTipoProduto = idTipoProduto;
	}
	/**
	 * M�todo para retorno do campo nomeProduto
	 * @return Retorna um objeto do tipo String
	 */
	public String getNomeProduto() {
		return nomeProduto;
	}
	/**
	 * M�todo de escrita do campo nomeProduto
	 * @param Requer um parametro do tipo String
	 */
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	/**
	 * M�todo para retorno do campo qtdMinima
	 * @return Retorna um objeto do tipo float
	 */
	public float getQtdMinima() {
		return qtdMinima;
	}
	/**
	 * M�todo de escrita do campo qtdMinima
	 * @param Requer um parametro do tipo float
	 */
	public void setQtdMinima(float qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	/**
	 * M�todo para retorno do campo dataCadastro
	 * @return Retorna um objeto do tipo String
	 */
	public String getDataCadastro() {
		return dataCadastro;
	}
	/**
	 * M�todo de escrita do campo dataCadastro
	 * @param Requer um parametro do tipo String
	 */
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	/**
	 * M�todo para retorno do campo pre�oCompra
	 * @return Retorna um objeto do tipo float
	 */
	public float getPrecoCompra() {
		return precoCompra;
	}
	/**
	 * M�todo de escrita do campo pre�oCompra
	 * @param Requer um parametro do tipo float
	 */
	public void setPrecoCompra(float precoCompra) {
		this.precoCompra = precoCompra;
	}
	/**
	 * M�todo para retorno do campo pre�oVenda
	 * @return Retorna um objeto do tipo float
	 */
	public float getPrecVenda() {
		return precoVenda;
	}
	/**
	 * M�todo de escrita do campo pre�oVenda
	 * @param Requer um parametro do tipo float
	 */
	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	}
	
}
