package coinpurse;
/**
 * To create a money object with Thai currency
 * @author Pannapat Panpakdee
 *
 */
public class ThaiMoneyFactory extends MoneyFactory{
	private Valuable valuable;
	/**
	 * To choose that what type of value have to create (coin or banknote)
	 * 
	 * @param value of money to create
	 */
	@Override
	public Valuable createMoney(double value) {
		if(value == 20 || value == 50 || value == 100 || value == 1000){
			valuable = new BankNote(value, "Baht");
		}
		else if(value == 1 || value == 2 || value == 5 || value == 10){
			valuable = new Coin(value, "Baht");
		}
		return valuable;
	}
	
}