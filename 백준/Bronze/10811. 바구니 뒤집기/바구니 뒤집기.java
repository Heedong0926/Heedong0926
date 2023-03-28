import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    	
    	Scanner sc = new Scanner(System.in);
    	
        int[] arr = new int[sc.nextInt()];
        
        for(int i=0; i<arr.length; i++) {
        	arr[i] = i+1;
        }
        
        int repeat = sc.nextInt();
        
        for(int i=0; i<repeat; i++) {
        	int start = sc.nextInt()-1;
        	int end = sc.nextInt()-1;

        	while (start < end) {
        		int temp = arr[start];
        		arr[start++] = arr[end];
        		arr[end--] = temp;
        	}
        }
        
        String ret = "";
        
        for(int i=0; i<arr.length; i++) {
        	ret += arr[i] + " ";
        }
        
        System.out.print(ret.trim());
        
        sc.close();
    }
}
