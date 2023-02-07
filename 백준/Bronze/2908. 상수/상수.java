import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);   	
        
    	String num1 = sc.next();
    	String num2 = sc.next();
    	
    	int[] arr1 = new int[3];
    	int[] arr2 = new int[3];
    	
		for(int i=0; i<3; i++) {
			arr1[i] = Character.getNumericValue(num1.charAt(2-i));
			arr2[i] = Character.getNumericValue(num2.charAt(2-i));
		}
    	
		int n1 = arr1[0]*100 + arr1[1]*10 + arr1[2];
		int n2 = arr2[0]*100 + arr2[1]*10 + arr2[2];
		
		if(n1 > n2) {
			System.out.println(n1);
		}else {
			System.out.println(n2);
		}
        sc.close();
    }
}