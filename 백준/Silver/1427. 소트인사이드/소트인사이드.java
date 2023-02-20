import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer>list = new ArrayList<> ();
		String str = br.readLine();
		
		for(int i=0; i<str.length(); i++) {
			list.add(Character.getNumericValue(str.charAt(i)));
		}
        
		Collections.sort(list, Collections.reverseOrder());
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(list.get(i));
		}
		br.close();
	}
   }
