package questao3;

public class Anexo {
	private String name;
	private String texto;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}	
	public boolean contains(String pesquisa){
		if (this.texto.contains(pesquisa)){
			return true;
		}
		return false;
	}

}
