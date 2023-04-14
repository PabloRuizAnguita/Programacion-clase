package Refactorización;

public class Metodos {double area;
	
	public double cuadrado(double lado) 
		{area = lado * lado;
			return area;
		}
	
	public double rectángulo(double base, double altura) 
		{area = base * altura;
			return area;
		}
	
	public double triángulo(double base, double altura) 
		{area = (base * altura)/2;
			return area;
		}
	
	public double círculo(double radio) 
		{area = 3.14*radio*radio;
			return area;
		}
}
