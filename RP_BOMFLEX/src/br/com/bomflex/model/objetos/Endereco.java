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
public class Endereco {
	//ID Endereço
	private int idEndereco;
	//ID Pais
	private int idPais;
	//ID Estado
	private int idEstado;
	//ID Cidade
	private int idCidade;
	//ID Bairro
	private int idBairro;
	//Logradouro
	private String logradouro;
	//Complemento do Endereço
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
	public Endereco(int idEndereco, int idPais, int idEstado, int idCidade,
			int idBairro, String logradouro, String cep) {
		setCep(cep);
		setIdBairro(idBairro);
		setIdCidade(idCidade);
		setIdEndereco(idEndereco);
		setIdEstado(idEstado);
		setIdPais(idPais);
		setLogradouro(logradouro);
	}
	/**
	 * Método para retorno do campo idEndereco
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdEndereco() {
		return idEndereco;
	}
	/**
	 * Método de escrita do campo idEndereco
	 * @param Requer um parametro do tipo int
	 */
	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}
	/**
	 * Método para retorno do campo idPais
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdPais() {
		return idPais;
	}
	/**
	 * Método de escrita do campo idPais
	 * @param Requer um parametro do tipo int
	 */
	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}
	/**
	 * Método para retorno do campo idEstado
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdEstado() {
		return idEstado;
	}
	/**
	 * Método de escrita do campo idEstado
	 * @param Requer um parametro do tipo int
	 */
	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}
	/**
	 * Método para retorno do campo idCidade
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdCidade() {
		return idCidade;
	}
	/**
	 * Método de escrita do campo idCidade
	 * @param Requer um parametro do tipo int
	 */
	public void setIdCidade(int idCidade) {
		this.idCidade = idCidade;
	}
	/**
	 * Método para retorno do campo idBairro
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdBairro() {
		return idBairro;
	}
	/**
	 * Método de escrita do campo idBairro
	 * @param Requer um parametro do tipo int
	 */
	public void setIdBairro(int idBairro) {
		this.idBairro = idBairro;
	}
	/**
	 * Método para retorno do campo logradouro
	 * @return Retorna um objeto do tipo String
	 */
	public String getLogradouro() {
		return logradouro;
	}
	/**
	 * Método de escrita do campo logradouro
	 * @param Requer um parametro do tipo String
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	/**
	 * Método para retorno do campo complemento
	 * @return Retorna um objeto do tipo String
	 */
	public String getComplemento() {
		return complemento;
	}
	/**
	 * Método de escrita do campo complemento
	 * @param Requer um parametro do tipo String
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	/**
	 * Método para retorno do campo cep
	 * @return Retorna um objeto do tipo String
	 */
	public String getCep() {
		return cep;
	}
	/**
	 * Método de escrita do campo cep
	 * @param Requer um parametro do tipo String
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}
	
}
