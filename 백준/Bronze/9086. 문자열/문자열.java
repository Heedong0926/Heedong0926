import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int repeat = sc.nextInt();
       
        for(int i=0; i<repeat; i++){
        	String str = sc.next();
        	
        	System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
        }
        
        sc.close();

    }
}