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
	//Observa��es
	private String observa��es;
	
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
	 * M�todo para retorno do campo idTipoTelefone
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdTipoTelefone() {
		return idTipoTelefone;
	}
	/**
	 * M�todo de escrita do campo idTipoTelefone
	 * @param Requer um parametro do tipo int
	 */
	public void setIdTipoTelefone(int idTipoTelefone) {
		this.idTipoTelefone = idTipoTelefone;
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
	 * M�todo para retorno do campo ddd
	 * @return Retorna um objeto do tipo String
	 */
	public String getDdd() {
		return ddd;
	}
	/**
	 * M�todo de escrita do campo ddd
	 * @param Requer um parametro do tipo String
	 */
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	/**
	 * M�todo para retorno do campo telefone
	 * @return Retorna um objeto do tipo String
	 */
	public String getTelefone() {
		return telefone;
	}
	/**
	 * M�todo de escrita do campo telefone
	 * @param Requer um parametro do tipo String
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	/**
	 * M�todo para retorno do campo contato
	 * @return Retorna um objeto do tipo String
	 */
	public String getContato() {
		return contato;
	}
	/**
	 * M�todo de escrita do campo contato
	 * @param Requer um parametro do tipo String
	 */
	public void setContato(String contato) {
		this.contato = contato;
	}
	/**
	 * M�todo para retorno do campo observa��es
	 * @return Retorna um objeto do tipo String
	 */
	public String getObserva��es() {
		return observa��es;
	}
	/**
	 * M�todo de escrita do campo observa��es
	 * @param Requer um parametro do tipo String
	 */
	public void setObserva��es(String observa��es) {
		this.observa��es = observa��es;
	}
	
	
}