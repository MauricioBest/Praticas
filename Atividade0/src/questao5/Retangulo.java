package questao5;

public class Retangulo implements FormaGeométrica{
	private double base;
	private double altura;
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.base*this.altura;
	}
	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return (2*this.base)+(2*this.altura);
	}
	@Override
	public String desenhar() {
		// TODO Auto-generated method stub
		return "Desenho do Retangulo";
	}
	public double getBase() {
		return base;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(altura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(base);
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
		Retangulo other = (Retangulo) obj;
		if (Double.doubleToLongBits(altura) != Double
				.doubleToLongBits(other.altura))
			return false;
		if (Double.doubleToLongBits(base) != Double
				.doubleToLongBits(other.base))
			return false;
		return true;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
	return "base= " + base + " , altura= " + altura;
	}

}
