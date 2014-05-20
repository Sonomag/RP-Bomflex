package br.com.bomflex.model.objetos;
/***
 * Classe do Objeto Cadastro Produção
 * @author Mailton Araújo - Telefone 71 - 9184-9959
 *
 */
public class CadastroProducao {
	//Chave identificadora do Cadastro da Producao
	private int idCadastroProducao;
	//Data da Producao
	private String data;
	//Quantidade de Produtos da Produção
	private int qtdProdutos;
	/***
	 * Construtor da Classe onde é obrigado a ser informado o Id Cadastro Produção, a data e a
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
	 * Método de retorno do id do Cadastro da Produção
	 * @return Retorna um objeto do tipo INTEIRO.
	 */
	public int getIdCadastroProducao() {
		return idCadastroProducao;
	}
	/***
	 * Método de escrita do id do Cadastro da Producao
	 * Lembrando que este método é privado e pode ser apenas acessado na construção do objeto.
	 * @param idCadastroProducao Requer um paramentro do tipo INTEIRO
	 */
	private void setIdCadastroProducao(int idCadastroProducao) {
		this.idCadastroProducao = idCadastroProducao;
	}
	/***
	 * Método de Retorno da data da produção
	 * @return Retorna um objeto do tipo String
	 */
	public String getData() {
		return data;
	}
	/***
	 * Método de escrita da data da produção
	 * Lembrando que este método é privado e pode ser apenas acessado na construção do objeto.
	 * @param data Requer um paramentro do tipo String
	 */
	private void setData(String data) {
		this.data = data;
	}
	/***
	 * Método de retorno da quantidade de produtos
	 * @return Retorna um objeto do tipo INTEIRO
	 */
	public int getQtdProdutos() {
		return qtdProdutos;
	}
	/***
	 * Método de escrita da quantidade da produção
	 * Lembrando que este método é privado e pode ser apenas acessado na construção do objeto.
	 * @param qtdProdutos Requer um parametro do tipo INTEIRO
	 */
	private void setQtdProdutos(int qtdProdutos) {
		this.qtdProdutos = qtdProdutos;
	}
	
}
