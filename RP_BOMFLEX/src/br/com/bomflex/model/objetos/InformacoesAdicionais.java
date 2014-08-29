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
public class InformacoesAdicionais {
	//ID Pessoa
	private int idPessoa;
	//Limite de Cr�dito
	private float limiteCredito;
	//Comi��o
	private float comicao;
	
	/**
	 * Construtor da Classe InformacoesAdicionais.java 
	 * @param idPessoa
	 */
	public InformacoesAdicionais(int idPessoa) {
		setIdPessoa(idPessoa);
	}
	/**
	 * M�todo para retorno do campo idPessoa
	 * @return Retorna um objeto do tipo int
	 */
	public int getIdPessoa() {
		return idPessoa;
	}
	/**
	 * M�todo de escrita do campo idPessoa
	 * @param Requer um parametro do tipo int
	 */
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	/**
	 * M�todo para retorno do campo limiteCredito
	 * @return Retorna um objeto do tipo float
	 */
	public float getLimiteCredito() {
		return limiteCredito;
	}
	/**
	 * M�todo de escrita do campo limiteCredito
	 * @param Requer um parametro do tipo float
	 */
	public void setLimiteCredito(float limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	/**
	 * M�todo para retorno do campo comicao
	 * @return Retorna um objeto do tipo float
	 */
	public float getComicao() {
		return comicao;
	}
	/**
	 * M�todo de escrita do campo comicao
	 * @param Requer um parametro do tipo float
	 */
	public void setComicao(float comicao) {
		this.comicao = comicao;
	}
	
}
