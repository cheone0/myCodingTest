class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean left ;
        boolean right ;
        if(x1 == x2){
            if(x1 == true){
                left = true;
            }else{
                left = false;
            }
        }else{
            left = true;
        }

        if(x3 == x4){
            if(x3 == true){
                right = true;
            }else{
                right = false;
            }
        }else{
            right = true;
        }

        if(left == right && left == true){
            answer = true ;
        }else {
            answer = false;
        }
        return answer;
    }
}