import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.*;

import conversor.ConversorMoeda;

public class TesteConversorMoeda {

	@Test
	public void testConverterDolarEmReal() {
		Double valor = 250.00;
		Double expected = 1037.50;
		ConversorMoeda conversor = mock(ConversorMoeda.class);
		when(conversor.converterDolarParaReal(valor)).thenReturn(expected);
		Double actual = conversor.converterDolarParaReal(valor);
		assertEquals(expected, actual);
	}

	@Test
	public void testConverterEuroEmReal() {
		Double valor = 250.00;
		Double expected = 1142.50;
		ConversorMoeda conversor = mock(ConversorMoeda.class);
		when(conversor.converterEuroParaReal(valor)).thenReturn(expected);
		Double actual = conversor.converterEuroParaReal(valor);
		assertEquals(expected, actual);
	}

	@Test
	public void testConverterLibraEmReal() {
		Double valor = 250.00;
		Double expected = 1292.50;
		ConversorMoeda conversor = mock(ConversorMoeda.class);
		when(conversor.converterLibraParaReal(valor)).thenReturn(expected);
		Double actual = conversor.converterLibraParaReal(valor);
		assertEquals(expected, actual);
	}

}
