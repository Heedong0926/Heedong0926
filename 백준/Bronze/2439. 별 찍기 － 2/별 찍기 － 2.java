import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();

		for(int i=0; i<a; i++) {
			for(int j=a-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=i+1; k>0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
