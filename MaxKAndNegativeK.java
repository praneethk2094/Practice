package practice.microsoft;

import java.util.HashSet;
import java.util.Set;

public class MaxKAndNegativeK {

	public static void main(String[] args) {
		int[] nums1 = { 3, 2, -2, 5, -3 };
		int[] nums2 = { 1, 2, 3, -4 };
		System.out.println(largestNum(nums1));
		System.out.println(largestNum(nums2));
	}
	
	private static int largestNum(int[] nums){
		Set<Integer> set = new HashSet<>();
		int max=0;
		for(int i : nums){
			set.add(-i);
			if(set.contains(i)){
				max = Math.max(max, Math.abs(i));
			}
		}
		return max;
	}

}
