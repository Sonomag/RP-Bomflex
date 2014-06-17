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
public class PessoaJuridica {
	//Chave identificadora da Pessoa Juridica
	private int idPessoaJuridica;
	//Chave identificadora do ID Pessoa
	private int idPessoa;
	//Razao Social
	private String razaoSocial;
	//Nome Fantasia
	private String nomeFantasia;
	//CPNJ
	private String cnpj;
	//Inscri��o Estadual
	
	private String inscricaoEstadual;
	/**
	 * Construtor da Classe PessoaJuridica.java 
	 * @param idPessoaJuridica Requer um paramentro do tipo INTEIRO
	 * @param idPessoa Requer um paramentro do tipo INTEIRO
	 * @param razaoSocial Requer um paramentro do tipo String
	 * @param nomeFantasia Requer um paramentro do tipo String
	 * @param cnpj Requer um parametro do tipo String
	 */
	public PessoaJuridica(int idPessoaJuridica, int idPessoa, String razaoSocial, String cnpj) {
		setCnpj(cnpj);
		setIdPessoa(idPessoa);
		setIdPessoaJuridica(idPessoaJuridica);
		setRazaoSocial(razaoSocial);
	}
	
	/**
	 * M�todo para retorno do campo idPessoaJuridica
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdPessoaJuridica() {
		return idPessoaJuridica;
	}
	/**
	 * M�todo de escrita do campo idPessoaJuridica
	 * @param Requer um parametro do tipo int
	 */
	private void setIdPessoaJuridica(int idPessoaJuridica) {
		this.idPessoaJuridica = idPessoaJuridica;
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
	private void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	/**
	 * M�todo para retorno do campo razaoSocial
	 * @return Retorna um objeto do tipo String
	 */
	public String getRazaoSocial() {
		return razaoSocial;
	}
	/**
	 * M�todo de escrita do campo razaoSocial
	 * @param Requer um parametro do tipo String
	 */
	private void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	/**
	 * M�todo para retorno do campo nomeFantasia
	 * @return Retorna um objeto do tipo String
	 */
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	/**
	 * M�todo de escrita do campo nomeFantasia
	 * @param Requer um parametro do tipo String
	 */
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	/**
	 * M�todo para retorno do campo cnpj
	 * @return Retorna um objeto do tipo String
	 */
	public String getCnpj() {
		return cnpj;
	}
	/**
	 * M�todo de escrita do campo cnpj
	 * @param Requer um parametro do tipo String
	 */
	private void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	/**
	 * M�todo para retorno do campo inscricaoEstadual
	 * @return Retorna um objeto do tipo String
	 */
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	/**
	 * M�todo de escrita do campo inscricaoEstadual
	 * @param Requer um parametro do tipo String
	 */
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
}
