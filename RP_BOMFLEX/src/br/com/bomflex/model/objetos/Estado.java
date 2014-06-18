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
public class Estado {
	//Id Estado
	private int idEstado;
	//Id Pais que o estado se encontra
	private int idPais;
	//Nome Estado
	private String nomeEstado;
	//Sigla do Estado
	private String siglaEstado;
	
	/**
	 * Construtor da Classe Estado.java 
	 * @param idEstado
	 * @param idPais
	 * @param nomeEstado
	 * @param siglaEstado
	 */
	public Estado(int idEstado, int idPais, String nomeEstado,
			String siglaEstado) {
		setIdEstado(idEstado);
		setIdPais(idPais);
		setNomeEstado(nomeEstado);
		setSiglaEstado(siglaEstado);
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
	 * Método para retorno do campo nomeEstado
	 * @return Retorna um objeto do tipo String
	 */
	public String getNomeEstado() {
		return nomeEstado;
	}
	/**
	 * Método de escrita do campo nomeEstado
	 * @param Requer um parametro do tipo String
	 */
	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}
	/**
	 * Método para retorno do campo siglaEstado
	 * @return Retorna um objeto do tipo String
	 */
	public String getSiglaEstado() {
		return siglaEstado;
	}
	/**
	 * Método de escrita do campo siglaEstado
	 * @param Requer um parametro do tipo String
	 */
	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}
}
