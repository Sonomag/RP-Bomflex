package br.com.bomflex.model.objetos;

/**
 * @author Mailton Ara�jo - Analista de Sistemas
 * Telefone - 71 - 3301-9000
 * E-mail - mailton@sonomag.com.br
 * 		    pcmotion@gmail.com
 */
public class ItensPedido {
	//Chave do Pedido
	private int idPedido;
	//Chave do Produto
	private int idProduto;
	//Chave do tipo de Desconto
	private int idTipoDesconto;
	//Quantidade
	private float quantidade;
	//Valor Unit�rio
	private float valorUnitario;
	//Desconto
	private float desconto;
	//Valor total
	private float valorTotal;
	/**
	 * Construtor da Classe ItensPedido.java 
	 * @param idPedido Requer um paramentro do tipo INTEIRO
	 * @param idProduto Requer um paramentro do tipo INTEIRO
	 * @param idTipoDesconto Requer um paramentro do tipo INTEIRO
	 * @param quantidade Requer um paramentro do tipo FLOAT
	 * @param valorUnitario Requer um paramentro do tipo FLOAT
	 * @param desconto Requer um paramentro do tipo FLOAT
	 * @param valorTotal Requer um paramentro do tipo FLOAT
	 */
	public ItensPedido(int idPedido, int idProduto, int idTipoDesconto,
			float quantidade, float valorUnitario, float desconto,
			float valorTotal) {
		setDesconto(desconto);
		setIdPedido(idPedido);
		setIdProduto(idProduto);
		setIdTipoDesconto(idTipoDesconto);
		setQuantidade(quantidade);
		setValorTotal(valorTotal);
		setValorUnitario(valorUnitario);
	}
	/**
	 * M�todo para retorno do campo idPedido
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdPedido() {
		return idPedido;
	}
	/**
	 * M�todo de escrita do campo idPedido
	 * @param Requer um parametro do tipo int
	 */
	private void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
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
	 * M�todo para retorno do campo idTipoDesconto
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdTipoDesconto() {
		return idTipoDesconto;
	}
	/**
	 * M�todo de escrita do campo idTipoDesconto
	 * @param Requer um parametro do tipo int
	 */
	private void setIdTipoDesconto(int idTipoDesconto) {
		this.idTipoDesconto = idTipoDesconto;
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
	/**
	 * M�todo para retorno do campo valorUnitario
	 * @return Retorna um objeto do tipo float
	 */
	public float getValorUnitario() {
		return valorUnitario;
	}
	/**
	 * M�todo de escrita do campo valorUnitario
	 * @param Requer um parametro do tipo float
	 */
	private void setValorUnitario(float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	/**
	 * M�todo para retorno do campo desconto
	 * @return Retorna um objeto do tipo float
	 */
	public float getDesconto() {
		return desconto;
	}
	/**
	 * M�todo de escrita do campo desconto
	 * @param Requer um parametro do tipo float
	 */
	private void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	/**
	 * M�todo para retorno do campo valorTotal
	 * @return Retorna um objeto do tipo float
	 */
	public float getValorTotal() {
		return valorTotal;
	}
	/**
	 * M�todo de escrita do campo valorTotal
	 * @param Requer um parametro do tipo float
	 */
	private void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}
