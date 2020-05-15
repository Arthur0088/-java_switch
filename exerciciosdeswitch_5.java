package primeiraaula;

import java.util.Scanner;

public class exerciciosdeswitch_5 {

	public static void main(String[] args) {
		
		float preço;
		int opçao = 0;

		Scanner leitor=new Scanner(System.in);
		
		System.out.println("digite o preço ");
		preço=leitor.nextFloat();
		
		System.out.println("1-À vista em dinheiro ou cheque, com 10% de desconto");
		System.out.println("2-À vista com cartão de crédito, com 5% de desconto ");
		System.out.println("3-Em 2 vezes, preço normal de etiqueta sem juros");
		System.out.println("4-Em 3 vezes, preço de etiqueta com acréscimo de 10%");
		System.out.println("digite a opção de pagamento");
		opçao=leitor.nextInt();
		
		switch(opçao) {
		
		case 1:
			System.out.println(preço*0.90);
			break;
			
		case 2: 
			System.out.println(preço*0.95);
			break;
			
		case 3:
			System.out.println("duas vezes sem juros " + preço);
			break;
			
		case 4:
			System.out.println("três vezes com juros " + preço*1.10 );
			break;
			
			default:
				System.out.println("opção invalida");
				
		}
		
		
	}

}
