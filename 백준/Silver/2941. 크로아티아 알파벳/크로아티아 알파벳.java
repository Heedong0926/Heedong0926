import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);   	
        
    	String str = sc.next();
    	
    	str = str.replace("dz=", "z=");
    	str = str.replace("=", "");
    	str = str.replace("^", "");
    	str = str.replace("-", "");
    	str = str.replace("lj", "a");
    	str = str.replace("nj", "a");
    	
    	System.out.println(str.length());
    	
        sc.close();
    }
}