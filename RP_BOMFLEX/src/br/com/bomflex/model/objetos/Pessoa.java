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
public class Pessoa {
	//ID Pessoa
	private int idPessoa;
	//ID Endere�o
	private int idEndereco;
	//ID TipoPessoa
	private int idTipoPessoa;
	//Este ID serve para identifica-lo se for pessoa f�sica qual o seu ID,
	//e se for juridica tambem.
	private int id;
	
	/**
	 * Construtor da Classe Pessoa.java 
	 * @param idPessoa
	 * @param idEndere�o
	 * @param idTipoPessoa
	 * @param id
	 */
	public Pessoa(int idPessoa) {
		setIdPessoa(idPessoa);
	}
	/**
	 * M�todo para retorno do campo idPessoa
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdPessoa() {
		return idPessoa;
	}
	/**
	 * M�todo de escrita do campo idPessoa
	 * @param Requer um parametro do tipo int
	 */
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	/**
	 * M�todo para retorno do campo idEndere�o
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdEndereco() {
		return idEndereco;
	}
	/**
	 * M�todo de escrita do campo idEndere�o
	 * @param Requer um parametro do tipo int
	 */
	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}
	/**
	 * M�todo para retorno do campo idTipoPessoa
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdTipoPessoa() {
		return idTipoPessoa;
	}
	/**
	 * M�todo de escrita do campo idTipoPessoa
	 * @param Requer um parametro do tipo int
	 */
	public void setIdTipoPessoa(int idTipoPessoa) {
		this.idTipoPessoa = idTipoPessoa;
	}
	/**
	 * M�todo para retorno do campo id
	 * @return Retorna um objeto do tipo int
	 */
	public int getId() {
		return id;
	}
	/**
	 * M�todo de escrita do campo id
	 * @param Requer um parametro do tipo int
	 */
	public void setId(int id) {
		this.id = id;
	}
	
}
