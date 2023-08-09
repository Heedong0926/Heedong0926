class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int ab = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int ab2 = 2*a*b;
        
        if(ab >= ab2) {
            answer = ab;
        } else {
            answer = ab2;
        }
        
        return answer;
    }
}