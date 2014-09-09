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
public class Telefone {
	//Id do Tipo de Telefone
	private int idTipoTelefone;
	//Id da Pessoa que o Telefone esta relacionado
	private int idPessoa;
	//DDD
	private String ddd;
	//Telefone
	private String telefone;
	//Contato
	private String contato;
	
	/**
	 * Construtor da Classe Telefone.java 
	 * @param idTipoTelefone
	 * @param idPessoa
	 * @param ddd
	 * @param telefone
	 */
	public Telefone(int idTipoTelefone, int idPessoa, String ddd,
			String telefone) {
		setIdTipoTelefone(idTipoTelefone);
		setIdPessoa(idPessoa);
		setDdd(ddd);
		setTelefone(telefone);
	}
	/**
	 * Método para retorno do campo idTipoTelefone
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdTipoTelefone() {
		return idTipoTelefone;
	}
	/**
	 * Método de escrita do campo idTipoTelefone
	 * @param Requer um parametro do tipo int
	 */
	public void setIdTipoTelefone(int idTipoTelefone) {
		this.idTipoTelefone = idTipoTelefone;
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
	 * Método para retorno do campo ddd
	 * @return Retorna um objeto do tipo String
	 */
	public String getDdd() {
		return ddd;
	}
	/**
	 * Método de escrita do campo ddd
	 * @param Requer um parametro do tipo String
	 */
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	/**
	 * Método para retorno do campo telefone
	 * @return Retorna um objeto do tipo String
	 */
	public String getTelefone() {
		return telefone;
	}
	/**
	 * Método de escrita do campo telefone
	 * @param Requer um parametro do tipo String
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	/**
	 * Método para retorno do campo contato
	 * @return Retorna um objeto do tipo String
	 */
	public String getContato() {
		return contato;
	}
	/**
	 * Método de escrita do campo contato
	 * @param Requer um parametro do tipo String
	 */
	public void setContato(String contato) {
		this.contato = contato;
	}
	
}
