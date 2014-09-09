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
public class PessoaFisica {
	//ID Pessoa Física
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
	 * Método para retorno do campo idPessoaFisica
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdPessoaFisica() {
		return idPessoaFisica;
	}
	/**
	 * Método de escrita do campo idPessoaFisica
	 * @param Requer um parametro do tipo int
	 */
	public void setIdPessoaFisica(int idPessoaFisica) {
		this.idPessoaFisica = idPessoaFisica;
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
	 * Método para retorno do campo nome
	 * @return Retorna um objeto do tipo String
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Método de escrita do campo nome
	 * @param Requer um parametro do tipo String
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * Método para retorno do campo sobrenome
	 * @return Retorna um objeto do tipo String
	 */
	public String getSobrenome() {
		return sobrenome;
	}
	/**
	 * Método de escrita do campo sobrenome
	 * @param Requer um parametro do tipo String
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	/**
	 * Método para retorno do campo apelido
	 * @return Retorna um objeto do tipo String
	 */
	public String getApelido() {
		return apelido;
	}
	/**
	 * Método de escrita do campo apelido
	 * @param Requer um parametro do tipo String
	 */
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	/**
	 * Método para retorno do campo cpf
	 * @return Retorna um objeto do tipo String
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * Método de escrita do campo cpf
	 * @param Requer um parametro do tipo String
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	/**
	 * Método para retorno do campo rg
	 * @return Retorna um objeto do tipo String
	 */
	public String getRg() {
		return rg;
	}
	/**
	 * Método de escrita do campo rg
	 * @param Requer um parametro do tipo String
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}
	
}
