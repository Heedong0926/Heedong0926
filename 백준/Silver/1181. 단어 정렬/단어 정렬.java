import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws Exception {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int num = Integer.parseInt(br.readLine());
    	
    	String[] str = new String[num];
    	
    	for(int i=0; i<str.length; i++) {
    		str[i] = br.readLine();
    	}
    	
    	Arrays.sort(str, (o1, o2) -> {
    		if(o1.length() == o2.length()) {
    			return o1.compareTo(o2);
    		} else {
    			return o1.length() - o2.length();
    		}
    	});
    	
    	StringBuilder sb = new StringBuilder();
    	
    	sb.append(str[0]).append('\n');
    	
    	for(int i=1; i<str.length; i++) {
    		if(! str[i].equals(str[i-1])) {
    			sb.append(str[i]).append('\n');
    		}
    	}
    	System.out.println(sb);
    }
}