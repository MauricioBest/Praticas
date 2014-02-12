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
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	

}
