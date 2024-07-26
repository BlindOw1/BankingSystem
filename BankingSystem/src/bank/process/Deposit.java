/**
 * This class processes the deposits.
 * 
 * @author yousefSharif
 * @since 20200403
 */

package bank.process;

public class Deposit extends Transaction{

	public Deposit(double amount) {
		super(amount);
	}
	
	@Override
	public String getType() {
		return "Deposit";
	}

}
