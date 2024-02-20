import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();

        int i = 0 ;
       while (i<arr.length){
            if(stk.size()==0){
                stk.add(arr[i]);
                i = i + 1 ;
            }else if(stk.get(stk.size()-1)<arr[i]){
                stk.add(arr[i]);
                i = i+1;
            }else{
                stk.remove(stk.size()-1);
            }
       }
        int[] answer = new int[stk.size()];

       for(int j = 0 ; j<answer.length; j++){
           answer[j] = stk.get(j);
       }

       return answer;
    }
}