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
	
	@Test
	public void testTwo() {
		assertEquals (list(), PrimeGenerator.generatePrimes(2));
	}
	
	@Test
	public void testThree() {
		assertEquals (list(2), PrimeGenerator.generatePrimes(3));
	}
	
	@Test
	public void testFour() {
		assertEquals (list(2, 3), PrimeGenerator.generatePrimes(4));
	}
	
	@Test
	public void testFive() {
		assertEquals (list(2, 3), PrimeGenerator.generatePrimes(5));
	}
	
	@Test
	public void testEight() {
		assertEquals (list(2, 3, 5, 7), PrimeGenerator.generatePrimes(8));
	}
	
	@Test
	public void testNine() {
		assertEquals (list(2, 3, 5, 7), PrimeGenerator.generatePrimes(9));
	}
	
	
	
	private ArrayList<Integer> list (int... ints) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i : ints){
			ret.add(i);
		}
		return ret;
	}
}
