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
public class Pais {
	//Id Pais
	private int idPais;
	//Nome Pais
	private String nomePais;

	
	/**
	 * Construtor da Classe Pais.java 
	 * @param idPais
	 * @param nomePais
	 * @param siglaPais
	 */
	public Pais(int idPais, String nomePais) {
		setIdPais(idPais);
		setNomePais(nomePais);
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
	 * M�todo para retorno do campo nomePais
	 * @return Retorna um objeto do tipo String
	 */
	public String getNomePais() {
		return nomePais;
	}
	/**
	 * M�todo de escrita do campo nomePais
	 * @param Requer um parametro do tipo String
	 */
	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}
	
}
