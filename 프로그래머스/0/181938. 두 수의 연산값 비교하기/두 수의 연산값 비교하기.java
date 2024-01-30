class Solution {
    public int solution(int a, int b) {
        
        int c =  Integer.valueOf(""+ a + b);
        int d = 2*a*b;
        int answer = c >= d ? c : d ;
        return answer;
    }
}