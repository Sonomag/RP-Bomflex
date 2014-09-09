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
public class Funcionario {
	//Chave identificadora do idFuncionario
	private int idFuncionario;
	//Chave identificadora do idPessoaFisica
	private int idPessoaFisica;
	//Chave identificadora da idFuncao
	private int idFuncao;
	//Bonificações
	private float bonificacoes;
	/**
	 * Método para retorno do campo bonificacoes
	 * @return Retorna um objeto do tipo float
	 */
	public float getBonificacoes() {
		return bonificacoes;
	}
	/**
	 * Método de escrita do campo bonificacoes
	 * @param Requer um parametro do tipo float
	 */
	public void setBonificacoes(float bonificacoes) {
		this.bonificacoes = bonificacoes;
	}
	/**
	 * Construtor da Classe Funcionario.java 
	 * @param idFuncionario
	 * @param idPessoaFisica
	 * @param idFuncao
	 */
	public Funcionario(int idFuncionario, int idPessoaFisica, int idFuncao) {
		setIdFuncao(idFuncao);
		setIdFuncionario(idFuncionario);
		setIdPessoaFisica(idPessoaFisica);
	}
	/**
	 * Método para retorno do campo idFuncionario
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdFuncionario() {
		return idFuncionario;
	}
	/**
	 * Método de escrita do campo idFuncionario
	 * @param Requer um parametro do tipo int
	 */
	private void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
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
	private void setIdPessoaFisica(int idPessoaFisica) {
		this.idPessoaFisica = idPessoaFisica;
	}
	/**
	 * Método para retorno do campo idFuncao
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdFuncao() {
		return idFuncao;
	}
	/**
	 * Método de escrita do campo idFuncao
	 * @param Requer um parametro do tipo int
	 */
	private void setIdFuncao(int idFuncao) {
		this.idFuncao = idFuncao;
	}

	

}
