/**
 * 
 */
package interfaces;

/**
 * @author vellaisamysudalaimuthu
 *
 */
public class CalculationImpl implements Calculation {

	@Override
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		
		return i+j;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation calc=new CalculationImpl();
		System.out.println(calc.add(10, 15));
	}

}
