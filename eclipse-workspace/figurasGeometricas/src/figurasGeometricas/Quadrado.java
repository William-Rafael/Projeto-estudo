package figurasGeometricas;

public class Quadrado extends FigurasGeo{
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
public double getArea() {
	return lado * lado;
}
}
