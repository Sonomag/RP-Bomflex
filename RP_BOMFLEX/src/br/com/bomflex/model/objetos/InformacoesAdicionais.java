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
public class InformacoesAdicionais {
	//ID Pessoa
	private int idPessoa;
	//Limite de Crédito
	private float limiteCredito;
	//Comição
	private float comicao;
	
	/**
	 * Construtor da Classe InformacoesAdicionais.java 
	 * @param idPessoa
	 */
	public InformacoesAdicionais(int idPessoa) {
		setIdPessoa(idPessoa);
	}
	/**
	 * Método para retorno do campo idPessoa
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdPessoa() {
		return idPessoa;
	}
	/**
	 * Método de escrita do campo idPessoa
	 * @param Requer um parametro do tipo int
	 */
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	/**
	 * Método para retorno do campo limiteCredito
	 * @return Retorna um objeto do tipo float
	 */
	public float getLimiteCredito() {
		return limiteCredito;
	}
	/**
	 * Método de escrita do campo limiteCredito
	 * @param Requer um parametro do tipo float
	 */
	public void setLimiteCredito(float limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	/**
	 * Método para retorno do campo comicao
	 * @return Retorna um objeto do tipo float
	 */
	public float getComicao() {
		return comicao;
	}
	/**
	 * Método de escrita do campo comicao
	 * @param Requer um parametro do tipo float
	 */
	public void setComicao(float comicao) {
		this.comicao = comicao;
	}
	
}
