package Target_Testes;

import java.util.Scanner;

public class Resposta5{

	static String reverseIt(String str, int index) {

		if (index == 0) {
			return str.charAt(0) + "";
		}

		char letter = str.charAt(index);
		return letter + reverseIt(str, index - 1);
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite uma palavra...");

		String str = entrada.next().trim();

		String reverseStr = reverseIt(str, str.length() - 1);

		System.out.println("Palavra invertida..." + reverseStr);

		entrada.close();
	}

}