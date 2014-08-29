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
public class Pessoa {
	//ID Pessoa
	private int idPessoa;
	//ID Endereço
	private int idEndereço;
	//ID TipoPessoa
	private int idTipoPessoa;
	//Este ID serve para identifica-lo se for pessoa física qual o seu ID,
	//e se for juridica tambem.
	private int id;
	
	/**
	 * Construtor da Classe Pessoa.java 
	 * @param idPessoa
	 * @param idEndereço
	 * @param idTipoPessoa
	 * @param id
	 */
	public Pessoa(int idPessoa, int idEndereço, int idTipoPessoa, int id) {
		setId(id);
		setIdPessoa(idPessoa);
		setIdEndereço(idEndereço);
		setIdTipoPessoa(idTipoPessoa);
	}
	/**
	 * Método para retorno do campo idPessoa
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdPessoa() {
		return idPessoa;
	}
	/**
	 * Método de escrita do campo idPessoa
	 * @param Requer um parametro do tipo int
	 */
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	/**
	 * Método para retorno do campo idEndereço
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdEndereço() {
		return idEndereço;
	}
	/**
	 * Método de escrita do campo idEndereço
	 * @param Requer um parametro do tipo int
	 */
	public void setIdEndereço(int idEndereço) {
		this.idEndereço = idEndereço;
	}
	/**
	 * Método para retorno do campo idTipoPessoa
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdTipoPessoa() {
		return idTipoPessoa;
	}
	/**
	 * Método de escrita do campo idTipoPessoa
	 * @param Requer um parametro do tipo int
	 */
	public void setIdTipoPessoa(int idTipoPessoa) {
		this.idTipoPessoa = idTipoPessoa;
	}
	/**
	 * Método para retorno do campo id
	 * @return Retorna um objeto do tipo int
	 */
	public int getId() {
		return id;
	}
	/**
	 * Método de escrita do campo id
	 * @param Requer um parametro do tipo int
	 */
	public void setId(int id) {
		this.id = id;
	}
	
}
