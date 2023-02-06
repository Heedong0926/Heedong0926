
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);   	
        String str = sc.nextLine();
        List<String> collection = new ArrayList<>(Arrays.asList(str.split("\\s")));
        
        collection.removeAll(Arrays.asList("", null));
        System.out.println(collection.size());
        
        sc.close();
    }
}