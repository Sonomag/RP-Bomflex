package br.com.bomflex.model.objetos;
/***
 * Classe de Objeto Tipo Produto
 * @author Mailton Ara�jo - Telefone 71 - 9184-9959
 *
 */
public class TipoProduto {
	//Chave identificadora do id do Tipo do Produto
	private int idTipoProduto;
	//Nome do Tipo de Produto - Exemplo: Produto Adquirido, Produto de nossa Fabrica��o, Servi�os, etc.
	private String nome;
	/***
	 *Construtor da classe onde � obrigado a ser colocado o id e o nome do objeto 
	 * @param id - Id do objeto (pode ser usado o id escrito no Banco de Dados)
	 * @param nome - Nome do objeto (pode ser usado o nome escrito no Banco de Dados)
	 */
	public TipoProduto(int id, String nome){
		setIdTipoProduto(id);
		setNome(nome);
	}
	/***
	 * M�todo de Retorno do ID do objeto
	 * @return - Retorna um n�mero INTEIRO
	 */
	public int getIdTipoProduto() {
		return idTipoProduto;
	}
	/***
	 * M�todo de Escrita do ID do objeto
	 * Lembrando que este m�todo � privado e pode ser apenas acessado na constru��o do objeto.
	 * @param idSituacaoProduto - Requer um parametro do tipo INTEIRO
	 */
	private void setIdTipoProduto(int idTipoProduto) {
		this.idTipoProduto = idTipoProduto;
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
