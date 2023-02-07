import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);   	
        
    	String phone = sc.next().toUpperCase();
    	char[] ch = new char[phone.length()];
    	
    	for(int i=0; i<phone.length(); i++) {
    		ch[i] = phone.charAt(i);
    	}
    	
    	int sum =0;
    	
    	for(int i=0; i<phone.length(); i++) {
    		if(ch[i] <= 'C') {
    			sum += 3;
    		}else if(ch[i] <= 'F') {
    			sum += 4;
    		}else if(ch[i] <= 'I') {
    			sum += 5;
    		}else if(ch[i] <= 'L') {
    			sum += 6;
    		}else if(ch[i] <= 'O') {
    			sum += 7;
    		}else if(ch[i] <= 'S') {
    			sum += 8;
    		}else if(ch[i] <= 'V') {
    			sum += 9;
    		}else if(ch[i] <= 'Z') {
    			sum += 10;
    		}
    	}
    	
    	System.out.println(sum);
    	
        sc.close();
    }
}