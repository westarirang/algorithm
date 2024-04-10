class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for(String [] str : db) {
        	if(id_pw[0].equals(str[0]) && id_pw[1].equals(str[1])) {
        		answer = "login";
        		break;
        	}else if(id_pw[0].equals(str[0])){
        		answer = "wrong pw";
        	}
        }
        return answer;
    }
}