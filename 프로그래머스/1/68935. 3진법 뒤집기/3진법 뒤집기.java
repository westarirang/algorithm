class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder temp = new StringBuilder();
        
        while(n>0) {
        	temp.append(n % 3);
        	n /= 3;
        }
        temp.reverse();
        
        for(int i=0;i<temp.length();i++) {
        	answer += Math.pow(3, i) * Integer.parseInt(String.valueOf(temp.charAt(i)));
        }
                
        return answer;
    }
}