package br.com.bomflex.model.objetos;
/***
 * Classe do Objeto Permissoes
 * @author Mailton Ara�jo - Telefone 71 - 9184-9959
 *
 */
public class Permissoes {
	//Chave identificadora das Permiss�es
	private int idPermissoes;
	//Nome da Permiss�o
	private String nome;
	/***
	 * Construtor da Classe onde � obrigado a ser informado o idPermiss�o e o Nome da permiss�o
	 * @param idPermissoes Id da Permiss�o
	 * @param nome Nome da Permiss�o
	 */
	public Permissoes(int idPermissoes,String nome){
		setIdPermissoes(idPermissoes);
		setNome(nome);
	}
	/***
	 * M�todo para retorno do id Permiss�es
	 * @return Retorna um n�mero inteiro
	 */
	public int getIdPermissoes() {
		return idPermissoes;
	}
	/***
	 * M�todo de escrita do id da Permiss�o
	 * Lembrando que este m�todo � privado e pode ser apenas acessado na constru��o do objeto.
	 * @param idPermissoes Requer um paramentro do tipo INTEIRO
	 */
	private void setIdPermissoes(int idPermissoes) {
		this.idPermissoes = idPermissoes;
	}
	/***
	 * M�todo para retorno do nome da Permiss�o
	 * @return Retorna uma String
	 */
	public String getNome() {
		return nome;
	}
	/***
	 * M�todo de escrita do nome da permiss�o
	 * Lembrando que este m�todo � privado e pode ser apenas acessado na constru��o do objeto.
	 * @param nome Requer um paramentro do tipo String
	 */
	private void setNome(String nome) {
		this.nome = nome;
	}
}
