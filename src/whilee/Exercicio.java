package whilee;

import java.util.Scanner;

/*
 * Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. Para cada leitura de senha 
 * incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser 
 * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta � o valor 2002.
  */

public class Exercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---PARA ACESSAR DIGITE SUA SENHA---");

		int x = sc.nextInt();

		while (x != 2002) {

			System.out.println("---SENHA INV�LIDA---");
			x = sc.nextInt();
		}

		System.out.println("---ACESSO PERMIIDO---");
		System.out.println("---VOC� ACESSOU O SISTEMA---");

		sc.close();

	}

}
