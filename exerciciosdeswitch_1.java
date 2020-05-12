package primeiraaula;

import java.util.Scanner;

public class exerciciosdeswitch_1 {

	public static void main(String[] args) {
	
		Scanner leitor=new Scanner(System.in);
		
		int codigo;
		
		System.out.println("digite o código");
		codigo=leitor.nextInt();
		
		switch(codigo) {
		
		case 001:
			System.out.println("parafuso");
			break;
			
		case 002:
			System.out.println("porca");
			break;
		
		case 003:
		System.out.println("prego");
		    break;
		    
		case 004:
			System.out.println("ferramenta");
			break;
			
			default:
				System.out.println("diversos");
			
			
			
		
		
		
		}
	
	}

}
