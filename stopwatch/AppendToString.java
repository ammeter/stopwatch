package stopwatch;
/**
 * Append 'a' to String until reach the count
 * @author Pannapat Panpakdee
 */
public class AppendToString implements Runnable{
	private int count;
	/**
	 * To declare the size of final string
	 * @param count is the final size of string
	 */
	public AppendToString(int count){
		this.count = count;
	}
	/**
	 * add 'a' to String until it equals the count
	 */
	@Override
	public void run(){
		
		final char CHAR = 'a';
		String result = "";
		int k = 0;
		while(k++ < count) {
			result = result + CHAR;
		}
		System.out.println("final string length = " + result.length());
	}
	/**
	 * Return String to task
	 * @return String that describe what the task do
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to String\n", count);
	}
}