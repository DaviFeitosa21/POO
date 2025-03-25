package aula3;

public class Main {
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		Carro c2 = new Carro(2025, "Prata", "Onix");
		
		c2.setAno(2022);
		c2.setCor("Vermelho");
		c2.setModelo("Polo");
		
		System.out.println(c1);
		System.out.println(c2.toString());
		System.out.println("Status de movimento: " + c2.Andar());
		System.out.println("Atualizando status de movimento: " + c2.Parar());
		
		
		Retangulo ret1 = new Retangulo();
		
		ret1.setBase(2);
		ret1.setAltura(5);
		
		System.out.println("Resultado do calculo: " + ret1.toString());
		
	}
}
