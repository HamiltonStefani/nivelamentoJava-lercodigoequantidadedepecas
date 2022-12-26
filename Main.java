package lercodigodepecas;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod01, cod02;
		int quant01, quant02;
		double valor01, valor02, vpag;
		
		System.out.println("Digite o código da primeira peça: ");
		cod01 = sc.nextInt();
		System.out.println("Digite o código da segunda peça: ");
		cod02 = sc.nextInt();
		System.out.println("Digite a quantidade da primeira peça: ");
		quant01 = sc.nextInt();
		System.out.println("Digite a quantidade da segunda peça: ");
		quant02 = sc.nextInt();
		System.out.println("Digite o Valor da primeira peça: ");
		valor01 = sc.nextDouble();
		System.out.println("Digite o Valor da segunda peça: ");
		valor02 = sc.nextDouble();
		vpag  = (quant01 * valor01) + (quant02 * valor02);
		
		System.out.printf("O valor a ser pago pelas peças é: %.2f%n", vpag);
		
		
		
		sc.close();

	}

}
