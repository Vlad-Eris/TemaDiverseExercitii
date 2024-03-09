import java.util.Scanner;

public class Exercitiu12 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int numar = scanner.nextInt();
		
		 for (int i = 2; i <= numar; i++) {
	            if (numar % i == 0) {
	                boolean estePrim = true;
	                for (int j = 2; j <= Math.sqrt(i); j++) {
	                    if (i % j == 0) {
	                        estePrim = false;
	                        break;
	                    }
	                }
	                if (estePrim) {
	                    System.out.print(i + " ");
	                }
	            }
	        }

	}

}
