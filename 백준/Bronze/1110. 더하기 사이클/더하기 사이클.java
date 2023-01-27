import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int aCopy = a;
		int count = 0;
		
		do {
			aCopy = ((aCopy%10)*10) + (((aCopy/10) + (aCopy%10))%10);
		
			count ++;
		}while(a != aCopy);		
		
		System.out.println(count);
		
		sc.close();
	}
}