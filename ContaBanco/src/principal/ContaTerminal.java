package principal;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) { 
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Por favor, digite seu nome:");
		String nome = scanner.next();
		
		System.out.println("Por favor, digite sua agência:");
		String agencia = scanner.next();
		
		System.out.println("Por favor, digite sua conta: ");
		int conta = scanner.nextInt();
		
		System.out.println("Por favor, digite seu saldo: ");
		double saldo = scanner.nextDouble();
		
		// Imprimindo os dados obtidos pelo terminal
		System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, "
				+ "sua agência é " + agencia + ", sua conta é " + conta + " e seu saldo"
						+ " " + saldo + " já está disponível para saque.");
		
		
		
	}
	
}
