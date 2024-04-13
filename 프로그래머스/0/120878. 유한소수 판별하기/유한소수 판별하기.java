import java.util.ArrayList;

class Solution {
    public int solution(int a, int b) {
	    int answer = 1;

	    int gcd = gcd(a, b);
	    b = b / gcd; 

	    ArrayList<Integer> numList = new ArrayList<>();
	    int num = b;

	    for (int i = 2; i <= Math.sqrt(num); i++) {
	        while (num % i == 0) {
	            numList.add(i);
	            num /= i;
	        }
	    }

	    if (num > 1) { 
	        numList.add(num);
	    }

	    for (int i : numList) {
	        if (i != 2 && i != 5) {
	            answer = 2; 
	            break;
	        }
	    }

	    return answer;
	}

	public int gcd(int a, int b) {
	    while (b != 0) {
	        int t = b;
	        b = a % b;
	        a = t;
	    }
        
	    return a;
	}
}