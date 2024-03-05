import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String [] numList = (n+"").split("");
        Arrays.sort(numList, Collections.reverseOrder());
        
        String temp = "";
        for(String s:numList) {
        	temp += s;
        }
        
        return Long.parseLong(temp);
    }
}