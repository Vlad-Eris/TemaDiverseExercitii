import java.util.Scanner;

public class Exercitiu16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		 while (n > 0) {
	            int ultCif = n % 10;
	            System.out.print(ultCif);
	            n= n/10;
	        }

	}

}
