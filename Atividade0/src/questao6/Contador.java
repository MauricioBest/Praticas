package questao6;

public class Contador {
	
	private int valor;
	private boolean desfeito;
	
	public Contador(){
		this.valor = 0;
		this.desfeito = true;
	}
	
	public void incrementar(){
		this.valor= this.valor + 1;
		desfeito = false;
	}

	public int getValor() {
		return valor;
	}
	
	public void desfazer(){
		if(desfeito){
			System.out.println("Não pode ser desfeito");
		}else{
			this.valor= this.valor - 1;
			this.desfeito = true;
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (desfeito ? 1231 : 1237);
		result = prime * result + valor;
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
		Contador other = (Contador) obj;
		if (desfeito != other.desfeito)
			return false;
		if (valor != other.valor)
			return false;
		return true;
	}

	@Override
	public String toString() {
	return "valor: " + valor;
	}

}
