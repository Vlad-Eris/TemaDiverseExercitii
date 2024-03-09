import java.util.Scanner;

public class Exercitiu6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int suma = 0;
		int nrImpar = 1;
		
		for(int i=0; i<=n; i++)
		{

				suma = suma+nrImpar;
				nrImpar = nrImpar+2;
			
		}
		System.out.println(suma);
		
		
		
		

	}

}