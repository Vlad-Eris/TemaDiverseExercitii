import java.util.Scanner;

public class Exercitiul1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		
			if (n>5 && n <=10) {
				System.out.println("ADMIS"); }
		    if(n>=1 && n<5) {
				System.out.println("RESPINS"); }  
			if(n<1 || n>10) {
				System.out.println("INVALID"); }
			
		}
		
	}

