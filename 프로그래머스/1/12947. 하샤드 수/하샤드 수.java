class Solution {
    public boolean solution(int x) {
        boolean answer = true;
		int num = 0;
		String[] list = String.valueOf(x).split("");

		for (String s : list) {
			num += Integer.parseInt(s);
		}
		
		if(x%num != 0){
			answer = false;
		}
		
		return answer;
    }
}