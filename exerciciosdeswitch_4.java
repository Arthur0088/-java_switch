package primeiraaula;

import java.util.Scanner;

public class exerciciosdeswitch_4 {

	public static void main(String[] args) {
		
		float ponderada, aritimetica, nota1, nota2, nota3;
		int m;
		
		Scanner leitor=new Scanner(System.in);
		
		System.out.println("digite a primeira nota");
		nota1=leitor.nextFloat();
		System.out.println("digite a segunda nota");
		nota2=leitor.nextFloat();
		System.out.println("digite a terceira nota");
		nota3=leitor.nextFloat();
		
		aritimetica=(nota1+nota2+nota3)/3;
		ponderada=((nota1*3)+(nota2*3)+(nota3*4)/10);
		
		System.out.println("--------------");
		
		System.out.println("1- média aritmética");
		System.out.println("2- média ponderada");
		System.out.println("escolha uma opção");
		 m=leitor.nextInt();
		 
		 switch(m) {
		 
		 case 1:
			 System.out.println("média aritmética = " + aritimetica);
			 break;
			 
		 case 2:
			 System.out.println("média ponderada = " + ponderada);
			 break;
			 
		 }
			 
			 
		
		
		
				
		

	}

}
