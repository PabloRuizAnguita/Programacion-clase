package Refactorización;

	import java.util.Scanner;


	public class Principal {

	public static void main(String[] args) {
		
		Metodos FiguraClass = new Metodos();
		
		Scanner sc = new Scanner(System.in);
	
	double lado, altura, base, radio; 
	
	System.out.print("Parametro del lado"); 
	lado = sc.nextDouble();
	
	System.out.print("Parametro de la base");
	base = sc.nextDouble();

	System.out.print("Parametro de la altura");
	altura = sc.nextDouble();
	
	System.out.print("Parametro del rádio"); 
	radio = sc.nextDouble(); 

	System.out.println("------------------------------------------");
	
	System.out.println("Resultado 1: El área del cuadrado es: " + FiguraClass.cuadrado(lado));
	
	System.out.println("Resultado 2: El área del triangulo es: " + FiguraClass.triángulo(base, altura));
	
	System.out.println("Resultado 3: El área del rectángulo es: " + FiguraClass.rectángulo(base, altura));
	
	System.out.println("Resultado 4: El área del círculo es: " + FiguraClass.círculo(radio));

	    }
	    
	}
