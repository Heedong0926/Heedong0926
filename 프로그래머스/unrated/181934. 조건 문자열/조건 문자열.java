class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        String ineq_eq = ineq + eq;
        
        if(n>m) {
            if(ineq_eq.equals(">!") || ineq_eq.equals(">=")) {
                answer = 1;
            } else {
                answer = 0;
            }
        } else if(n<m) {
            if(ineq_eq.equals("<!") || ineq_eq.equals("<=")) {
                answer = 1;
            } else {
                answer = 0;
            }
        } else {
            if(ineq_eq.equals(">=") || ineq_eq.equals("<=")) {
                answer = 1;
            } else {
                answer = 0;
            }
        }
        
        return answer;
    }
}