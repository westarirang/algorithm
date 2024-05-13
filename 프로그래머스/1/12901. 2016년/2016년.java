class Solution {
    public String solution(int a, int b) {
        String [] dd = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int date = b-1;
        int [] mm = {31,29,31,30,31,30,31,31,30,31,30,31};
        for(int i=1;i<a;i++) {
        	date += mm[i-1];
        }
        
        int idx= date%7;
        
        return dd[idx];
    }
}