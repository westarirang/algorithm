class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String str = A+A;
        if(str.indexOf(B)==1) {
        	answer = (A.charAt(B.length()-1)==B.charAt(0))? str.indexOf(B): A.length()-str.indexOf(B); 
        }else {
        	answer = str.indexOf(B)<=0? str.indexOf(B): A.length()-str.indexOf(B);
        }
        

        return answer;
    }
}