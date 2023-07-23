import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    	
    	Scanner sc = new Scanner(System.in);
    	
        int num = sc.nextInt()*2-1;
        
        for(int i=0; i<=num; i++) {
    	   
    	   if(i%2==1) {
    		   
    		   for(int k=0; k<(num-i)/2; k++) {
 				  System.out.print(" ");
 			   }
    		   
    		   for(int j=0; j<i; j++) {
    			  System.out.print("*");
    		   }
    		   
    		   System.out.println();
    	   }
        }
       
        for(int i=num-2; i>0; i--) {
    	   
    	   if(i%2==1) {
    		   
    		   for(int k=(num-i)/2; k>0; k--) {
  				  System.out.print(" ");
  			   }
    		   
    		   for(int j=i; j>0; j--) {
    			   System.out.print("*");
    		   }
    		   
    		   System.out.println();
    	   }
        }
        sc.close();
    }
}