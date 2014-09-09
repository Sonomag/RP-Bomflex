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
	//Salário Base
	private float salarioBase;
	
	
	/**
	 * Construtor da Classe FuncaoFuncionario.java 
	 * @param idFuncao
	 * @param nome
	 * @param salarioBase
	 */
	public FuncaoFuncionario(int idFuncao, String nome, float salarioBase) {
		super();
		this.idFuncao = idFuncao;
		this.nome = nome;
		this.salarioBase = salarioBase;
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
	public void setIdFuncao(int idFuncao) {
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
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * Método para retorno do campo salarioBase
	 * @return Retorna um objeto do tipo float
	 */
	public float getSalarioBase() {
		return salarioBase;
	}
	/**
	 * Método de escrita do campo salarioBase
	 * @param Requer um parametro do tipo float
	 */
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	
}
