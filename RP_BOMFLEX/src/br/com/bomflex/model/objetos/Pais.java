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
public class Pais {
	//Id Pais
	private int idPais;
	//Nome Pais
	private String nomePais;
	//Sigla do Pais
	private String siglaPais;
	
	/**
	 * Construtor da Classe Pais.java 
	 * @param idPais
	 * @param nomePais
	 * @param siglaPais
	 */
	public Pais(int idPais, String nomePais, String siglaPais) {
		setIdPais(idPais);
		setNomePais(nomePais);
		setSiglaPais(siglaPais);
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
	 * Método para retorno do campo nomePais
	 * @return Retorna um objeto do tipo String
	 */
	public String getNomePais() {
		return nomePais;
	}
	/**
	 * Método de escrita do campo nomePais
	 * @param Requer um parametro do tipo String
	 */
	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}
	/**
	 * Método para retorno do campo siglaPais
	 * @return Retorna um objeto do tipo String
	 */
	public String getSiglaPais() {
		return siglaPais;
	}
	/**
	 * Método de escrita do campo siglaPais
	 * @param Requer um parametro do tipo String
	 */
	public void setSiglaPais(String siglaPais) {
		this.siglaPais = siglaPais;
	}
	
}
