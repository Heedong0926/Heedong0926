import java.util.Scanner;

public class Main{
	
	public static void main (String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		int[] arr = new int[sc.nextInt()];
		String str = sc.next();
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Character.getNumericValue(str.charAt(i));
			sum += arr[i];
		}
		System.out.println(sum);
		sc.close();
	}
}