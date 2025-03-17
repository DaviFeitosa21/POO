package aula2;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroDigitado;
		
		System.out.println("Digite um número:");
		numeroDigitado = sc.nextInt();
		
		for(int i = 0; i < numeroDigitado; i++) {
			i += i;
			System.out.println(i);
		}
		
		sc.close();
	}
}
