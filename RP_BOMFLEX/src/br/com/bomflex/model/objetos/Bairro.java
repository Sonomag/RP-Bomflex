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
public class Bairro {
	//Id Bairro
	private int idBairro;
	//Id Cidade que o bairro se encontra
	private int idCidade;
	//Nome Bairro
	private String nomeBairro;
	
	/**
	 * Construtor da Classe Bairro.java 
	 * @param idBairro
	 * @param idCidade
	 * @param nomeBairro
	 */
	public Bairro(int idBairro, int idCidade, String nomeBairro) {
		setIdBairro(idBairro);
		setIdCidade(idCidade);
		setNomeBairro(nomeBairro);
	}
	/**
	 * M�todo para retorno do campo idBairro
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdBairro() {
		return idBairro;
	}
	/**
	 * M�todo de escrita do campo idBairro
	 * @param Requer um parametro do tipo int
	 */
	public void setIdBairro(int idBairro) {
		this.idBairro = idBairro;
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
	 * M�todo para retorno do campo nomeBairro
	 * @return Retorna um objeto do tipo String
	 */
	public String getNomeBairro() {
		return nomeBairro;
	}
	/**
	 * M�todo de escrita do campo nomeBairro
	 * @param Requer um parametro do tipo String
	 */
	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}
	
}
