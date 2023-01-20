import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		String B = sc.next();
		
		System.out.println((Character.getNumericValue(B.charAt(2)))*A);
		System.out.println((Character.getNumericValue(B.charAt(1)))*A);
		System.out.println((Character.getNumericValue(B.charAt(0)))*A);
		System.out.println(A*Integer.parseInt(B));
		
		sc.close();
	}
}
