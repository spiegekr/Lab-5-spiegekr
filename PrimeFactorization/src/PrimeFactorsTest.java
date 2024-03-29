import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
 

public class PrimeFactorsTest {

@Test
public void testJUnit() {
	assertTrue ("The compiler is sick ",true );
}

@Test
public void testOne() {
	assertEquals (new ArrayList<Integer> (), PrimeNumbers.generatePrimes(1));
}

@Test
public void testTwo() {
	assertEquals (list(2), PrimeNumbers.generatePrimes(2));
}

@Test
public void testThree() {
	assertEquals (list(3), PrimeNumbers.generatePrimes(3));
}


@Test
public void testFour() {
	assertEquals (list(2, 2), PrimeNumbers.generatePrimes(4));
}

@Test
public void testSix() {
	assertEquals (list(2, 3), PrimeNumbers.generatePrimes(6));
}

@Test
public void testEight() {
	assertEquals (list(2, 2, 2), PrimeNumbers.generatePrimes(8));
}

@Test
public void testNine() {
	assertEquals (list(3, 3), PrimeNumbers.generatePrimes(9));
}

@Test
public void testTen() {
	assertEquals (list(2, 5), PrimeNumbers.generatePrimes(10));
}

@Test
public void testTwelve() {
	assertEquals (list(2, 2, 3), PrimeNumbers.generatePrimes(12));
}

@Test
public void testBig() {
	assertEquals (list(5, 7, 7, 1327), PrimeNumbers.generatePrimes(325115));
}


private ArrayList<Integer> list (int... ints) {
	ArrayList<Integer> ret = new ArrayList<Integer>();
	for(int i : ints){
		ret.add(i);
	}
	return ret;
}

}
