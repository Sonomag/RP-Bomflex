package br.com.bomflex.testes;


public class Teste extends Thread{
	long numero=0;
	long tempo;
	String nomeClasse;
	
	public Teste(long tempo,String nomeClasse){
		this.nomeClasse = nomeClasse;
		this.tempo = tempo;
	}
	
	public void run (){
		try {
		for(int i=0; i < 3; i++){
			System.out.println(nomeClasse+" - "+numero);
			numero++;
			Thread.sleep(tempo);
		}
		} catch (InterruptedException e) {
			return;
		}
	}
	
	public static void main(String[] args) {
		
		new Teste(1000,"Teste 1").start();
		new Teste(2000,"Teste 2").start();
		new Teste(3000,"Teste 3").start();
		new Teste(4000,"Teste 4").start();
		
	}

}
