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

}
