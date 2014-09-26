package src;
public class rectangulo {

	
	private double altura;
	private double base;

	//Método que dado el radio calcula la circunferencia de un círculo.
	//public double circunferencia(double radio) {
	public double perimetro() {

		double result;

		//result = 2*NUM_PI*radio;
		result = 2*this.getBase()+2*this.getAltura();

		return result;
	}

	//Método que dado el radio calcula el area de un círculo.
	//public double area(double radio) {
	public double area() {

		double result;

		result = this.getBase()*this.getAltura();

		return result;
	}

	public double getBase() {

		return base;
	}	

	public void setBase(double bas) {

		base = bas;
	}
	
	public double getAltura() {

		return altura;
	}	

	public void setAltura(double alt) {

		altura = alt;
	} 
}

























