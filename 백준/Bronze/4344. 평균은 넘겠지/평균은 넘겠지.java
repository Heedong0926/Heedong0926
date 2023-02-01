import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr;
		
		int C = sc.nextInt();
		
		for(int j=0; j<C; j++) {
			int N = sc.nextInt();
			arr = new int[N];
			
			double sum = 0;
			
			for(int i=0; i<N; i++) {
				arr[i]=sc.nextInt();
				sum += arr[i];
			}
			
			double avg = (sum/N);
			double count = 0;
			
			for(int i=0; i<N; i++) {
				if(arr[i]>avg) {
					count ++;
				}
			}
			
			System.out.printf("%.3f%%\n", (count/N)*100);
		}
		sc.close();
	}
}