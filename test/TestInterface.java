package test;
import javax.swing.JOptionPane;

public class TestInterface {
	public static void main(String[] args){
		String title = "Alarm Clock";
		String message = "Wake Up.";
		int type = JOptionPane.INFORMATION_MESSAGE;
		JOptionPane.showMessageDialog(null, message, title, type);
	}
}