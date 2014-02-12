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

}
