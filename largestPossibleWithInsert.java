package practice.microsoft;

public class largestPossibleWithInsert {

	public static void main(String[] args) {
		System.out.println(MaximumPossible(99, 5));
	}
	
	static int MaximumPossible(int num, int digit)
    {
        if (num == 0) return digit * 10;
        int negative = num / Math.abs(num);
        num = Math.abs(num);
        int n = num;
        int maxVal = Integer.MIN_VALUE;
        int counter = 0, position = 1;

        // count the number of digits in the given number.
        while (n > 0)
        {
            counter++;
            n = n / 10;
        }

        for (int i = 0; i <= counter; i++)
        {
            int newVal = ((num / position) * (position * 10)) + (digit * position) + (num % position);
            if (newVal * negative > maxVal)
            {
                maxVal = newVal * negative;
            }
            position = position * 10;
        }

        return maxVal;
    }

}
