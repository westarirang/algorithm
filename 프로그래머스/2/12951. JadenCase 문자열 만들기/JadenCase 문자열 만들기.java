class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char [] str = s.toCharArray();
        boolean blank = false;
        
		sb.append((str[0]+"").toUpperCase());

        for(int i=1; i<str.length; i++) {

        	if(blank) {
        		sb.append((str[i]+"").toUpperCase());
        		blank = false;
        	}else {
            	sb.append((str[i]+"").toLowerCase());
        	}
        	
                	
        	if((str[i]+"").equals(" ")) {
        		blank = true;
        	}
        }
        
        return sb.toString();
    }
}