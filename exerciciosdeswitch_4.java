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
		
		System.out.println("1- m�dia aritm�tica");
		System.out.println("2- m�dia ponderada");
		System.out.println("escolha uma op��o");
		 m=leitor.nextInt();
		 
		 switch(m) {
		 
		 case 1:
			 System.out.println("m�dia aritm�tica = " + aritimetica);
			 break;
			 
		 case 2:
			 System.out.println("m�dia ponderada = " + ponderada);
			 break;
			 
		 }
			 
			 
		
		
		
				
		

	}

}
