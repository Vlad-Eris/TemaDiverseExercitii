import java.util.Scanner;

public class Exercitiu19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();	
		int ogl=0;
		
		  while (n > 0) {
	            int cifra = n % 10;
	            ogl = ogl * 10 + cifra;
	            n=n/10;
	        }
	        System.out.println("Oglinditul numarului este: " + ogl);



	}

}
