package stopwatch;
/**
 * Append 'a' to StringBuilder until reach the count
 * @author Pannapat Panpakdee
 *
 */

public class AppendToStringBuilder implements Runnable{
	private int count;
	/**
	 * To declare the final size of StringBuilder
	 * @param count is the final size of string
	 */
	public AppendToStringBuilder(int count){
		this.count = count;
	}
	/**
	 * add 'a' to StringBuilder until it equals the count
	 */
	@Override
	public void run(){
		
		final char CHAR = 'a';
		StringBuilder builder = new StringBuilder(); 
		int k = 0;
		while(k++ < count) {
			builder = builder.append(CHAR);
		}
		String result = builder.toString();
		System.out.println("final string length = " + result.length());
	}
	/**
	 * Return String to task
	 * @return String that describe what the task do
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to StringBuilder\n", count);
	}
}
