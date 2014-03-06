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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(PI);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(raio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		if (Double.doubleToLongBits(PI) != Double.doubleToLongBits(other.PI))
			return false;
		if (Double.doubleToLongBits(raio) != Double
				.doubleToLongBits(other.raio))
			return false;
		return true;
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
	@Override
	public String toString() {
	return "PI=" + PI + " , raio=" + raio;
	}

}
