package primeiraaula;

import java.util.Scanner;

public class exerciciosdeswitch_6 {

	public static void main(String[] args) {
		
		float salario, salarioNovo, diferença;
		int codigo;
		
		Scanner leitor=new Scanner(System.in);
		
		System.out.println("digite o salário");
		salario=leitor.nextFloat();
		
		System.out.println("digite o código do cargo do funcionario");
		codigo=leitor.nextInt();
		
		switch(codigo) {
		
		case 001:
			System.out.println("Diretor");
			salarioNovo=(float) (salario + (salario*0.10));
			System.out.println("Salario Novo: " + salarioNovo + "Salário Antigo: " + salario + "Diferença: " + diferença);
			break;
			
			
		case 002:
			System.out.println("Engenheiro");
			salarioNovo=(float) (salario + (salario*0.20));
			System.out.println("Salario Novo: " + salarioNovo + "Salário Antigo: " + salario + "Diferença: " + diferença);
			break;
			
		case 003:
			System.out.println("Técnico");
			salarioNovo=(float) (salario + (salario*0.30));
			System.out.println("Salario Novo: " + salarioNovo + "Salário Antigo: " + salario + "Diferença: " + diferença);
			
			break;
			
		case 004:
			System.out.println("Gerente");
			salarioNovo=(float) (salario + (salario*0.10));
			System.out.println("Salario Novo: " + salarioNovo + "Salário Antigo: " + salario + "Diferença: " + diferença);
			
			break;
			
		case 005:
			System.out.println("Analista");
			salarioNovo=(float) (salario + (salario*0.30));
			System.out.println("Salario Novo: " + salarioNovo + "Salário Antigo: " + salario + "Diferença: " + diferença);
			break;
		
		case 006:
			System.out.println("Coordenador");
			salarioNovo=(float) (salario + (salario*0.20));
			System.out.println("Salario Novo: " + salarioNovo + "Salário Antigo: " + salario + "Diferença: " + diferença);
			
			break;
			
			default:
				System.out.println("Outro cargo");
				salarioNovo=(float) (salario + (salario*0.40));
				System.out.println("Salario Novo: " + salarioNovo + "Salário Antigo: " + salario + "Diferença: " + diferença);
			
			
		}
		
		diferença=salarioNovo-salario;
		
		
		}
		

	}


