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
public class Veiculos {
	private String placaVeiculo;
	//Chassi do Veiculo
	//Id do Motorista
	private int idMotorista;
	//Modelo do Veículo
	private String modeloVeiculo;
	//Ano do Veiculo
	private String anoVeiculo;
	//Placa do Veiculo
	private String chassiVeiculo;
	//Renavam do Veiculo;
	private String renavanVeiculo;
	/**
	 * Construtor da Classe Veiculos.java 
	 * @param placaVeiculo
	 * @param idMotorista
	 */
	public Veiculos(String placaVeiculo, int idMotorista) {
		setPlacaVeiculo(placaVeiculo);
		setIdMotorista(idMotorista);
	}
	/**
	 * Método para retorno do campo idMotorista
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdMotorista() {
		return idMotorista;
	}
	/**
	 * Método de escrita do campo idMotorista
	 * @param Requer um parametro do tipo int
	 */
	public void setIdMotorista(int idMotorista) {
		this.idMotorista = idMotorista;
	}
	/**
	 * Método para retorno do campo modeloVeiculo
	 * @return Retorna um objeto do tipo String
	 */
	public String getModeloVeiculo() {
		return modeloVeiculo;
	}
	/**
	 * Método de escrita do campo modeloVeiculo
	 * @param Requer um parametro do tipo String
	 */
	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}
	/**
	 * Método para retorno do campo anoVeiculo
	 * @return Retorna um objeto do tipo String
	 */
	public String getAnoVeiculo() {
		return anoVeiculo;
	}
	/**
	 * Método de escrita do campo anoVeiculo
	 * @param Requer um parametro do tipo String
	 */
	public void setAnoVeiculo(String anoVeiculo) {
		this.anoVeiculo = anoVeiculo;
	}
	/**
	 * Método para retorno do campo placaVeiculo
	 * @return Retorna um objeto do tipo String
	 */
	public String getPlacaVeiculo() {
		return placaVeiculo;
	}
	/**
	 * Método de escrita do campo placaVeiculo
	 * @param Requer um parametro do tipo String
	 */
	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}
	/**
	 * Método para retorno do campo chassiVeiculo
	 * @return Retorna um objeto do tipo String
	 */
	public String getChassiVeiculo() {
		return chassiVeiculo;
	}
	/**
	 * Método de escrita do campo chassiVeiculo
	 * @param Requer um parametro do tipo String
	 */
	public void setChassiVeiculo(String chassiVeiculo) {
		this.chassiVeiculo = chassiVeiculo;
	}
	/**
	 * Método para retorno do campo renavanVeiculo
	 * @return Retorna um objeto do tipo String
	 */
	public String getRenavanVeiculo() {
		return renavanVeiculo;
	}
	/**
	 * Método de escrita do campo renavanVeiculo
	 * @param Requer um parametro do tipo String
	 */
	public void setRenavanVeiculo(String renavanVeiculo) {
		this.renavanVeiculo = renavanVeiculo;
	}
	
}
