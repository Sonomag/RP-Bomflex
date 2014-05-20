package br.com.bomflex.model.objetos;
/***
 * Classe do Objeto Permiss�es Usu�rios
 * @author Mailton Ara�jo - Telefone 71 - 9184-9959
 *
 *-----------------IMPORTANTE-------------------
 *Classe usada para relacionamento entre dois objetos
 */
public class PermissoesUsuarios {
	//Chave do objeto Permiss�es
	private int idPermissoes;
	//Chave do Objeto Usu�rio
	private int idUsuario;
	/***
	 * Construtor da Classe onde � obrigado a ser informado o Id Permiss�o e o Id Usu�rio
	 * @param idPermissoes Requer um numero INTEIRO
	 * @param idUsuario Requer um numero INTEIRO
	 */
	public PermissoesUsuarios(int idPermissoes, int idUsuario){
		setIdPermissoes(idPermissoes);
		setIdUsuario(idUsuario);
	}
	/***
	 * M�todo para retorno do Id Permissoes
	 * @return Retorna um objeto do tipo INTEIRO
	 */
	public int getIdPermissoes() {
		return idPermissoes;
	}
	/***
	 * M�todo de escrita do ID Permissoes
	 * Lembrando que este m�todo � privado e pode ser apenas acessado na constru��o do objeto.
	 * @param idPermissoes Requer um parametro do tipo INTEIRO
	 */
	private void setIdPermissoes(int idPermissoes) {
		this.idPermissoes = idPermissoes;
	}
	/***
	 * M�todo para retorno do Id Usuario
	 * @return Retorna um objeto do tipo INTEIRO
	 */
	public int getIdUsuario() {
		return idUsuario;
	}
	/***
	 * M�todo de escrita do Id Usuario
	 * Lembrando que este m�todo � privado e pode ser apenas acessado na constru��o do objeto.
	 * @param idUsuario Requer um parametro do tipo INTEIRO
	 */
	private void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	
}
