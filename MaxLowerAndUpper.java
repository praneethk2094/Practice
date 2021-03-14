package practice.microsoft;

public class MaxLowerAndUpper {

	public static void main(String[] args) {
		String str = "admeDCAB";
		 
        System.out.println(largestCharacter(str));

	}
	
	private static String largestCharacter(String s){
		if(s.length()==0) return "NO";
		boolean[] lower = new boolean[26];
		boolean[] upper = new boolean[26];
		char[] chars = s.toCharArray();
		for(char c : chars){
			if(Character.isLowerCase(c)) lower[c - 'a'] = true;
			if(Character.isUpperCase(c)) upper[c - 'A'] = true;
		}
		
		for(int i=25; i>=0;i--){
			if(lower[i] && upper[i]) return (char)(i + 'A') + "";
		}
		return "NO";
	}

}
