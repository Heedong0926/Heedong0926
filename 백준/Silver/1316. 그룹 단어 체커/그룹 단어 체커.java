import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);   	
    	
    	int num = sc.nextInt();
    	int cnt = 0; // 그룹 단어의 개수
        
    	for(int i=0; i<num; i++) { // 단어 몇 개
    		String str = sc.next(); 
    		boolean check[] = new boolean[26]; // 알파벳 배열 생성 : 기본값(false)
    		boolean tmp = true;
    		
    		for(int j=0; j<str.length(); j++) {
    			int index = str.charAt(j)-'a'; // a(97)을 빼서 배열에 해당하는 인덱스 번호 찾기
    			if(check[index]) { // 해당 알파벳의 boolean 배열이 true라면
    				if(str.charAt(j) != str.charAt(j-1)) { // 직전 문자와 같지 않으면
    					tmp = false; // 그룹 단어가 아니다.
    					break;
    				}
    			}else { // 해당 알파벳의 boolean 배열이 false라면
    				check[index] = true; // 해당 알파벳의 boolean 배열을 true로 변경 => 사용된 문자!
    			}
    		}	 
    		if(tmp) {
    			cnt++; // tmp가 true면 그룹함수로 인정합니다
    		}
    	}
    	System.out.println(cnt);
    	
        sc.close();
    }
}