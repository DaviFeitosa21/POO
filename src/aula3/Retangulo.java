package aula3;

public class Retangulo {
	
	float base, altura;
	
	public Retangulo() {
		this.base = 0;
		this.altura = 0;
	}

	public Retangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float CalculaArea() {
		return base * altura;
	}
	
	@Override
	public String toString() {
		return "Retangulo [base=" + base + ", altura=" + altura + " //// " + "Área do retangulo:" + CalculaArea() + "]";
	}
	
}
