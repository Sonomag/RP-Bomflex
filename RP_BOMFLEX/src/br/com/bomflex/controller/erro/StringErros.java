/**
 * 
 */
package br.com.bomflex.controller.erro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

import javax.swing.JOptionPane;

import br.com.bomflex.model.objetos.Erros;

/**
 * @author Mailton Araújo - Analista de Sistemas
 * Telefone - 71 - 3301-9000
 * E-mail - mailton@sonomag.com.br
 * 		    pcmotion@gmail.com
 * Data de Criação 19/05/2014 - 10:22:17
 */
public class StringErros {
	private HashMap<String, String> erros = new HashMap<>();
	/***
	 * 
	 * Construtor da Classe StringErros.java
	 */
	public StringErros(){
		//Abre um acesso para o arquivo
		File arquivoErro = new File("./arquivos/erro.txt");
		//Cria um input de leitura do Arquivo
		InputStream leitura;
		try {
			//Recebe o caminho do arquivo, e ler o arquivo retornando bytes
			leitura = new FileInputStream(arquivoErro);
			//Cria um leitor de arquivo em formato de caracters
			InputStreamReader rLeitura = new InputStreamReader(leitura);
			//Agiliza o processo de leitura
			BufferedReader bLeitura = new BufferedReader(rLeitura);
			//String que armazenará a linha que contem o Erro.
			String textoLeitura;
			try {
				//Faz a primeira leitura
				textoLeitura = bLeitura.readLine();
				//Caso a leitura retorne um valor diferente de null entre no loop.
				while(textoLeitura != null){
					//Verificação de linha em Branco
					if(textoLeitura.length()!=0){
						//Verificação de Possíveis linhas de Comentário. Caso encontre Pule-as
						if(!textoLeitura.contains("//")){
							//Verificação de Possíveis linhas que comecem com um espaço. Caso encontre Pule-as
							if(!textoLeitura.startsWith(" ")){
								//Dividir a string em 2 tokens, o token 0 com a chave e o token 1 com o Valor.
								String [] tokens = textoLeitura.split(";");
								//Inserir os Tokens no HashMap
								setErros(tokens[0].toString(),tokens[1].toString());
							}
						}
					}
					textoLeitura = bLeitura.readLine();
				}
				bLeitura.close();
				rLeitura.close();
				leitura.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void exibeErroTela(Erros novo){
	
		JOptionPane.showMessageDialog(null, "Código do Erro: "+ novo.getCodErro() + "\nDescrição do Erro: " + novo.getNomeErro(), "Erro " + novo.getCodErro(), 2);
	}
	
	/**
	 * Método para retorno de uma String contendo o Erro
	 * @return Retorna um objeto do tipo String
	 */
	public Erros getErros(String key) {
		if(erros.containsKey(key)){//Verifica no HashMap se o Erro esta cadastrado.
			Erros novo = new Erros();
			novo.setCodErro(key);
			novo.setNomeErro(erros.get(key));
			return novo;
		}else{
			//Caso não encontre nenhum Erro com este codigo exiba o codigo de erro não encontrado.
			Erros novo = new Erros();
			novo.setCodErro("40000");
			novo.setNomeErro(erros.get("40000"));
			return novo;
		}
	}

	/**
	 * Método de escrita do campo erros
	 * @param Requer uma String contendo uma key
	 * @param Requer uma String contendo o Valor da Key
	 */
	public void setErros(String key, String valor) {
		this.erros.put(key, valor);
	}
	
}
