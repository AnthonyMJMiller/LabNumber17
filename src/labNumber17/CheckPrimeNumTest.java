package labNumber17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CheckPrimeNumTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void factor() {
		int prime = 2;
		assertEquals(prime, CheckPrimeNum.checkPrime(1));
	}
	
	@Test
	void factor2() {
		int prime = 13;
		assertEquals(prime, CheckPrimeNum.checkPrime(6));
	}
	
	@Test
	void factor3() {
		int prime = 97;
		assertEquals(prime, CheckPrimeNum.checkPrime(25));
	}
	
	@Test
	void factor4() {
		int prime = 97;
		assertEquals(prime, CheckPrimeNum.checkPrime(25));
	}
	
	@Test
	void factor5() {
		int prime = 281;
		assertEquals(prime, CheckPrimeNum.checkPrime(60));
	}
	
	@Test
	void factor6() {
		int prime = 541;
		assertEquals(prime, CheckPrimeNum.checkPrime(100));
	}
	
	@Test
	void factor7() {
		int prime = 7919;
		assertEquals(prime, CheckPrimeNum.checkPrime(1000));
	}

}
