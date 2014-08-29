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
public class Contato {
	//Id Pessoa que vai esta sendo linkado o contato.
	private int idPessoa;
	//Email
	private String email;
	//Contato, Ex: Nome da pessoa que esta sendo dirigida a mensagem.
	private String contato;
	//Observa��es
	private String observacoes;	
	/**
	 * Construtor da Classe Contato.java 
	 * @param idPessoa
	 */
	public Contato(int idPessoa) {
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
	 * M�todo para retorno do campo email
	 * @return Retorna um objeto do tipo String
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * M�todo de escrita do campo email
	 * @param Requer um parametro do tipo String
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * M�todo para retorno do campo observacoes
	 * @return Retorna um objeto do tipo String
	 */
	public String getObservacoes() {
		return observacoes;
	}
	/**
	 * M�todo de escrita do campo observacoes
	 * @param Requer um parametro do tipo String
	 */
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
}
