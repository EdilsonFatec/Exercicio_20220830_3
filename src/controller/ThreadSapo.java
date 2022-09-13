package controller;

public class ThreadSapo extends Thread {
	private int ThreadID;
	private int tamanhoPulo;
	private int distanciaMaxima;
	static int posicao = 0;
	
	public ThreadSapo(int ThreadID, int tamanhoPulo, int distanciaMaxima) {
		this.ThreadID = ThreadID;
		this.tamanhoPulo = tamanhoPulo;
		this.distanciaMaxima = distanciaMaxima;
	}
	
	public void run() {
		int sapoPosicao = 0;
		int sapoPulo=0;
		int saposColocacao = 0;
		
		do {
			sapoPulo = (int) (tamanhoPulo *  Math.random());
			sapoPosicao = sapoPosicao + sapoPulo;
			System.out.println("Sapo "+(ThreadID +1)+" pulou = "+sapoPulo+" metros, chegando no total de "+sapoPosicao+" metros");
		}
		while (sapoPosicao<distanciaMaxima);
	
	posicao = posicao + 1;

	System.out.println("Sapo "+(ThreadID +1)+" chegou na posição = "+posicao);
	}
}
