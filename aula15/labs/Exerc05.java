package luciano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		 
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com a primeira nota");
        double nota1 = scan.nextDouble();
        
        System.out.println("Entre com a segunda nota");
        double nota2 = scan.nextDouble();
        
        double media = (nota1 + nota2) / 2;

		
		
			
		
			
		if(media==10) {
			System.out.println("Aprovado com distin��o");
		}else if (media<7) {
			System.out.println("Reprovado");
		}else  {
			System.out.println("Aprovado");
		}
	}

}
