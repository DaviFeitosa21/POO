package poo;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroPrimo;
		boolean primo = true;;
		
		System.out.println("Digite um número para verficar se é primo:");
		numeroPrimo = sc.nextInt();
		
		if(numeroPrimo <= 1) {
			primo = false;
		}
		
		if(numeroPrimo > 1) {
			for(int i = 2; i <= Math.sqrt(numeroPrimo); i++) {
				if(numeroPrimo % i == 0) {
					primo = false;
					break;
				}
			}
		}
		
		if(primo) {
			System.out.println("Número é primo!");
		}
		else {
			System.out.println("Número não é primo!");
		}
		
		
		sc.close();
	}

}
