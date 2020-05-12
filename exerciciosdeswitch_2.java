package primeiraaula;

import java.util.Scanner;

public class exerciciosdeswitch_2 {

	public static void main(String[] args) {
		
	int codigo, quantidade;
	float cachorroquente, baurusimples, baurucomovo, hamburger, cheeseburger, refrigerante;
	
	Scanner leitor=new Scanner(System.in);
	
	System.out.println("digite o código");
	codigo=leitor.nextInt();
	
	System.out.println("digite a quantidade");
	quantidade=leitor.nextInt();
	
	cachorroquente=(float) 3.20;
	baurusimples=(float) 4.30;
	baurucomovo=(float) 5.50;
	hamburger=(float) 3.20;
	cheeseburger=(float) 4.30;
	refrigerante=(float) 4.00;
			
	switch(codigo) {
	
		case 100:
			System.out.println(cachorroquente*quantidade + " reais");
		break;
		
		case 101:
			System.out.println(baurusimples*quantidade  + " reais");
		break;
		
		case 102:
			System.out.println(baurucomovo*quantidade + " reais");
		break;
		
		case 103:
			System.out.println(hamburger*quantidade  + " reais");
		break;
		
		case 104:
			System.out.println(cheeseburger*quantidade  + " reais");
		break;
		
		case 105:
			System.out.println(refrigerante*quantidade  + " reais");
		break;
		
		default:
			System.out.println("produto não cadastrado");
			
		
	}
	
	
	
		
		
		
		
		
	}

}
