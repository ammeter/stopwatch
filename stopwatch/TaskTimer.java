package stopwatch;
/**
 * To run the stopwatch with other task
 * @author Pannapat Panpakdee
 */

public class TaskTimer {
	StopWatch timer = new StopWatch();
	
	/**
	 * Print how long that the task run
	 * @param task is activity that use with stopwatch
	 */
	public void measureAndPrint(Runnable task){
		System.out.print(task.toString());
		timer.start();
		task.run();
		timer.stop();
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}
}