class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int rhq = 1;
        int gkq = 0;
        for(int i = 0 ; i <num_list.length; i++){
           rhq = rhq*num_list[i];
            gkq += num_list[i] ;
       }
        return answer = rhq < gkq*gkq ? 1 : 0;
    }
}