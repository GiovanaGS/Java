package lista4;
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		String marca;
		String cor;
		float peso;
		int quantidade;
		Scanner ler = new Scanner(System.in);

		System.out.print("Informe a marca:");
		marca=ler.next();
		System.out.print("Informe a cor:");
		cor=ler.next();
		System.out.print("Informe o peso:");
		peso=ler.nextInt();
		System.out.print("Informe a quantidade:");
		quantidade=ler.nextInt();
		
		ex2Molde aviao = new ex2Molde(marca,cor,peso,quantidade);
		aviao.mostrarinformacao();
		
		
	}

}
