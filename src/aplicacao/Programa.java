package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com um número ");
		int n = sc.nextInt();
		int[][] vect = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				vect[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Exibindo números ");
		for(int i = 0; i < n; i++) {
			if(i > 0) {
				sc.nextLine();
			}
			for(int j = 0; j < 3; j++) {
				System.out.print(vect[i][j]);
			}
		}
	
		sc.close();

	}

}
