/**
 * 
 */
package br.com.bomflex.model.objetos;

/**
 * @author Mailton Araújo - Analista de Sistemas
 * Telefone - 71 - 3301-9000
 * E-mail - mailton@sonomag.com.br
 * 		    pcmotion@gmail.com
 * 
 * -------------------IMPORTANTE----------------------
 * Classe usada para relacionamento entre dois objetos
 */
public class FuncaoFuncionario {
	//Chave identificadora do id Funcao
	private int idFuncao;
	//Nome da Funcao
	private String nome;
	
	/**
	 * Construtor da Classe FuncaoFuncionario.java 
	 * @param idFuncao Requer um parametro do tipo INTEIRO
	 * @param nome Requer um parametro do tipo String
	 */
	public FuncaoFuncionario(int idFuncao, String nome) {
		setIdFuncao(idFuncao);
		setNome(nome);
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
	private void setNome(String nome) {
		this.nome = nome;
	}

	
	
}
