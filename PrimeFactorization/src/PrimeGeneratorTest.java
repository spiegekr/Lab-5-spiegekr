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
	
	@Test
	public void test69() {
		assertEquals (list(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67), PrimeGenerator.generatePrimes(69));
	}
	
	private ArrayList<Integer> list (int... ints) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i : ints){
			ret.add(i);
		}
		return ret;
	}
}
