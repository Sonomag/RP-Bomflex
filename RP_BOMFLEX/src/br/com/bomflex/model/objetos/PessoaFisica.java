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
public class PessoaFisica {
	//ID Pessoa F�sica
	private int idPessoaFisica;
	//ID Pessoa
	private int idPessoa;
	//Nome
	private String nome;
	//Sobrenome
	private String sobrenome;
	//Apelido
	private String apelido;
	//CPF
	private String cpf;
	//RG
	private String rg;
	//Data Nascimento
	private String dataNascimento;
		
	/**
	 * Construtor da Classe PessoaFisica.java 
	 * @param idPessoaFisica
	 * @param idPessoa
	 * @param nome
	 * @param cpf
	 */
	public PessoaFisica(int idPessoaFisica, int idPessoa, String nome,
			String cpf) {
		super();
		this.idPessoaFisica = idPessoaFisica;
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.cpf = cpf;
	}
	/**
	 * M�todo para retorno do campo idPessoaFisica
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdPessoaFisica() {
		return idPessoaFisica;
	}
	/**
	 * M�todo de escrita do campo idPessoaFisica
	 * @param Requer um parametro do tipo int
	 */
	public void setIdPessoaFisica(int idPessoaFisica) {
		this.idPessoaFisica = idPessoaFisica;
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
	 * M�todo para retorno do campo nome
	 * @return Retorna um objeto do tipo String
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * M�todo de escrita do campo nome
	 * @param Requer um parametro do tipo String
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * M�todo para retorno do campo sobrenome
	 * @return Retorna um objeto do tipo String
	 */
	public String getSobrenome() {
		return sobrenome;
	}
	/**
	 * M�todo de escrita do campo sobrenome
	 * @param Requer um parametro do tipo String
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	/**
	 * M�todo para retorno do campo apelido
	 * @return Retorna um objeto do tipo String
	 */
	public String getApelido() {
		return apelido;
	}
	/**
	 * M�todo de escrita do campo apelido
	 * @param Requer um parametro do tipo String
	 */
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	/**
	 * M�todo para retorno do campo cpf
	 * @return Retorna um objeto do tipo String
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * M�todo de escrita do campo cpf
	 * @param Requer um parametro do tipo String
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	/**
	 * M�todo para retorno do campo rg
	 * @return Retorna um objeto do tipo String
	 */
	public String getRg() {
		return rg;
	}
	/**
	 * M�todo de escrita do campo rg
	 * @param Requer um parametro do tipo String
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}
	/**
	 * Método para retorno do campo dataNascimento
	 * @return Retorna um objeto do tipo String
	 */
	public String getDataNascimento() {
		return dataNascimento;
	}
	/**
	 * Método de escrita do campo dataNascimento
	 * @param Requer um parametro do tipo String
	 */
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
