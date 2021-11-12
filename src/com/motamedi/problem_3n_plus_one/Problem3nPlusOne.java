package com.motamedi.problem_3n_plus_one;

public class Problem3nPlusOne {

	public static long cycleLength(long n) {
		if (n == 1) {
			return 1;
		}
		if (n % 2 == 0)
			return 1 + cycleLength( n / 2 );
		return 1 + cycleLength( 3 * n + 1 );
	}
	
	public static long maxCycleLength(long start, long end) {
	    
		long min = Math.min(start, end);
	    long max = Math.max(start, end);
	    long maxCycleLength = 0;

	    for (long i = min; i <= max; i++) {
	        long cycleLength = cycleLength(i);
	        if (cycleLength > maxCycleLength) {
	            maxCycleLength = cycleLength;
	        }
	    }

	    return maxCycleLength;
	}
	
}
