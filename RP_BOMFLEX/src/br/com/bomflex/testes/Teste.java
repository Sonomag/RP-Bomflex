package br.com.bomflex.testes;

public class Teste extends Thread{
	long numero=0;
	long tempo;
	String nomeClasse;
	long tempoInicial;
	
	public Teste(long tempo,String nomeClasse,long tempoInicial){
		this.nomeClasse = nomeClasse;
		this.tempo = tempo;
		this.tempoInicial = tempoInicial;
	}
	
	public void run (){
		try {
			int y=0;
			for(int i=0; i < tempoInicial; i++){
				numero++;
				tempo = (System.currentTimeMillis()-tempoInicial);
				System.out.println(" CONTADOR "+y+" "+tempo);
				Thread.sleep(tempo);
				y++;
			}
		} catch (InterruptedException e) {
			return;
		}
	}
	public static void main(String[] args) {
		
		new Teste(1000,"Teste 1",System.currentTimeMillis()).start();
		new Teste(2000,"Teste 2",System.currentTimeMillis()).start();
//		new Teste(3000,"Teste 3",System.currentTimeMillis()).start();
//		new Teste(4000,"Teste 4",System.currentTimeMillis()).start();
		
	}

}
