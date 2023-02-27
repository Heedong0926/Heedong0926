import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int[] basket = new int[sc.nextInt()];
		int repeat = sc.nextInt();
		
		for(int i=0; i<basket.length; i++) {	
			basket[i] = 0;
		}
		
		for(int i=0; i<repeat; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int num = sc.nextInt();
			
			for(int j=start-1; j<end; j++) {
				basket[j] = num;
			}
		}
		
		for(int i=0; i<basket.length; i++) {	
			System.out.print(basket[i]+" ");
		}
		
		sc.close();
	}
}
