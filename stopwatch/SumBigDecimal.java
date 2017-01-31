package stopwatch;

import java.math.BigDecimal;
/**
 * Sum BigDecimal until reach the counter
 * @author Pannapat Panpakdee
 */
public class SumBigDecimal  implements Runnable{
	static final int ARRAY_SIZE = 500000;
	private int counter;
	/**
	 * To declare how many time that Sum BigDecimal have to sum
	 * @param counter is the time to sum BigDecimal
	 */
	public SumBigDecimal(int counter){
		this.counter = counter;
	}
	/**
	 * The task that sum BigDecimal until reach the counter
	 */
	@Override
	public void run(){
		BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = new BigDecimal(i+1);
		BigDecimal sum = new BigDecimal(0.0);
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum.add( values[i] );
		}
		System.out.println("sum = " + sum);
	}
	/**
	 * Return String to task
	 * @return String that describe what the task do
	 */
	@Override
	public String toString() {
		return String.format("Sum array of BigDecimal with count=%,d\n", counter);
	}
}
