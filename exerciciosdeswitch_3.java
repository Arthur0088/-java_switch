package primeiraaula;

import java.util.Scanner;

public class exerciciosdeswitch_3 {

	public static void main(String[] args) {
		
		int opcao;
		
		Scanner leitor=new Scanner(System.in);
		
		System.out.println("digite a opção 1-2-3-4");
		opcao=leitor.nextInt();
		
		switch(opcao) {
		
		case 1:
			System.out.println("executar a rotina de inclusão de alunos ");
			break;
			
		case 2:
			System.out.println("executar a rotina de alteração de alunos");
			break;
			
		case 3:
			System.out.println("executar a rotina de exclusão de alunos");
			break;
				
		case 4:
			System.out.println("executar a rotina de consulta de alunos");
			break;
			
			default:
				System.out.println("opção invalida");
			
		}
		
		

	}

}
