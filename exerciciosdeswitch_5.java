package primeiraaula;

import java.util.Scanner;

public class exerciciosdeswitch_5 {

	public static void main(String[] args) {
		
		float pre�o;
		int op�ao = 0;

		Scanner leitor=new Scanner(System.in);
		
		System.out.println("digite o pre�o ");
		pre�o=leitor.nextFloat();
		
		System.out.println("1-� vista em dinheiro ou cheque, com 10% de desconto");
		System.out.println("2-� vista com cart�o de cr�dito, com 5% de desconto ");
		System.out.println("3-Em 2 vezes, pre�o normal de etiqueta sem juros");
		System.out.println("4-Em 3 vezes, pre�o de etiqueta com acr�scimo de 10%");
		System.out.println("digite a op��o de pagamento");
		op�ao=leitor.nextInt();
		
		switch(op�ao) {
		
		case 1:
			System.out.println(pre�o*0.90);
			break;
			
		case 2: 
			System.out.println(pre�o*0.95);
			break;
			
		case 3:
			System.out.println("duas vezes sem juros " + pre�o);
			break;
			
		case 4:
			System.out.println("tr�s vezes com juros " + pre�o*1.10 );
			break;
			
			default:
				System.out.println("op��o invalida");
				
		}
		
		
	}

}
