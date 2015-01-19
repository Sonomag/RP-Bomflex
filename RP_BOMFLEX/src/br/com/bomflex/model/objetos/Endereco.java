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
public class Endereco {
	//ID Endere�o
	private int idEndereco;
	//ID Pais
	private int idPais;
	//ID Estado
	private int idEstado;
	//ID Cidade
	private int idCidade;
	//ID Bairro
	private String bairro;
	//Logradouro
	private String logradouro;
	//Complemento do Endere�o
	private String complemento;
	//Cep
	private String cep;
	/**
	 * Construtor da Classe Endereco.java 
	 * @param idEndereco
	 * @param idPais
	 * @param idEstado
	 * @param idCidade
	 * @param idBairro
	 * @param logradouro
	 * @param cep
	 */
	public Endereco(int idEndereco, int idPais, int idEstado, int idCidade) {

		setIdCidade(idCidade);
		setIdEndereco(idEndereco);
		setIdEstado(idEstado);
		setIdPais(idPais);
	}
	/**
	 * M�todo para retorno do campo idEndereco
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdEndereco() {
		return idEndereco;
	}
	/**
	 * M�todo de escrita do campo idEndereco
	 * @param Requer um parametro do tipo int
	 */
	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}
	/**
	 * M�todo para retorno do campo idPais
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdPais() {
		return idPais;
	}
	/**
	 * M�todo de escrita do campo idPais
	 * @param Requer um parametro do tipo int
	 */
	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}
	/**
	 * M�todo para retorno do campo idEstado
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdEstado() {
		return idEstado;
	}
	/**
	 * M�todo de escrita do campo idEstado
	 * @param Requer um parametro do tipo int
	 */
	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}
	/**
	 * M�todo para retorno do campo idCidade
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdCidade() {
		return idCidade;
	}
	/**
	 * M�todo de escrita do campo idCidade
	 * @param Requer um parametro do tipo int
	 */
	public void setIdCidade(int idCidade) {
		this.idCidade = idCidade;
	}
	/**
	 * M�todo para retorno do campo idBairro
	 * @return Retorna um objeto do tipo int
	 */
	public String getIdBairro() {
		return bairro;
	}
	/**
	 * M�todo de escrita do campo idBairro
	 * @param Requer um parametro do tipo int
	 */
	public void setIdBairro(String bairro) {
		this.bairro = bairro;
	}
	/**
	 * M�todo para retorno do campo logradouro
	 * @return Retorna um objeto do tipo String
	 */
	public String getLogradouro() {
		return logradouro;
	}
	/**
	 * M�todo de escrita do campo logradouro
	 * @param Requer um parametro do tipo String
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	/**
	 * M�todo para retorno do campo complemento
	 * @return Retorna um objeto do tipo String
	 */
	public String getComplemento() {
		return complemento;
	}
	/**
	 * M�todo de escrita do campo complemento
	 * @param Requer um parametro do tipo String
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	/**
	 * M�todo para retorno do campo cep
	 * @return Retorna um objeto do tipo String
	 */
	public String getCep() {
		return cep;
	}
	/**
	 * M�todo de escrita do campo cep
	 * @param Requer um parametro do tipo String
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}
	
}
