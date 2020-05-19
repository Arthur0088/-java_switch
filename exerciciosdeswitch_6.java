package primeiraaula;

import java.util.Scanner;

public class exerciciosdeswitch_6 {

	public static void main(String[] args) {
		
		double salario, salarioNovo, diferença;
		float porcentagem;
		int codigo;
		
		Scanner leitor=new Scanner(System.in);
		
		System.out.println("digite o salário");
		salario=leitor.nextDouble();
		
		System.out.println("digite o código do cargo do funcionario");
		codigo=leitor.nextInt();
		
		switch(codigo) {
		
		case 001:
			porcentagem=0.10f;
			System.out.println("Diretor");
			break;
			
		case 002:
			porcentagem=0.20f;
			System.out.println("Engenheiro");
			break;
			
		case 003:
			porcentagem=0.30f;
			System.out.println("Técnico");
			break;
			
		case 004:
			porcentagem=0.10f;
			System.out.println("Gerente");
			break;
		
		case 005:
			porcentagem=0.30f;
			System.out.println("Analista");
			break;
		
		case 006:
			porcentagem=0.20f;
			System.out.println("Coordenador");
			break;
		
			default:
				porcentagem=0.40f;
				System.out.println("Outros cargos");
			
		
		salarioNovo=salario + salario*porcentagem;
		diferença=salarioNovo+salario;
		
		System.out.printf("Salário Antigo:%.2f\n", salario);
		System.out.printf("Salário Novo:%.2f\n", salarioNovo);
		System.out.printf("Diferença:%.2f\n", diferença);
		
		
	
		}
		
		
		
		}
		

	}


