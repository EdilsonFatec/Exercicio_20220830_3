package view;
import javax.swing.JOptionPane;
import controller.ThreadSapo;

public class Principal {

	public static void main(String[] args) {
		int tamanhoPulo;
		int distanciaMaxima=0;
		do {
			tamanhoPulo = (int) (Math.random() * 10);
		}
		while (tamanhoPulo==0);
		distanciaMaxima = Integer.parseInt(JOptionPane.showInputDialog("Informe a distância máxima = "));
		for (int i= 0;i<5;i++) {
			Thread sapo = new ThreadSapo(i,tamanhoPulo,distanciaMaxima);
			sapo.start();
		}
	}
}