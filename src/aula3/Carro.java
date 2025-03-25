package aula3;

public class Carro {
	
	int ano;
	String cor;
	String modelo;
	
	public Carro() {
		this.ano = 0;
		this.cor = "";
		this.modelo = "";
	}
	
	public Carro(int ano, String cor, String modelo) {
		this.ano = ano;
		this.cor = cor;
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Carro [ano=" + ano + ", cor=" + cor + ", modelo=" + modelo + "]";
	}

	
	public String Andar() {
		return "O carro está andando!";
	}
	
	public String Parar() {
		return "O carro parou!";
	}
	
	
}
