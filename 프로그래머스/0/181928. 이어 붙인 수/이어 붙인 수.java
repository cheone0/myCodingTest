class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String ghftn = "";
        String Wkrtn = "";
        
        for(int i = 0 ; i <num_list.length; i++){
        if(num_list[i]%2 ==1){
            ghftn += "" + num_list[i];
        }else{
            Wkrtn += "" + num_list[i];
        }
       }

       answer = Integer.valueOf(ghftn )+ Integer.valueOf(Wkrtn );
        return answer;
    }
}