package stopwatch;
/**
 * A Stopwatch that measures elapsed time between a starting time
 * and stopping time, or until the present time.
 * @author Pannapat Panpakdee
 * @version 1.0
 */
public class StopWatch {
	/** Constant for converting nanoseconds to second. */
	private static final double NANOSECONDS = 1.0E-9;
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime = 0;
	/** time that the stopwatch was stopped in nanoseconds. */
	private long stopTime = 0;
	/** Status of stopwatch, (run or not run) */
	private boolean running = false;
	
	/** Start the stopwatch if it is not already running. */
	public void start(){
		if(this.running == false){
			this.startTime = System.nanoTime();
			this.running = true;
		}
	}
	/** Stop the stopwatch if it is running. */
	public void  stop(){
		if(this.isRunning()){
			this.stopTime = System.nanoTime();
			this.running = false;
		}
	}
	/** Calculate the time that was run.
	 * @return Time is how long that it is running.
	 */
	public double getElapsed(){
		double elapsed;
	    if (this.running) {
	      elapsed = (System.nanoTime() - this.startTime)*NANOSECONDS;
	    }
	    else {
	      elapsed = (this.stopTime - this.startTime)*NANOSECONDS;
	    }
	    return elapsed;
	}
	/** Check that stopwatch is running or not
	 * @return true if the stopwatch is running.
	 */
	public boolean isRunning(){
		if(this.running){
			return true;
		}
		else
			return false;
	}
}
