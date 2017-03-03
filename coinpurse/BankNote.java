package coinpurse;

/**
 * A BankNote with a monetary value, currency and serialNumber
 * @author Pannapat Panpakdee
 *
 */
public class BankNote extends AbstractValuable {
	private static long nextSerialNumber = 1000000;
	private String currency;
	private long serialNumber;
	private double value;
	
	/**
	 * To give a value to default
	 * @param value
	 */
	public BankNote(double value){
		super(value);
		this.serialNumber = nextSerialNumber;
		this.serialNumber++;
	}
	
	/**
	 * To give a value and currency to BankNote
	 * @param value
	 * @param currency
	 */
	public BankNote(double value, String currency){
		super(value);
		this.currency = currency;
		this.nextSerialNumber++;
	}
	
//	/**
//	 * To return the value
//	 * 
//	 * @return the value in BankNote
//	 */
//	public double getValue(){
//		return this.value;
//	}
	
	/**
	 * TOo return the currency
	 * 
	 * @return the currency in BankNote
	 */
	public String getCurrency(){
		return this.currency;
	}
	
	/**
	 * To return a SerialNumber in BankNote
	 * 
	 * @return the serialNumber in BankNote
	 */
	public long getSerial(){
		return this.serialNumber;
	}
	
	/**
	 * To compare that obj is the same currency or not
	 * 
	 * @param obj is the object in BankNote
	 * 
	 * @return true if obj is the same currency
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(obj.getClass() != this.getClass())
			return false;
		BankNote other = (BankNote) obj;
		if(other.value == value && other.currency.equalsIgnoreCase(currency))
			return true;
		return false;
	}
	
	/**
	 * To retuen a currency with serialNumber
	 * 
	 * @return currency with serialNumber
	 */
	public String toString(){
		return this.currency+" currency note ["+this.serialNumber+"]";
	}
}
