package br.com.bomflex.model.objetos;
/***
 * Classe de Objeto Grupo Produto
 * @author Mailton Araújo - Telefone 71 - 9184-9959
 *
 */
public class GrupoProduto {
	//Chave identificadora do Grupo do Produto
	private int idGrupoProduto;
	//Chave identificadora do Tipo do Produto
	private int idTipoProduto;
	//Nome do Grupo do Produto
	private String nome;
	/***
	 * Construtor da classe onde é obrigado a ser informado o
	 * idGrupoProduto, o idTipoProduto e o nome do Grupo
	 * @param idGrupoProduto Id do objeto
	 * @param idTipoProduto Id do objeto Tipo de Produto
	 * @param nome Nome do Grupo do Produto
	 */
	public GrupoProduto(int idGrupoProduto,int idTipoProduto,String nome){
		setIdGrupoProduto(idGrupoProduto);
		setIdTipoProduto(idTipoProduto);
		setNome(nome);
	}
	/***
	 * Método para Retorno do id Grupo Produto
	 * @return Retorna um número inteiro
	 */
	public int getIdGrupoProduto() {
		return idGrupoProduto;
	}
	/***
	 * Método de escrita do id do objeto
	 * Lembrando que este método é privado e pode ser apenas acessado na construção do objeto.
	 * @param idGrupoProduto Requer um parametro do tipo INTEIRO
	 */
	private void setIdGrupoProduto(int idGrupoProduto) {
		this.idGrupoProduto = idGrupoProduto;
	}
	/***
	 * Método para retorno do Id do Tipo do Produto
	 * @return Retorna um número Inteiro
	 */
	public int getIdTipoProduto() {
		return idTipoProduto;
	}
	/***
	 * Método de escrita do ID Tipo Produto
	 * Lembrando que este método é privado e pode ser apenas acessado na construção do objeto.
	 * @param idTipoProduto Requer um parametro do tipo INTEIRO
	 */
	private void setIdTipoProduto(int idTipoProduto) {
		this.idTipoProduto = idTipoProduto;
	}
	/***
	 * Método para retorno do Nome do objeto
	 * @return Retorna uma String
	 */
	public String getNome() {
		return nome;
	}
	/***
	 * Método de Escrita do Nome do objeto
	 * Lembrando que este método é privado e pode ser apenas acessado na construção do objeto.
	 * @param nome Requer um paramentro do tipo String
	 */
	private void setNome(String nome) {
		this.nome = nome;
	}
	

}
