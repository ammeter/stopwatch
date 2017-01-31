package stopwatch;
/**
 * To give number of counter to the task and print the answer
 * @author Pannapat Panpakdee
 *
 */
public class Main {
	public static void main(String[] args){
		TaskTimer task = new TaskTimer();
		
		task.measureAndPrint(new AppendToString(50000));
		task.measureAndPrint(new AppendToString(100000));
		
		task.measureAndPrint(new AppendToStringBuilder(100000));
		
		task.measureAndPrint(new SumDoublePrimitive(1000000));
		
		task.measureAndPrint(new SumDouble(1000000));
		
		task.measureAndPrint(new SumBigDecimal(1000000));
	}
}
