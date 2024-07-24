import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Parameterdemo {

	@ParameterizedTest
	//to give inputs we use valuesource
	@ValueSource(strings = {"call","bali","suri"})
	void endsWithI(String str)
	{
		assertTrue(str.endsWith("i"));
	}
	
}
