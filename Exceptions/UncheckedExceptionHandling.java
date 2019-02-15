/* Example of unchecked exception. 
 * calling method does not need to do anything
 * 
 * 
 */
package Exceptions;

class Amount {
	Amount(){		
	}
	
	public Amount(String currency, int amount) {
		this.currency = currency;
		this.amount = amount;
	}
	
	String currency;
	int amount;// Should ideally use BigDecimal
	
	public String toString() {
		return "TOtal Amount is "+currency+ " " +amount;
	}
}

class CurrenciesDoNotMatchException extends RuntimeException {
}

class AmountAdder {
	static Amount addAmounts(Amount amount1, Amount amount2) {
		if (!amount1.currency.equals(amount2.currency)) {
			throw new CurrenciesDoNotMatchException();
			//throw new RuntimeException("Currencies Do Not Match");
		}
		return new Amount(amount1.currency, amount1.amount + amount2.amount);
	}
}


public class UncheckedExceptionHandling {
	//calling function of the exception method.
	public static void main(String[] args) {
			Amount result = new Amount(); 
			result = AmountAdder.addAmounts(new Amount("RUPEE", 5), new Amount("Dollar", 5));
			System.out.println(result);
			}
	}
