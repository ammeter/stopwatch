package coinpurse;
/**
 * An interface for objects having amoney value and currency.
 * @author pannapat panpakdee
 *
 */
public interface Valuable {
	/**
	 * Get the monetary value of this object, in its own currency.
	 * 
	 * @return the value of this object
	 */
	public double getValue();
	
	/**
	 * Get the monetary currency of this object.
	 * 
	 * @return the currency of this object
	 */
	public String getCurrency();
}
