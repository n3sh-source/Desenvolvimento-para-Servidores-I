package prj_aula02;

public class Retangulo {
	
	double base, altura;
	
	Retangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	double calcularArea() {
		return base*altura;
	}
	
	double calcularPerimetro() {
		return 2*(base + altura);
	}
	
	void mostarMedidas() {
		System.out.println("Area: " + calcularArea());
		System.out.println("Perimetro: " + calcularPerimetro());
	}
}
