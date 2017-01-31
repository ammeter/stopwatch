package stopwatch;
/**
 * Sum Double in Primitive until reach the counter
 * @author Pannapat Panpakdee
 */
public class SumDoublePrimitive implements Runnable{
	static final int ARRAY_SIZE = 500000;
	private int counter;
	/**
	 * To declare how many time that DoublePrimitive have to sum
	 * @param counter is the time to sum DoublePrimitive
	 */
	public SumDoublePrimitive(int counter){
		this.counter = counter;
	}
	/**
	 * The task that sum DoublePrimitive until reach the counter
	 */
	@Override
	public void run(){
		double[] values = new double[ARRAY_SIZE];
		for(int k=0; k<ARRAY_SIZE; k++) values[k] = k+1;
		double sum = 0.0;
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
		return String.format("Sum array of double primitives with count=%,d\n", counter);
	}
}
