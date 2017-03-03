package coinpurse;

/**
 * a coin with a monetary value and currency
 * @author Pannapat Panpakdee
 */
public class Coin extends AbstractValuable {
	public static final String DEFAULT_CURRENCY = "Baht";
	/** Value of the coin. */
	private double value;
	/** The currency, of course. */
	private String currency;

	/**
	 * A coin with given value using the default currency.
	 * 
	 * @param value
	 */
	public Coin( double value ) {
		super(value);
	}

	/**
	 * A coin with given value and currency.
	 * 
	 * @param value
	 * @param currency
	 */
	public Coin( double value, String currency ) {
		super(value,currency);
	}
	
//	/**
//	 * To return the value
//	 * 
//	 * @return value 
//	 */
//	public double getValue( ) {
//		return this.value;
//	}
	
//	/**
//	 * To return the currency
//	 * 
//	 * @return currency
//	 */
//	public String getCurrency( ) {
//		return this.currency;
//	}
	
	/**
	 * To compare that the value and the currency is match or not
	 * 
	 * @return true if the value and the currency is matched
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(obj.getClass() != this.getClass())
			return false;
		Coin other = (Coin) obj;
		if(other.value == value && other.currency.equalsIgnoreCase(currency))
			return true;
		return false;
	}
	
	/**
	 * To compare that which value is greater that another one
	 * 
	 * @return -1 if the first coin is greater
	 */
	public int compareTo(Coin c) {
		if(c==null){
			return -1;
		}
		return (int) Math.signum(c.getValue()-this.getValue());
	}
	
	/**
	 * To make to String
	 * 
	 * @return String
	 */
	public String toString( ) { 
		return this.value+" "+this.currency; 
	}
}
