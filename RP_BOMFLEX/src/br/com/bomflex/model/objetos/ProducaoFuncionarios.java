package br.com.bomflex.model.objetos;
/***
 * Classe do Objeto Producao Funcionarios
 * @author Mailton Araújo - Telefone 71 - 9184-9959
 *
 *-----------------IMPORTANTE-------------------
 *Classe usada para relacionamento entre dois objetos
 */
public class ProducaoFuncionarios {
	//Chave identificadora do id Producao
	private int idProducao;
	//Chave identificadora do id Funcionario
	private int idFuncionario;
	/***
	 * Construtor da classe onde é obrigado a ser informado o idProducao e o idFuncionario
	 * @param idProducao Requer um número INTEIRO
	 * @param idFuncionario Requer um número INTEIRO
	 */
	public ProducaoFuncionarios(int idProducao, int idFuncionario){
		setIdFuncionario(idFuncionario);
		setIdProducao(idProducao);
	}
	/***
	 * Método para retorno do id Produção
	 * @return Retorna um objeto do tipo INTEIRO
	 */
	public int getIdProducao() {
		return idProducao;
	}
	/***
	 * Método de escrita do id Produção
	 * Lembrando que este método é privado e pode ser apenas acessado na construção do objeto.
	 * @param idProducao Requer um número INTEIRO
	 */
	private void setIdProducao(int idProducao) {
		this.idProducao = idProducao;
	}
	/***
	 * Método para retorno do id Funcionario
	 * @return Retorna um objeto do tipo INTEIRO
	 */
	public int getIdFuncionario() {
		return idFuncionario;
	}
	/***
	 * Método de escrita do id Funcionário
	 * Lembrando que este método é privado e pode ser apenas acessado na construção do objeto.
	 * @param idFuncionario Requer um número INTEIRO
	 */
	private void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	
}
