package br.com.bomflex.model.objetos;
/***
 * Classe do Objeto Permissões Usuários
 * @author Mailton Araújo - Telefone 71 - 9184-9959
 */
public class Usuario {
	//Chave identificadora do Usuario
	private int idUsuario;
	//Nome do Usuario
	private String nome;
	/***
	 * Construtor do Objeto Usuario onde é obrigado informar o idUsuario e o nome
	 * @param idUsuario Requer um numero INTEIRO
	 * @param nome Requer uma String
	 */
	public Usuario(int idUsuario, String nome){
		setIdUsuario(idUsuario);
		setNome(nome);
	}
	/***
	 * Método para retorno do Id Usuario
	 * @return Retorna um objeto do tipo INTEIRO
	 */
	public int getIdUsuario() {
		return idUsuario;
	}
	/***
	 * Método para escrita do Id Usuario
	 * Lembrando que este método é privado e pode ser apenas acessado na construção do objeto.
	 * @param idUsuario Requer um paramentro do tipo INTEIRO
	 */
	private void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	/***
	 * Método para retorno do Nome do Usuario
	 * @return Retorna um objeto do tipo String
	 */
	public String getNome() {
		return nome;
	}
	/***
	 * Método para escrita do Nome do Usuario
	 * Lembrando que este método é privado e pode ser apenas acessado na construção do objeto.
	 * @param nome Requer um paramentro do tipo String
	 */
	private void setNome(String nome) {
		this.nome = nome;
	}
}
