package coinpurse;
/**
 * A class to manage Coin and BankNote
 * @author Pannapat Panpakdee
 *
 */

public abstract class AbstractValuable implements Valuable {
	private double value;
	private String currency;
	
	public AbstractValuable (double value) {
		this.value = value;
	}
	
	public AbstractValuable (double value, String currency) {
		this.value = value;
		this.currency = currency;
	}
	
	/**
	 * To compare that which value is greater that another one
	 * 
	 * @param valuable a value to compare
	 * 
	 * @return -1 if the first coin is greater
	 */
	public int compareTo (Valuable valuable) {
		if(valuable==null){
			return -1;
		}
		return (int) Math.signum(valuable.getValue()-this.getValue());
	}
	/**
	 * To compare that two objects have the same value and the same currency or not
	 * 
	 * @param obj is an object to compare
	 * @return true if two objects have the same value and currency
	 */
	public boolean equals (Object obj) {
		if (obj == null) return false;
		if (obj.getClass() != this.getClass())
			return false;
		Coin other = (Coin) obj;
		if(this.value == value && this.currency.equalsIgnoreCase(currency))
			return true;
		return false;
	}
	/**
	 * To return a value of money
	 * 
	 * @return value of money
	 */
	public double getValue () {
		return this.value;
	}
	/**
	 * To return a currency of money
	 * 
	 * @return currency of money
	 */
	public String getCurrency () {
		return this.currency;
	}
}
