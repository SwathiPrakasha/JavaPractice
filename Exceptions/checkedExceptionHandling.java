/*In the checked exceptions, the calling function should either one of below
 * 1.try catch 
 * 2. throw exception 
 */
package Exceptions;

class AmountAdder2 {
	static Amount addAmounts(Amount amount1, Amount amount2) throws Exception {
		if (!amount1.currency.equals(amount2.currency)) {
			throw new Exception("Curencies don't match");
			//throw new RuntimeException("Currencies Do Not Match");
		}
		return new Amount(amount1.currency, amount1.amount + amount2.amount);
	}
}

//method 1: using throw Exception
/*
public class checkedExceptionHandling {	
		public static void main(String[] args) throws Exception{
				Amount result = new Amount(); 
				result = AmountAdder2.addAmounts(new Amount("RUPEE", 5), new Amount("RUPEE", 5));
				System.out.println(result);
				
				result = AmountAdder2.addAmounts(new Amount("RUPEE", 5), new Amount("Dollar", 5));
				System.out.println(result);	
		}
		
*/

//method 2 : using try, catch

public class checkedExceptionHandling {	
		public static void main(String[] args) {
				try {
					Amount result = new Amount(); 
					result = AmountAdder2.addAmounts(new Amount("RUPEE", 5), new Amount("RUPEE", 5));
					System.out.println(result);
					
					result = AmountAdder2.addAmounts(new Amount("RUPEE", 5), new Amount("Dollar", 5));
					System.out.println(result);	
				}
				
				catch (Exception e) {
					System.out.println("Handled CurrenciesDoNotMatchException");
				}
			}
}
