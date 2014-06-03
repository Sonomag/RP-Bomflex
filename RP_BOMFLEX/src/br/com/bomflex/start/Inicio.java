/**
 * 
 */
package br.com.bomflex.start;

import br.com.bomflex.controller.erro.StringErros;
import br.com.bomflex.controller.validacao.Validacao;

/**
 * @author Mailton Araújo - Analista de Sistemas
 * Telefone - 71 - 3301-9000
 * E-mail - mailton@sonomag.com.br
 * 		    pcmotion@gmail.com
 */
public class Inicio {

	public static void main(String[] args) {
		Validacao valida = new Validacao();
		System.out.println("CEP - "+ valida.validaCEP("41330000"));
		System.out.println("RG - "+ valida.validaRG("1144132231"));
		System.out.println("CNPJ - "+ valida.validaCNPJ("02735358000198"));
		System.out.println("TELEFONE - "+ valida.validaTelefone("071", "33019000"));
		System.out.println("NOME - "+ valida.validaNome("Mailton", 3, 20));
		System.out.println("CPF - "+ valida.validaCPF("03511971500"));
		StringErros teste = new StringErros();
		teste.exibeErroTela(teste.getErros("2")); 

	}

}
