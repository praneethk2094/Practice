package practice.microsoft;

public class DeletionsToObtainEvenFreqency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minFrequency("axxaxa"));
	}
	
	private static int minFrequency(String S){
		int[] counter = new int[26];
		for (int i = 0; i < S.length(); i++)
		    counter[S.charAt(i) - 'a']++;

		int numRemove = 0;
		for (int i = 0; i < counter.length; i++)
		{
		    if (counter[i] % 2 == 1)
		        numRemove++;
		}

		return numRemove;
	}

}
