import java.util.Arrays;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] arr = new String[my_string.length()];
    	for(int i=0; i<my_string.length();i++) {
    		arr[i] = my_string.substring(i,my_string.length());
    	}        
    	Arrays.sort(arr);
    	boolean found = false ;
    	for(String item : arr) {
    		if(item.equals(is_suffix)){
    			found = true ; 
    			break;
    		}
    	}
    	if(found) {
    		answer = 1;
    	}
        return answer;
    }
}