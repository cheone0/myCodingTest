class Solution {
    public int solution(int a, int b) {
        
        String c = String.valueOf(a) + String.valueOf(b);
        String d = String.valueOf(b) + String.valueOf(a);
        int cc = Integer.valueOf(c);
        int dd = Integer.valueOf(d);
        int answer = (cc > dd) ? cc : dd ;
        return answer;
    }
}