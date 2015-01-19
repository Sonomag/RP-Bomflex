/**
 * 
 */
package br.com.bomflex.start;

import javax.swing.JOptionPane;

import br.com.bomflex.controller.erro.StringErros;
import br.com.bomflex.model.ObjetoComun;
import br.com.bomflex.view.autenticacao.Autenticacao;
import br.com.bomflex.view.utilitario.telas.ProducaoFaixa;



/**
 * @author Mailton Ara�jo - Analista de Sistemas
 * Telefone - 71 - 3301-9000
 * E-mail - mailton@sonomag.com.br
 * 		    pcmotion@gmail.com
 */
public class Inicio {

	public static void main(String[] args) {
		
		//String dos Erros do Sistema
		StringErros erros = new StringErros();	
		//Enviar o objeto dos erros do Sistema.
		//Caso n�o consiga exiba o erro e n�o abra o programa
		ObjetoComun objComun = new ObjetoComun();
		if(erros.tamanhoErros()>0){
			//Janela de Abertura do Programa
			new Autenticacao(erros,objComun);
//			new ProducaoFaixa(erros,objComun);
//			new ProducaoDoDia(erros, objComun);
		}else{
			JOptionPane.showMessageDialog(null, "Código do Erro: "+ "40000" + "\nDescrição do Erro: " + "Não foi carregado a biblioteca de erros. Impossível abrir o programa.","Erro: Faltam Bibliotecas.", 2);
		}
		
		
		
	}
	
}
