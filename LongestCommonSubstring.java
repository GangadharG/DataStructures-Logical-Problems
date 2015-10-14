// Java program to find longest common substring between 2 strings
import java.util.ArrayList;

public class LongestCommonSubstring {

	public static void main(String[] args){
		
		String s1 = "mongomangosmongo";
		String s2 = "manmanmangmangos";
		ArrayList<String> commonSubstringList = longestCommonSubstring(s1, s2);
		if(commonSubstringList.size() >1){
			System.out.println("The longest common substrings are: ");
			for(String subString : commonSubstringList){
				System.out.println(subString);
			}
		}else
			System.out.println("The longest common substring is "+commonSubstringList.get(0));
	}
	
	static ArrayList<String> longestCommonSubstring(String s1, String s2){
		
		Integer[][] match = new Integer[s1.length()][s2.length()];
		int max = 0; // max, to store length of longest common substring
		// there can be two or more longest common substring of same size, so arraylist
		ArrayList<String> result = null; 
		
		for(int i=0; i<s1.length();i++){
			for(int j=0; j<s2.length(); j++){
				if(s1.charAt(i) == s2.charAt(j)){
					if(i==0 || j==0)
						match[i][j] = 1;
					else
						match[i][j] = match[i-1][j-1] + 1;
					if(match[i][j] > max){
						max = match[i][j];
						result = new ArrayList<String>();
						result.add(s1.substring(i-max+1, i+1));
					}else if(match[i][j] == max){
						result.add(s1.substring(i-max+1, i+1));
					}
				}else
					match[i][j] = 0;
			}
		}
		return result;
	}
}
