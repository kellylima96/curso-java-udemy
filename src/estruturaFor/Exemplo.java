package estruturaFor;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos n�mero ser�o somados : ");

		int quantidadeAsomar = sc.nextInt();

		int somaDosNumeros = 0;
		for (int vezesquerepitiu = 0; vezesquerepitiu < quantidadeAsomar; vezesquerepitiu++) {
			int numerosDigitados = sc.nextInt();
			somaDosNumeros = somaDosNumeros + numerosDigitados;

		}

		System.out.println("A soma dos n�meros digitados � : " + somaDosNumeros);

		sc.close();

	}

}
