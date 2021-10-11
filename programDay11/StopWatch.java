package com.bridgelabz.programDay11;

public class StopWatch {
	 private final long start;

	    /**
	     * Initializes a new stopwatch.
	     */
	    public StopWatch() {
	        start = System.currentTimeMillis();
	    } 
	    
	    public double elapsedTime() {
	        long now = System.currentTimeMillis();
	        return (now - start) / 1000.0;
	    }


	public static void main(String[] args) {
		 int n = Integer.parseInt(args[0]);

	        // sum of square roots of integers from 1 to n using Math.sqrt(x).
	        StopWatch timer1 = new StopWatch();
	        double sum1 = 0.0;
	        for (int i = 1; i <= n; i++) {
	            sum1 += Math.sqrt(i);
	        }
	        double time1 = timer1.elapsedTime();
	        System.out.println(time1+" %e (%.2f seconds)\n"+ sum1);

	        // sum of square roots of integers from 1 to n using Math.pow(x, 0.5).
	        StopWatch timer2 = new StopWatch();
	        double sum2 = 0.0;
	        for (int i = 1; i <= n; i++) {
	            sum2 += Math.pow(i, 0.5);
	        }
	        double time2 = timer2.elapsedTime();
	        System.out.println(time2+" %e (%.2f seconds)\n"+ sum2);
	    }

}
