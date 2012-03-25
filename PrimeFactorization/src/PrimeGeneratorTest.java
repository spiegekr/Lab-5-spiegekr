import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class PrimeGeneratorTest {

	@Test
	public void testJUnit() {
		assertTrue ("The compiler is sick ",true );
	}

	@Test
	public void testOne() {
		assertEquals (new ArrayList<Integer> (), PrimeGenerator.generatePrimes(1));
	}
}
