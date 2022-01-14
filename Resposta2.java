package Target_teste;
import java.util.Scanner;
  public class Resposta2{

	static long fib(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("A sequência tem qtos elementos? ");
    	int s = sc.nextInt();
    	System.out.print("Nº comparado: ");
    	int n = sc.nextInt();
    	boolean pertence = false;
    	
	for (int i = 0; i < s; i++) {
            if (n == Resposta2.fib(i)) {
            	pertence = true;
            	
            }else {
            	
            }
        }
	if (pertence == true) {
		System.out.println("PERTENCE A SEQUENCIA ");
	}else {
		System.out.println("NÃO PERTENCE A SEQUENCIA ");
	}

    }

}