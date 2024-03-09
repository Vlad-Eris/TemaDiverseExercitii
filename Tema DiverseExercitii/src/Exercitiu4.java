import java.util.Scanner;

public class Exercitiu4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int z = scan.nextInt();
		
		if(n<m && n<z)
			System.out.println(n);
		if(m<n && m<z)
			System.out.println(m);
		if(z<n && z<m)
			System.out.println(z);


	}

}
