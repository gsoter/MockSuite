import org.junit.*;
import conversor.ConversorNumerico;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class TesteConversorNumerico {

	ConversorNumerico conversor;

	@Test
	public void testConverterValor() {
		String valor = "R$ 259,99";
		Double num = 259.99;
		ConversorNumerico conversor = mock(ConversorNumerico.class);
		when(conversor.converterValor(valor)).thenReturn(num);
		Double result = conversor.converterValor(valor);
		assertEquals(num, result, .01);
	}
}
