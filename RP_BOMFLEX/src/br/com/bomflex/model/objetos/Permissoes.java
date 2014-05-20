package br.com.bomflex.model.objetos;
/***
 * Classe do Objeto Permissoes
 * @author Mailton Araújo - Telefone 71 - 9184-9959
 *
 */
public class Permissoes {
	//Chave identificadora das Permissões
	private int idPermissoes;
	//Nome da Permissão
	private String nome;
	/***
	 * Construtor da Classe onde é obrigado a ser informado o idPermissão e o Nome da permissão
	 * @param idPermissoes Id da Permissão
	 * @param nome Nome da Permissão
	 */
	public Permissoes(int idPermissoes,String nome){
		setIdPermissoes(idPermissoes);
		setNome(nome);
	}
	/***
	 * Método para retorno do id Permissões
	 * @return Retorna um número inteiro
	 */
	public int getIdPermissoes() {
		return idPermissoes;
	}
	/***
	 * Método de escrita do id da Permissão
	 * Lembrando que este método é privado e pode ser apenas acessado na construção do objeto.
	 * @param idPermissoes Requer um paramentro do tipo INTEIRO
	 */
	private void setIdPermissoes(int idPermissoes) {
		this.idPermissoes = idPermissoes;
	}
	/***
	 * Método para retorno do nome da Permissão
	 * @return Retorna uma String
	 */
	public String getNome() {
		return nome;
	}
	/***
	 * Método de escrita do nome da permissão
	 * Lembrando que este método é privado e pode ser apenas acessado na construção do objeto.
	 * @param nome Requer um paramentro do tipo String
	 */
	private void setNome(String nome) {
		this.nome = nome;
	}
}
