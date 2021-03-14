package practice.microsoft;

import java.util.Arrays;
import java.util.Collections;

public class MinStepsToPileEqualHeights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] testcases = {{4,5,5,4,2}};
        for(int[] testcase: testcases)
            System.out.println(minSteps(testcase));
	}
	
	public static int minSteps(int[] piles){
		int len = piles.length;
		if(len<=1) return 0;
		Arrays.sort(piles);
		int res=0, disNums=0;
		for(int i=1;i<len;i++){
			if(piles[i-1]!=piles[i]) ++disNums;
			res +=disNums;
		}
		return res;
	}

}
