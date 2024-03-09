import java.util.Scanner;

public class Exercitiu8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int prod = 1;
		
		for(int i=1; i<=n; i++)
		{
			prod = prod*i;
		}
		System.out.println(prod);
		
		
		// TODO Auto-generated method stub

	}

}
