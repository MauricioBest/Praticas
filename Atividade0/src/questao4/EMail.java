package questao4;


public class EMail {
	private String enderecoOrigem;
	private String enderecoDestino;
	private String mensagem;
	private String data;
	private String anexo1;
	private String anexo2;
	private String anexo3;
	public String getEnderecoOrigem() {
		return enderecoOrigem;
	}
	public void setEnderecoOrigem(String enderecoOrigem) {
		this.enderecoOrigem = enderecoOrigem;
	}
	public String getEnderecoDestino() {
		return enderecoDestino;
	}
	public void setEnderecoDestino(String enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anexo1 == null) ? 0 : anexo1.hashCode());
		result = prime * result + ((anexo2 == null) ? 0 : anexo2.hashCode());
		result = prime * result + ((anexo3 == null) ? 0 : anexo3.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result
				+ ((enderecoDestino == null) ? 0 : enderecoDestino.hashCode());
		result = prime * result
				+ ((enderecoOrigem == null) ? 0 : enderecoOrigem.hashCode());
		result = prime * result
				+ ((mensagem == null) ? 0 : mensagem.hashCode());
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
		EMail other = (EMail) obj;
		if (anexo1 == null) {
			if (other.anexo1 != null)
				return false;
		} else if (!anexo1.equals(other.anexo1))
			return false;
		if (anexo2 == null) {
			if (other.anexo2 != null)
				return false;
		} else if (!anexo2.equals(other.anexo2))
			return false;
		if (anexo3 == null) {
			if (other.anexo3 != null)
				return false;
		} else if (!anexo3.equals(other.anexo3))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (enderecoDestino == null) {
			if (other.enderecoDestino != null)
				return false;
		} else if (!enderecoDestino.equals(other.enderecoDestino))
			return false;
		if (enderecoOrigem == null) {
			if (other.enderecoOrigem != null)
				return false;
		} else if (!enderecoOrigem.equals(other.enderecoOrigem))
			return false;
		if (mensagem == null) {
			if (other.mensagem != null)
				return false;
		} else if (!mensagem.equals(other.mensagem))
			return false;
		return true;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getAnexo1() {
		return anexo1;
	}
	public void setAnexo1(String anexo1) {
		if(!anexo1.equals(anexo2)&&!anexo1.equals(anexo3)){
			this.anexo1 = anexo1;
		}
		
	}
	
	public String getAnexo2() {
		return anexo2;
	}
	
	public void setAnexo2(String anexo2) {
		if(!anexo2.equals(anexo1)&&!anexo2.equals(anexo3)){
			this.anexo2 = anexo2;
		}
	}
	
	public String getAnexo3() {
		return anexo3;
	}
	
	public void setAnexo3(String anexo3) {
		if(!anexo3.equals(anexo2)&&!anexo3.equals(anexo1)){
			this.anexo3 = anexo3;
		}
	}
	@Override
	public String toString() {
	return "Email " + enderecoOrigem + ", destino=" + enderecoDestino + ", mensagem=" + mensagem + ", data=" + data + ", Anexo 1= " + anexo1 +
			", Anexo 2= "+ anexo2 + ", Anexo 3= " +anexo3;
	}

}
