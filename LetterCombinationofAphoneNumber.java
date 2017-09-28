package leecode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LetterCombinationofAphoneNumber {

	
	 public List<String> letterCombinations(String digits) {
		 LinkedList<String> res = new LinkedList<String>();
	        if(digits == null || digits.length() == 0) return res;
	        String[] mapString = new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	        res.add("");
	        for(int i=0;i<digits.length();i++){
	        	int n = digits.charAt(i) - '0';
	        	while(res.peek().length() == i){
	        		String temp = res.poll();
	        		for(char c : mapString[n].toCharArray()){
	        			res.add(temp+c);
	        		}
	        	}
	        }
	        return res;
	    }
}
