/**
 * This class processes the withdrawals. 
 * 
 * @author yousefSharif
 * @since 20200403
 */

package bank.process;

public class Withdrawal extends Transaction {

	public Withdrawal(double amount) {
		super(amount);
	}
	
	@Override
	public String getType() {
		return "Withdrawal";
	}

}
