package test;

import stopwatch.StopWatch;

public class StopwatchApp {
	public static void main(String[] args){
		StopWatch timer = new StopWatch();
		System.out.println("Starting task");
		timer.start();
		timer.stop();
		System.out.printf("elapsed = %.6f sec\n", timer.getElapsed());
		if(timer.isRunning()){
			System.out.println("timer is still running!");
		}
		else{
			System.out.println("timer is stopped");
		}
	}
}