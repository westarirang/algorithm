import java.util.ArrayList;

class Solution {
    public String[] solution(String[] quiz) {
        ArrayList<String> ox = new ArrayList<>();
        for(String str:quiz) {
        	String[] temp = str.split(" ");

        	if(temp[1].equals("+")) {
        		ox.add(Integer.parseInt(temp[0])+Integer.parseInt(temp[2])==Integer.parseInt(temp[4])? "O": "X");
        	} else {
        		ox.add(Integer.parseInt(temp[0])-Integer.parseInt(temp[2])==Integer.parseInt(temp[4])? "O": "X");
        	}	
        }
        
    	String[] answer = ox.toArray(new String[quiz.length]);

        return answer;
    }
}