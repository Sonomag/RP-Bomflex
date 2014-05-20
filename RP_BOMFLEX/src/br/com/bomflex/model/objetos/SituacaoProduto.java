package br.com.bomflex.model.objetos;
/***
 * Classe de Objeto Situa��o Produto
 * @author Mailton Ara�jo - Telefone 71 - 9184-9959
 *
 */
public class SituacaoProduto {
	//Chave identificadora do id da Situa��o do Produto
	private int idSituacaoProduto;
	//Nome da Situa��o do Produto - Exemplo: Em Produ��o, Inativo, Fora de Linha, etc.
	private String nome;
	
	/***
	 *Construtor da classe onde � obrigado a ser colocado o id e o nome do objeto 
	 * @param id - Id do objeto (pode ser usado o id escrito no Banco de Dados)
	 * @param nome - Nome do objeto (pode ser usado o nome escrito no Banco de Dados)
	 */
	public SituacaoProduto(int id, String nome){
		setIdSituacaoProduto(id);
		setNome(nome);
	}
	/***
	 * M�todo de Retorno do ID do objeto
	 * @return - Retorna um n�mero INTEIRO
	 */
	public int getIdSituacaoProduto() {
		return idSituacaoProduto;
	}
	/***
	 * M�todo de Escrita do ID do objeto
	 * Lembrando que este m�todo � privado e pode ser apenas acessado na constru��o do objeto.
	 * @param idSituacaoProduto - Requer um parametro do tipo INTEIRO
	 */
	private void setIdSituacaoProduto(int idSituacaoProduto) {
		this.idSituacaoProduto = idSituacaoProduto;
	}
	/***
	 * M�todo de Retorno do Nome do objeto
	 * @return - Retorna uma String
	 */
	public String getNome() {
		return nome;
	}
	/***
	 * M�todo de Escrita do Nome do Objeto
	 * Lembrando que este m�todo � privado e pode ser apenas acessado na constru��o do objeto.
	 * @param nome
	 */
	private void setNome(String nome) {
		this.nome = nome;
	}
}
