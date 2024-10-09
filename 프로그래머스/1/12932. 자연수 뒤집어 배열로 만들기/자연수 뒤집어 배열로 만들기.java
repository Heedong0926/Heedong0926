class Solution {
    public int[] solution(long n) {
        /* 1차 풀이방식
		String str = Integer.toString((int) n);
		int length = str.length();
		int[] answer = new int[length];
		for(int i=0; i<length; i++){
			answer[i] = Integer.parseInt(String.valueOf(str.charAt(length-i-1)));
		}
		return answer;*/
		
		/* 2차 풀이방식 : 다른 풀이방식 봄 */

		// n의 자릿수 계산
		int length = 0;
		long temp = n;

		// 몫이 0이 될 때까지
		while (temp > 0) {
			temp /= 10;
			length++;
		}

		// 자릿수를 담을 배열 생성
		int[] answer = new int[length];

		// 자릿수를 배열에 저장
		for (int i = 0; n > 0; i++) {
			answer[i] = (int) (n % 10);  // 마지막 자릿수를 추출
			n /= 10;  // 마지막 자릿수를 제거
		}

		return answer;
    }
}