import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;



public class Resposta3 {

	public static void main(String[] args) {

	
		double[] valor = { 22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258, 46251.174,
				11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0, 35240.1826,
				43829.1667, 18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 13220.495, 8414.61 };

		double[] valorLimpo = { 22174.1664, 24537.6698, 26139.6134, 26742.6612, 42889.2258, 46251.174, 11191.4722,
				3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 35240.1826, 43829.1667, 18235.6852, 4355.0662,
				13327.1025, 25681.8318, 1718.1221, 13220.495, 8414.61 };

		Locale localeBR = new Locale("pt", "BR");
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

		Arrays.sort(valor); 
		double maior = valor[29]; 
		double menor = valor[0]; /

		System.out.println("Maior valor..." + dinheiro.format(maior) + "\nMenor valor...." + dinheiro.format(menor));

		double totalValor = 0;
		for (int i = 0; i < valorLimpo.length; i++) {
			totalValor += valorLimpo[i];
		}

		
		double media = totalValor / valorLimpo.length;
		System.out.println("Média de faturamento mensal..." + dinheiro.format(media));

		
		for (int i = 0; i < valorLimpo.length; i++) {
			if (valorLimpo[i] > media) {
				System.out.print(dinheiro.format(valorLimpo[i]) + ", ");
			}
		}

	}

}