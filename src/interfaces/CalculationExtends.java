/**
 * 
 */
package interfaces;

import java.text.DecimalFormat;

/**
 * @author vellaisamysudalaimuthu
 *
 */
public class CalculationExtends extends CalculationImpl {

	@Override
	public double cal(float k, float l) {
		// TODO Auto-generated method stub
		DecimalFormat df=new DecimalFormat("0.00");
		return Double.valueOf(df.format(k+l));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculation calc=new CalculationExtends();
		System.out.println("Value of add method: "+calc.add(10, 15));
		System.out.println("Value of cal method: "+calc.cal(5.50f, 15.38f));
	}

}
