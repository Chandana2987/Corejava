import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Numbertestdemo {
	@Test
	void factorialtest()
	{
		int exp=120;
		int act=Numberfunction.getfactorial(5);
		assertEquals(exp,act);
		}

}
