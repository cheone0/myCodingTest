import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        
        for (String str : intStrs) {
            String subStr = str.substring(s, s + l); // s번 인덱스부터 시작하여 길이 l짜리 부분 문자열 추출
            int num = Integer.parseInt(subStr); // 추출한 부분 문자열을 정수로 변환
            if (num > k) {
                list.add(num);
            }
        }
        
        // 리스트를 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    }
