package stopwatch;
/**
 * Sum Double until reach the counter
 * @author Pannapat Panpakdee
 */
public class SumDouble implements Runnable{
	static final int ARRAY_SIZE = 500000;
	private int counter;
	/**
	 * To declare how many time that double have to sum
	 * @param counter is the time to sum double
	 */
	public SumDouble(int counter){
		this.counter = counter;
	}
	/**
	 * The task that sum Double until reach the counter
	 */
	@Override
	public void run(){
		Double[] values = new Double[ARRAY_SIZE];
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = new Double(i+1);
		Double sum = new Double(0.0);
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum + values[i];
		}
		System.out.println("sum = " + sum);
	}
	/**
	 * Return String to task
	 * @return String that describe what the task do
	 */
	@Override
	public String toString() {
		return String.format("Sum array of Double objects with count=%,d\n", counter);
	}
}
