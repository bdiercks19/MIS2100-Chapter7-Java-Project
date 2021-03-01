package MyGradleProject;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class SimpleMath {

	public double divide(double numerator, double denominator) {
		if (denominator == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		
		double value = numerator / denominator;
		return value;
	}

}
//