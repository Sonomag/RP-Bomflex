/**
 * 
 */
package br.com.bomflex.model.objetos;

/**
 * @author Mailton Araújo - Analista de Sistemas
 * Telefone - 71 - 3301-9000
 * E-mail - mailton@sonomag.com.br
 * 		    pcmotion@gmail.com
 */
public class TipoPessoa {
	//Id Tipo Pessoa
	private int idTipoPessoa;
	//Nome Tipo Pessoa
	private String nomeTipoPessoa;
	/**
	 * Construtor da Classe TipoPessoa.java 
	 * @param idTipoPessoa
	 * @param nomeTipoPessoa
	 */
	public TipoPessoa(int idTipoPessoa, String nomeTipoPessoa) {
		setIdTipoPessoa(idTipoPessoa);
		setNomeTipoPessoa(nomeTipoPessoa);
	}
	/**
	 * Método para retorno do campo idTipoPessoa
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdTipoPessoa() {
		return idTipoPessoa;
	}
	/**
	 * Método de escrita do campo idTipoPessoa
	 * @param Requer um parametro do tipo int
	 */
	public void setIdTipoPessoa(int idTipoPessoa) {
		this.idTipoPessoa = idTipoPessoa;
	}
	/**
	 * Método para retorno do campo nomeTipoPessoa
	 * @return Retorna um objeto do tipo String
	 */
	public String getNomeTipoPessoa() {
		return nomeTipoPessoa;
	}
	/**
	 * Método de escrita do campo nomeTipoPessoa
	 * @param Requer um parametro do tipo String
	 */
	public void setNomeTipoPessoa(String nomeTipoPessoa) {
		this.nomeTipoPessoa = nomeTipoPessoa;
	}
}
