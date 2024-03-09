import java.util.Scanner;

public class Exercitiu5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int suma = 0;
		int nrPar = 2;
		
		for(int i=0; i<n; i++)
		{
			
				suma = suma+nrPar;
				nrPar = nrPar+2;
				
		}
		System.out.println(suma);
		
		
		
		

	}

}
