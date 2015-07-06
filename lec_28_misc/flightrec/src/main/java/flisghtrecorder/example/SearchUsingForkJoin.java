package flisghtrecorder.example;

import java.util.concurrent.*;

//This class illustrates how we can search a key within N numbers using fork/join framework // (using RecursiveAction).
//The range of numbers are divided into half till the range can be handled by a thread.
class SearchUsingForkJoin {
    private static int N = 100000000;
    private static final int NUM_THREADS = 3; // number of threads to create for
    // distributing the effort
    private static int searchKey= 9248;
    private static int[] arrayToSearch;

    // This is the recursive implementation of the algorithm;
    // inherit from RecursiveAction
    static class SearchTask extends RecursiveAction {
        private static final long serialVersionUID = 1L;
        int from, to;
        // from and to are range of values to search
        public SearchTask(int from, int to) {
            this.from = from;
            this.to = to;
        }

        public void compute() {
            //If the range is smaller enough to be handled by a thread,
            //we search in the range
            if( (to - from) <= N/NUM_THREADS) {
                // add in range 'from' .. 'to' inclusive of the value 'to'
                for(int i = from; i <= to; i++) {
                    if(arrayToSearch[i] == searchKey)
                        System.out.println("Search key found at index:" +i);
                }

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


            else {

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // no, the range is big for a thread to handle,
                // so fork the computation
                // we find the mid-point value in the range from..to
                int mid = (from + to)/2;
                System.out.printf("Forking computation into two ranges: " +
                        "%d to %d and %d to %d %n", from, mid, mid, to);
                //invoke all the subtasks
                invokeAll(new SearchTask(from, mid),new SearchTask(mid + 1, to));
            }
        }
    }


    //-XX:+UnlockCommercialFeatures -XX:+FlightRecorder -XX:StartFlightRecording=duration=60s,filename=myrecording.jfr -Xmx2g
    public static void main(String []args) {
        //intantiate the array to be searched
        arrayToSearch = new int[N];
        //fill the array with random numbers
        for(int i=0; i<N; i++){
            arrayToSearch[i] = ThreadLocalRandom.current().nextInt(0,10000);
        }
        // Create a fork-join pool that consists of NUM_THREADS
        ForkJoinPool pool = new ForkJoinPool(NUM_THREADS);
        // submit the computation task to the fork-join pool
        pool.invoke(new SearchTask(0, N-1));
    }
}
