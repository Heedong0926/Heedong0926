import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextInt();
		long m = sc.nextInt();
		
		
		if(n>m) {
			System.out.println(n-m);
		}else if(m>n) {
			System.out.println(m-n);
		}
		sc.close();
		
	}

}
