package figurasGeometricas;

public class TesteGeometria {

	public static void main(String[] args) {
		
		FigurasGeo f = new Quadrado(4);
		System.out.println(f.getArea());

		f = new Circulo(2);
		System.out.println(f.getArea());
		
		f = new Triangulo(4, 3);
		System.out.println(f.getArea());
	}

}
