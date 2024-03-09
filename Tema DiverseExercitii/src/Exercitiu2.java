import java.util.Scanner;

public class Exercitiu2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
				 
		if(n>=1 && n<=5) {
			String convertNr = "";

			switch (n) {
			case 1:
				convertNr = "UNU";
				break;
			case 2:
				convertNr = "DOI";
				break;
			case 3:
				convertNr = "TREI";
				break;
			case 4:
				convertNr = "PATRU";
				break;
			case 5:
				convertNr = "CINCI";
				break;
			}
            System.out.println("Numarul in litere: " + convertNr);
		}
            else 
            	System.out.println("INVALID");
		}
		
		

	}

