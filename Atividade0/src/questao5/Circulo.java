package questao5;

public class Circulo implements FormaGeométrica{
	
	private double raio;
	private final double PI=3.14;
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getPI() {
		return PI;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return PI*raio*raio;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 2*PI*raio;
	}

	@Override
	public String desenhar() {
		// TODO Auto-generated method stub
		return "Desenho do Circulo";
	}

}
