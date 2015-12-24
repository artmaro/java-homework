
import java.util.*;
import java.util.concurrent.*;

// We create a class SumOfN that sums the values from 1..N where N is a large number. 
// We divide the task 
// to sum the numbers to 10 threads (which is an arbitrary limit just for illustration). 
// Once computation is complete, we add the results of all the threads, 
// and check if the calculation is correct by using the formula (N * (N + 1))/2. 
class SumOfN {
	private static long N = 1_000_000L; // one million  
	private static long calculatedSum = 0;	// value to hold the sum of values in range 1..N  	   	
	private static final int NUM_THREADS = 10; // number of threads to create for distributing the effort  
	

	static class SumCalc implements Callable<Long> {
		long from, to, localSum = 0; 

		public SumCalc(long from, long to) {
			this.from = from;
			this.to = to; 
		}
		public Long call() {
		
			for(long i = from; i <= to; i++) {
				localSum += i;  
			}
			return localSum; 
		}
	}

	public static void main(String []args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREADS);
	
		List<Future<Long>> summationTasks = new ArrayList<>();
		long nByTen = N/10; 	
		for(int i = 0; i < NUM_THREADS; i++) {
			
			long fromInInnerRange = (nByTen * i) + 1; 
			long toInInnerRange = nByTen * (i+1); 
			System.out.printf("Spawning thread for summing in range %d to %d %n", fromInInnerRange, toInInnerRange); 
			
			Callable<Long> summationTask = 
new SumCalc(fromInInnerRange, toInInnerRange);
			
			Future<Long> futureSum = executorService.submit(summationTask);
			
			summationTasks.add(futureSum); 
		}

		// now, find the sum from each task 
		for(Future<Long> partialSum : summationTasks) {
			try {
				
				calculatedSum += partialSum.get();  
			} catch(CancellationException | ExecutionException 
| InterruptedException exception) {
			
				exception.printStackTrace(); 
				System.exit(-1); 
			}
		}

		// now calculate the sum using formula (N * (N + 1))/2 without doing the hard-work 
		long formulaSum = (N * (N + 1))/2; 
		// print the sum using formula and the ones calculated one by one 
		// they must be equal! 
		System.out.printf("Sum by threads = %d, sum using formula = %d", 
calculatedSum, formulaSum); 
	}
}
