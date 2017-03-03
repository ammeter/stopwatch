package coinpurse;
/**
 * A class to 
 * @author Pannapat Panpakdee
 *
 */
import java.util.ArrayList;
import java.util.List;

public abstract class MoneyFactory {
	protected static MoneyFactory factory = null;
	
	protected MoneyFactory ( ) {
	}
	
	/**
	 * To get an instance
	 * 
	 * @return object of ThaiMoneyFactory
	 */
	public static MoneyFactory getInstance() {
		if ( factory == null ) factory = new ThaiMoneyFactory( );
		return factory;
	}
	
	/**
	 * Create money object
	 * 
	 * @param value
	 * @return
	 */
	public abstract Valuable createMoney (double value);
	
	/**
	 * Create money object
	 * 
	 * @param value
	 * @return
	 */
	public Valuable createMoney (String value) {
		return createMoney(Double.parseDouble(value));
	}
}