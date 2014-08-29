/**
 * 
 */
package br.com.bomflex.model.objetos;

/**
 * @author Mailton Ara�jo - Analista de Sistemas
 * Telefone - 71 - 3301-9000
 * E-mail - mailton@sonomag.com.br
 * 		    pcmotion@gmail.com
 */
public class TipoTelefone {
	//Id Tipo Telefone
	private int idTipoTelefone;
	//Nome do Tipo de Telefone
	private String nomeTipoTelefone;
	/**
	 * Construtor da Classe TipoTelefone.java 
	 * @param idTipoTelefone
	 * @param nomeTipoTelefone
	 */
	public TipoTelefone(int idTipoTelefone, String nomeTipoTelefone) {
		setIdTipoTelefone(idTipoTelefone);
		setNomeTipoTelefone(nomeTipoTelefone);
	}
	/**
	 * M�todo para retorno do campo idTipoTelefone
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdTipoTelefone() {
		return idTipoTelefone;
	}
	/**
	 * M�todo de escrita do campo idTipoTelefone
	 * @param Requer um parametro do tipo int
	 */
	public void setIdTipoTelefone(int idTipoTelefone) {
		this.idTipoTelefone = idTipoTelefone;
	}
	/**
	 * M�todo para retorno do campo nomeTipoTelefone
	 * @return Retorna um objeto do tipo String
	 */
	public String getNomeTipoTelefone() {
		return nomeTipoTelefone;
	}
	/**
	 * M�todo de escrita do campo nomeTipoTelefone
	 * @param Requer um parametro do tipo String
	 */
	public void setNomeTipoTelefone(String nomeTipoTelefone) {
		this.nomeTipoTelefone = nomeTipoTelefone;
	}
	
}
