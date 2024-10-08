class Solution {
    boolean solution(String s) {
        boolean answer = true;

		s = s.toLowerCase();
		
		int pCase = 0;
		int yCase = 0;

		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='p'){
				pCase += 1;
			}
			if(s.charAt(i)=='y'){
				yCase += 1;
			}
		}
		
		if(pCase != yCase){
			answer = false;
		}

		return answer;
    }
}