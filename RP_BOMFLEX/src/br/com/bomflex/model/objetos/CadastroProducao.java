package br.com.bomflex.model.objetos;
/***
 * Classe do Objeto Cadastro Produ��o
 * @author Mailton Ara�jo - Telefone 71 - 9184-9959
 *
 */
public class CadastroProducao {
	//Chave identificadora do Cadastro da Producao
	private int idCadastroProducao;
	//Data da Producao
	private String data;
	//Quantidade de Produtos da Produ��o
	private int qtdProdutos;
	/***
	 * Construtor da Classe onde � obrigado a ser informado o Id Cadastro Produ��o, a data e a
	 * quantidade de produtos
	 * @param idCadastroProducao Requer um parametro do tipo INTEIRO
	 * @param data Requer um parametro do tipo String
	 * @param qtdProdutos Requer um paramentro do tipo INTEIRO
	 */
	public CadastroProducao(int idCadastroProducao, String data, int qtdProdutos){
		setIdCadastroProducao(idCadastroProducao);
		setData(data);
		setQtdProdutos(qtdProdutos);
	}
	/***
	 * M�todo de retorno do id do Cadastro da Produ��o
	 * @return Retorna um objeto do tipo INTEIRO.
	 */
	public int getIdCadastroProducao() {
		return idCadastroProducao;
	}
	/***
	 * M�todo de escrita do id do Cadastro da Producao
	 * Lembrando que este m�todo � privado e pode ser apenas acessado na constru��o do objeto.
	 * @param idCadastroProducao Requer um paramentro do tipo INTEIRO
	 */
	private void setIdCadastroProducao(int idCadastroProducao) {
		this.idCadastroProducao = idCadastroProducao;
	}
	/***
	 * M�todo de Retorno da data da produ��o
	 * @return Retorna um objeto do tipo String
	 */
	public String getData() {
		return data;
	}
	/***
	 * M�todo de escrita da data da produ��o
	 * Lembrando que este m�todo � privado e pode ser apenas acessado na constru��o do objeto.
	 * @param data Requer um paramentro do tipo String
	 */
	private void setData(String data) {
		this.data = data;
	}
	/***
	 * M�todo de retorno da quantidade de produtos
	 * @return Retorna um objeto do tipo INTEIRO
	 */
	public int getQtdProdutos() {
		return qtdProdutos;
	}
	/***
	 * M�todo de escrita da quantidade da produ��o
	 * Lembrando que este m�todo � privado e pode ser apenas acessado na constru��o do objeto.
	 * @param qtdProdutos Requer um parametro do tipo INTEIRO
	 */
	private void setQtdProdutos(int qtdProdutos) {
		this.qtdProdutos = qtdProdutos;
	}
	
}
