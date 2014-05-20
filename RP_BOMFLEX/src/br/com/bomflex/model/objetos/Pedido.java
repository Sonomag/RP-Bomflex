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
public class Pedido {
	//Chave identificadora do Pedido
	private int idPedido;
	//Chave identificadora do Usuario que inseriu o pedido
	private int idUsuario;
	//Chave do Funcionario que Gerou o Pedido
	private int idFuncionario;
	//Chave da Carteira de Pagamento - Forma que o Cliente vai pagar Ex: � vista, A Prazo 15 dias, etc.
	private int idCarteiraPagamento;
	//Chave identificadora do veiculo que vai Entregar.
	private int idVeiculoEntrega;
	//Chave do Cliente
	private int idCliente;
	//Data do Pedido
	private String dataPedido;
	//Data da Entrega
	private String dataEntrega;
	//Hora do Pedido
	private String horaPedido;
	//Hora da Entrega
	private String horaEntrega;
	
	/**
	 * Construtor da Classe Pedido.java 
	 * @param idPedido Requer um parametro do tipo INTEIRO
	 * @param idUsuario Requer um parametro do tipo INTEIRO
	 * @param idFuncionario Requer um parametro do tipo INTEIRO
	 * @param idCarteiraPagamento Requer um parametro do tipo INTEIRO
	 * @param idCliente Requer um parametro do tipo INTEIRO
	 * @param dataPedido Requer um parametro do tipo String
	 * @param horaPedido Requer um parametro do tipo String
	 */
	public Pedido(int idPedido, int idUsuario, int idFuncionario,
			int idCarteiraPagamento, int idCliente, String dataPedido,
			String horaPedido) {
		setDataPedido(dataPedido);
		setHoraPedido(horaPedido);
		setIdCarteiraPagamento(idCarteiraPagamento);
		setIdCliente(idCliente);
		setIdFuncionario(idFuncionario);
		setIdPedido(idPedido);
		setIdUsuario(idUsuario);
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
	private void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	/**
	 * M�todo para retorno do campo idFuncionario
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdFuncionario() {
		return idFuncionario;
	}
	/**
	 * M�todo de escrita do campo idFuncionario
	 * @param Requer um parametro do tipo int
	 */
	private void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
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
	private void setIdCarteiraPagamento(int idCarteiraPagamento) {
		this.idCarteiraPagamento = idCarteiraPagamento;
	}
	/**
	 * M�todo para retorno do campo idVeiculoEntrega
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdVeiculoEntrega() {
		return idVeiculoEntrega;
	}
	/**
	 * M�todo de escrita do campo idVeiculoEntrega
	 * @param Requer um parametro do tipo int
	 */
	public void setIdVeiculoEntrega(int idVeiculoEntrega) {
		this.idVeiculoEntrega = idVeiculoEntrega;
	}
	/**
	 * M�todo para retorno do campo idCliente
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdCliente() {
		return idCliente;
	}
	/**
	 * M�todo de escrita do campo idCliente
	 * @param Requer um parametro do tipo int
	 */
	private void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	/**
	 * M�todo para retorno do campo dataPedido
	 * @return Retorna um objeto do tipo String
	 */
	public String getDataPedido() {
		return dataPedido;
	}
	/**
	 * M�todo de escrita do campo dataPedido
	 * @param Requer um parametro do tipo String
	 */
	private void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}
	/**
	 * M�todo para retorno do campo dataEntrega
	 * @return Retorna um objeto do tipo String
	 */
	public String getDataEntrega() {
		return dataEntrega;
	}
	/**
	 * M�todo de escrita do campo dataEntrega
	 * @param Requer um parametro do tipo String
	 */
	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	/**
	 * M�todo para retorno do campo horaPedido
	 * @return Retorna um objeto do tipo String
	 */
	public String getHoraPedido() {
		return horaPedido;
	}
	/**
	 * M�todo de escrita do campo horaPedido
	 * @param Requer um parametro do tipo String
	 */
	private void setHoraPedido(String horaPedido) {
		this.horaPedido = horaPedido;
	}
	/**
	 * M�todo para retorno do campo horaEntrega
	 * @return Retorna um objeto do tipo String
	 */
	public String getHoraEntrega() {
		return horaEntrega;
	}
	/**
	 * M�todo de escrita do campo horaEntrega
	 * @param Requer um parametro do tipo String
	 */
	public void setHoraEntrega(String horaEntrega) {
		this.horaEntrega = horaEntrega;
	}
	
}
