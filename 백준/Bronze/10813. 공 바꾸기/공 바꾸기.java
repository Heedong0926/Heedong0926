import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()+1];
        int repeat = sc.nextInt();


        for(int i=0; i<arr.length; i++){
            arr[i] = i;
        }

        int temp = 0;
        
        for(int i=0; i<repeat; i++) {
            int j = sc.nextInt();
            int k = sc.nextInt();

            temp = arr[j];
            arr[j] = arr[k];
            arr[k] = temp;
        }

        for(int i=1; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}