package br.com.bomflex.model.objetos;
/***
 * Classe do Objeto Producao Funcionarios
 * @author Mailton Ara�jo - Telefone 71 - 9184-9959
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
	 * Construtor da classe onde � obrigado a ser informado o idProducao e o idFuncionario
	 * @param idProducao Requer um n�mero INTEIRO
	 * @param idFuncionario Requer um n�mero INTEIRO
	 */
	public ProducaoFuncionarios(int idProducao, int idFuncionario){
		setIdFuncionario(idFuncionario);
		setIdProducao(idProducao);
	}
	/***
	 * M�todo para retorno do id Produ��o
	 * @return Retorna um objeto do tipo INTEIRO
	 */
	public int getIdProducao() {
		return idProducao;
	}
	/***
	 * M�todo de escrita do id Produ��o
	 * Lembrando que este m�todo � privado e pode ser apenas acessado na constru��o do objeto.
	 * @param idProducao Requer um n�mero INTEIRO
	 */
	private void setIdProducao(int idProducao) {
		this.idProducao = idProducao;
	}
	/***
	 * M�todo para retorno do id Funcionario
	 * @return Retorna um objeto do tipo INTEIRO
	 */
	public int getIdFuncionario() {
		return idFuncionario;
	}
	/***
	 * M�todo de escrita do id Funcion�rio
	 * Lembrando que este m�todo � privado e pode ser apenas acessado na constru��o do objeto.
	 * @param idFuncionario Requer um n�mero INTEIRO
	 */
	private void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	
}
