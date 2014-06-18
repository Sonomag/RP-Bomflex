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
public class Cidade {
	//Id Cidade
	private int idCidade;
	//Id Estado que a cidade se encontra
	private int idEstado;
	//Nome Cidade
	private String nomeCidade;
	
	/**
	 * Construtor da Classe Cidade.java 
	 * @param idCidade
	 * @param idEstado
	 * @param nomeCidade
	 */
	public Cidade(int idCidade, int idEstado, String nomeCidade) {
		setIdCidade(idCidade);
		setIdEstado(idEstado);
		setNomeCidade(nomeCidade);
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
	 * M�todo para retorno do campo nomeCidade
	 * @return Retorna um objeto do tipo String
	 */
	public String getNomeCidade() {
		return nomeCidade;
	}
	/**
	 * M�todo de escrita do campo nomeCidade
	 * @param Requer um parametro do tipo String
	 */
	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}
	
}
