package coinpurse;
/**
 * purse is to calculate the withdraw
 * @author Pannapat Panpakdee
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *  A coin purse contains coins.
 *  You can insert coins, withdraw money, check the balance,
 *  and check if the purse is full.
 *  When you withdraw money, the coin purse decides which
 *  coins to remove.
 *  
 *  @author Pannapat Panpakdee
 */
public class Purse {
    /** Collection of objects in the purse. */
    List<Valuable> money = new ArrayList<Valuable>();
    /** Capacity is maximum number of coins the purse can hold.
     *  Capacity is set when the purse is created and cannot be changed.
     */
    private int capacity;
    
    /** 
     *  Create a purse with a specified capacity.
     *  @param capacity is maximum number of coins you can put in purse.
     */
    public Purse( int capacity ) {
    	this.capacity = capacity;
    }

    /**
     * Count and return the number of coins in the purse.
     * This is the number of coins, not their value.
     * @return the number of coins in the purse
     */
    public int count() { return money.size(); }
    
    /** 
     *  Get the total value of all items in the purse.
     *  @return the total value of items in the purse.
     */
    public double getBalance() {
    	double sum = 0;
    	for(int i=0; i<count(); i++){
    		sum = sum + money.get(i).getValue();
    	}
    	return sum;
    }

    /**
     * Return the capacity of the coin purse.
     * @return the capacity
     */
    public int getCapacity() {
    	return this.capacity; 
    }
    
    /** 
     *  Test whether the purse is full.
     *  The purse is full if number of items in purse equals
     *  or greater than the purse capacity.
     *  @return true if purse is full.
     */
    public boolean isFull() {
    	if(count() >= this.capacity){
    		return true;
    	}
        return false;
    }

    /** 
     * Insert a coin into the purse.
     * The coin is only inserted if the purse has space for it
     * and the coin has positive value.  No worthless coins!
     * @param coin is a Coin object to insert into purse
     * @return true if coin inserted, false if can't insert
     */
    public boolean insert( Valuable valuable ) {
    	if(!isFull()){
    		if(valuable.getValue() <= 0){
    			return false;
    		}
    		else{
    			money.add(valuable);
    			return true;
    		}
    	}
        return false;
    }
    
    /**  
     *  Withdraw the requested amount of money.
     *  Return an array of Coins withdrawn from purse,
     *  or return null if cannot withdraw the amount requested.
     *  @param amount is the amount to withdraw
     *  @return array of Coin objects for money withdrawn, 
	 *    or null if cannot withdraw requested amount.
     */
    public Valuable[] withdraw( double amount ) {
    	List withdraw = new ArrayList();
        if(amount < 0){
        	return null;
        }
		if ( amount > 0 ){
			Arrays.sort(money.toArray());
//			Collections.sort(money, new Comparator<Valuable>){
//				@Override
//				public int compare(Valuable v1, Valuable v2){
//					return v1.compareTo(v2);
//				}
//			}
			for(int i=0; i<count(); i++){
				
				if(money.get(i).getValue() <= amount){
					amount = amount-money.get(i).getValue();
					withdraw.add(money.get(i).getValue());
					money.remove(i);
					i--;
				}
			}
			if(amount>getBalance()){	
				return null;
			}
		}
		Valuable[] array = new Valuable [withdraw.size()];
		withdraw.toArray(array);
		return array;
	}
  
    /** 
     * toString returns a string description of the purse contents.
     * It can return whatever is a useful description.
     * @return String
     */
    public String toString() {
    	return getCapacity() + " Money with value "+getBalance();
    }
}
