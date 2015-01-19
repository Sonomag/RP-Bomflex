package br.com.bomflex.controller.validacao;

/***
 * Classe para valida��o dos Campos
 * @author Mailton Ara�jo - Telefone 71 - 9184-9959
 * 
 */
public class Validacao {
	
	/***
	 * M�todo para validar o tamanho de uma String que pode vir em um campo de texto.
	 * @param campo Uma String com o campo ou o texto para ser validado o tamanho.
	 * @param tamanhoMinCampo o tamanho m�ximo que o texto tem que ter.
	 * @param tamanhoMaxCampo o tamanho M�ximo que o texto tem que ter.
	 * @return retorna se verdadeiro ou falso caso seja igual ao tamanho esperado pelo campo.
	 */
	public boolean validaTamanho(String campo, int tamanhoMinCampo, int tamanhoMaxCampo){
		
		if(campo.length()>=tamanhoMinCampo&&campo.length()<=tamanhoMaxCampo){
			return true;
		}
		return false;
	}
	/***
	 * M�todo que vai validar os campos do tipo telefone
	 * @param ddd O campo ddd do telefone para ser testado
	 * @param telefone O numero do telefone para ser testado
	 * @return retorna se verdadeiro ou falso caso o telefone seja validado em tamanhos ou tipo de caracters.
	 */
	public boolean validaTelefone(String telefone){
			if(telefone.matches("\\d{1,}")){
					return true;
			}
		return false;
	}
	/***
	 * M�todo que vai validar os n�meros.
	 * @param id Recebe um par�metro String
	 * @param tamanhoCampo tamanho m�ximo do campo de ID.
	 * @return Retorna um boolean depois de efetuada os testes
	 */
	public boolean validaNumeros(String id){
		if(id.matches("\\d{1,}")||id.contains(".")){//Valida��o para verificar a poss�vel ocorr�ncia de Letras ou outros caracters.
			return true;
		}
		return false;
	}
	/***
	 * M�todo para valida��o de campos de Nomes onde so podem ser aceitos caracters do tipo a-z ou A-Z
	 * @param nome String � ser validada.
	 * @param tamanhoMinCampo O valor do tamanho minimo do campo de nome.
	 * @param tamanhoMaxCampo O valor m�ximo do campo de nome.
	 * @return retorna um boolean depois de efetuado os testes
	 */
	public boolean validaNome(String nome, int tamanhoMinCampo, int tamanhoMaxCampo){
		if(validaTamanho(nome, tamanhoMinCampo, tamanhoMaxCampo)){
			if(nome.matches("\\D{1,}")){//Valida a poss�vel ocorrencia de N�meros
				return true;
			}
		}
		return false;
	}
	/***
	 * M�todo para valida��o de campos de CEP onde somente aceitam valores do tipo n�meros 0-9
	 * com tamanho m�ximo de 8 caracters
	 * @param cep String � ser validada.
	 * @return retorna um boolean depois de efetuado os testes.
	 */
	public boolean validaCEP(String cep){
		if(cep.matches("\\d{1,}")||cep.contains(".")||cep.contains("-")){//Valida o campo para aceitar apenas N�meros.
			return true;
		}
		return false;
	}
	/**
	 * Metodo para organizar CEP
	 * @param cep Requer uma String
	 * @return Retorna uma String
	 */
	public String organizaCEP(String cep){
		if(cep.length()==2){
			cep=cep+".";
		}
		if(cep.length()==6){
			cep=cep+"-";
		}

		return cep;
	}
	/***
	 * M�todo para valida��o de CNPJ onde somente aceitam valores do tipo n�meros 0-9
	 * com tamanho m�ximo de 14 caracters
	 * @param cnpj String � ser validada.
	 * @return retorna um boolean depois de efetuado os testes.
	 */
	public boolean validaCNPJ(String cnpj){
		if(validaTamanho(cnpj, 14, 14)){
			if(cnpj.matches("\\d{1,}")){
				return true;
			}
		}
		return false;
	}
	/***
	 * M�todo para valida��o de CPF onde somente aceitam valores do tipo n�meros 0-9
	 * com tamanho m�ximo de 11 caracters
	 * @param cpf String � ser validada.
	 * @return retorna um boolean depois de efetuado os testes.
	 */
	public boolean validaCPF(String cpf){
		if(cpf.matches("\\d{1,}")||cpf.contains(".")||cpf.contains("-")){
			return true;
		}
		return false;
	}
	/**
	 * Metodo para organizar o campo CPF
	 * @param cpf Requer uma String com o CPF
	 * @return retorna uma String do CPF
	 */
	public String organizaCPF(String cpf){
		if(cpf.length()==3){
			cpf=cpf+".";
		}
		if(cpf.length()==7){
			cpf=cpf+".";
		}
		if(cpf.length()==11){
			cpf=cpf+"-";
		}
		return cpf;
	}
	/***
	 * M�todo para valida��o de RG onde somente aceitam valores do tipo n�meros 0-9
	 * O tamanho, como n�o e padronizado tem um limite m�nimo de 4 caracters e m�ximo de 20
	 * @param rg String � ser validada.
	 * @return retorna um boolean depois de efetuado os testes.
	 */
	public boolean validaRG(String rg){
		if(rg.matches("\\d{1,}")){
			return true;
		}
		return false;
	}
	/**
	 * Método para validar DATA
	 * @param data Uma String com a Data. Pode ser formatada ou não
	 * return retorna um boolean depois de efetuado os testes.
	 */
	public boolean validaData(String data){
		if(data.matches("\\d{1,}")||data.contains("/")){
			return true;
		}
		return false;
	}
	/**
	 * Método organizador de Datas
	 * @param data
	 * @return
	 */
	public String organizaData(String data){
		if(data.length()==2){
			data=data+"/";
		}
		if(data.length()==5){
			data=data+"/";
		}
		return data;
	}
}
