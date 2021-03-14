package practice.microsoft;

public class MinSwapsForPalidrome {

	public static void main(String[] args) {
		System.out.println(getSwapCount("ntiin"));
		
	}
	
	private static int getSwapCount(String s){
		if(s.length()==0) return 0;
		int count =0;
		if(isShuffled(s)){
			char[] chars = s.toCharArray();
			int lo=0, hi=chars.length-1;
			while(lo<hi){
				if(chars[lo]!=chars[hi]){ 
					int k = hi;
					while(k>lo && chars[k]!=chars[lo]) k--;
					
					if(k==lo){
						swap(chars, lo, lo+1);
						count++;
					}else{
						while(k<hi){
							swap(chars, k, k+1);
							count++;
							k++;
						}
						lo++;hi--;
					}
				}else{
					lo++; hi--;
				}
			}
			return count;
		}
		else{
			return -1;
		}
	}
	
	private static void swap(char[] chars, int i, int j){
		char temp = chars[i];
		chars[i] = chars[j];
		chars[j] = temp;
	}
	
	private static boolean isShuffled(String s){
		int[] occ = new int[26];
		int odd = 0;
		for(int i=0;i<s.length();i++) occ[s.charAt(i) - 'a']++;
		for(int val : occ) if(val%2!=0) odd++;
		return odd <=1;
	}

}
