package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import practica.Prima;

public class PrimaTest {

	@Test
	public void testGetPrimaCaso1() {
		Prima prima = new Prima();
		assertEquals("Caso 1: 50, casado, mujer -> 200", 200, prima.getPrima("50", "casado", "m"));
	}

	@Test
	public void testGetPrimaCaso2() {
		Prima prima = new Prima();
		assertEquals("Caso 2: 20, soltero, hombre -> 600", 600, prima.getPrima("20", "soltero", "h"));
	}

	@Test
	public void testGetPrimaCaso3() {
		Prima prima = new Prima();
		assertEquals("Caso 3: 70, viudo, m -> 300", 300, prima.getPrima("70", "viudo", "m"));
	}

	@Test
	public void testGetPrimaCaso4() {
		Prima prima = new Prima();
		assertEquals("Caso 4: 100, -----, ----- -> -1", -1, prima.getPrima("100", "", ""));
	}

	@Test
	public void testGetPrimaCaso8() {
		Prima prima = new Prima();
		assertEquals("Caso 4: 100, -----, ----- -> -1", -1, prima.getPrima("dd", "", ""));
	}

	
	@Test
	public void testGetPrimaCaso5() {
		Prima prima = new Prima();
		assertEquals("Caso 5: 20, t, ------- -> -1", -1, prima.getPrima("20", "t", ""));
	}

	@Test
	public void testGetPrimaCaso6() {
		Prima prima = new Prima();
		assertEquals("Caso 6: 20, no, h -> -1", -1, prima.getPrima("20", "no", "h"));
	}

	@Test
	public void testGetPrimaCaso7() {
		Prima prima = new Prima();
		assertEquals("Caso 7: 20, divorciado, mujer -> 400", 400, prima.getPrima("20", "divorciado", "m"));
	}

	
}
