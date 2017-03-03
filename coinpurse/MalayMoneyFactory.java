package coinpurse;
/**
 * To create a money object with Malaysia currency
 * @author Pannapat Panpakdee
 *
 */
public class MalayMoneyFactory extends MoneyFactory{
	private Valuable valuable;
	/**
	 * To choose that what type of value have to create (coin or banknote)
	 * 
	 * @param value of money to create
	 */
	@Override
	public Valuable createMoney(double value) {
		if(value == 1 || value == 2 || value == 5 || value == 10 || value == 20 || value == 50 || value == 100){
			valuable = new BankNote(value, "Ringgit");
		}
		else if(value == 0.05 || value == 0.10 || value == 0.20 || value == 0.50){
			valuable = new Coin(value, "Sen");
		}
		return valuable;
	}
}
