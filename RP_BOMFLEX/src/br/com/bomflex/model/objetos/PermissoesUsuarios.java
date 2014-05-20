package br.com.bomflex.model.objetos;
/***
 * Classe do Objeto Permissões Usuários
 * @author Mailton Araújo - Telefone 71 - 9184-9959
 *
 *-----------------IMPORTANTE-------------------
 *Classe usada para relacionamento entre dois objetos
 */
public class PermissoesUsuarios {
	//Chave do objeto Permissões
	private int idPermissoes;
	//Chave do Objeto Usuário
	private int idUsuario;
	/***
	 * Construtor da Classe onde é obrigado a ser informado o Id Permissão e o Id Usuário
	 * @param idPermissoes Requer um numero INTEIRO
	 * @param idUsuario Requer um numero INTEIRO
	 */
	public PermissoesUsuarios(int idPermissoes, int idUsuario){
		setIdPermissoes(idPermissoes);
		setIdUsuario(idUsuario);
	}
	/***
	 * Método para retorno do Id Permissoes
	 * @return Retorna um objeto do tipo INTEIRO
	 */
	public int getIdPermissoes() {
		return idPermissoes;
	}
	/***
	 * Método de escrita do ID Permissoes
	 * Lembrando que este método é privado e pode ser apenas acessado na construção do objeto.
	 * @param idPermissoes Requer um parametro do tipo INTEIRO
	 */
	private void setIdPermissoes(int idPermissoes) {
		this.idPermissoes = idPermissoes;
	}
	/***
	 * Método para retorno do Id Usuario
	 * @return Retorna um objeto do tipo INTEIRO
	 */
	public int getIdUsuario() {
		return idUsuario;
	}
	/***
	 * Método de escrita do Id Usuario
	 * Lembrando que este método é privado e pode ser apenas acessado na construção do objeto.
	 * @param idUsuario Requer um parametro do tipo INTEIRO
	 */
	private void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	
}
