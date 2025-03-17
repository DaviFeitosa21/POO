package aula2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		
		System.out.println("Digite o lado A:");
		A = sc.nextDouble();
		
		System.out.println("Digite o lado B:");
		B = sc.nextDouble();
		
		System.out.println("Digite o lado C:");
		C = sc.nextDouble();
		
		if(A == B && A == B && A == C) {
			System.out.println("É um triângulo Equilatero!");
		}
		else if(A == B || B == C || C == A) {
			System.out.println("É um triângulo Isoceles!");
		}
		else if(A != B && B != C && C != A) {
			System.out.println("É um triângulo Escaleno!!");
		}
		
		sc.close();
	}
	
}
