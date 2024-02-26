class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        String str1 = "";
        String str2= "";
        
        for(int i:date1) {
        	str1 += i;
        }
        
        for(int i:date2) {
        	str2 += i;
        }
                
        if(Integer.parseInt(str1)<Integer.parseInt(str2)) {
        	answer = 1;
        }
        
        return answer;
    }
}