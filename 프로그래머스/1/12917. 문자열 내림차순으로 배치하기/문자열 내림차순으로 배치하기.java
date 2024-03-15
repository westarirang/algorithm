import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] splitList = s.split("");
        Arrays.sort(splitList, Collections.reverseOrder());
        for(String str:splitList) {
        	answer += str;
        }
        return answer;
    }
}