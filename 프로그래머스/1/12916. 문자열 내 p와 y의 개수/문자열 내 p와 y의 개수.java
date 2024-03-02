class Solution {
    boolean solution(String s) {
        String[] list = s.toLowerCase().split("");
        int p = 0;
        int y = 0;
        
        for(String str:list) {
        	if(str.equals("p")) {
        		p++;
        	}
        	
        	if(str.equals("y")) {
        		y++;
        	}
        }
        
        return p==y || (p==0 && y==0)? true:false;
    }
}