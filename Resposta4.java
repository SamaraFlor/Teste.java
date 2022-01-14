package Target_Testes;

import java.text.NumberFormat;
import java.util.Locale;

public class Resposta4 {

	public static void main(String[] args) {

		Locale localeBR = new Locale("pt", "BR");

		double sp = 67836.43;
		double rj = 36678.66;
		double mg = 29229.88;
		double es = 27165.48;
		double outros = 19849.53;
		double total = (sp + rj + mg + es + outros);

	
		double ssp = (sp / total);
		double srj = (rj / total);
		double smg = (mg / total);
		double ses = (es / total);
		double soutros = (outros / total);

		
		NumberFormat percentual = NumberFormat.getPercentInstance();

		
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

		System.out.println("Total do faturamento..." + dinheiro.format(total));
		System.out.println("Representação de SP..." + percentual.format(ssp));
		System.out.println("Representação de RJ..." + percentual.format(srj));
		System.out.println("Representação de MG..." + percentual.format(smg));
		System.out.println("Representação de ES..." + percentual.format(ses));
		System.out.println("Representação de outros estados..." + percentual.format(soutros));
	}

}