package conversor;

public class ConversorMoeda {

	private static final Double CAMBIO_DOLAR_REAL = 4.15;
	private static final Double CAMBIO_EURO_REAL = 4.57;
	private static final Double CAMBIO_LIBRA_REAL = 5.17;
	
	public Double converterDolarParaReal(Double valor) {
		return valor * CAMBIO_DOLAR_REAL;
	}

	public Double converterEuroParaReal(Double valor) {
		return valor * CAMBIO_EURO_REAL;
	}

	public Double converterLibraParaReal(Double valor) {
		return valor * CAMBIO_LIBRA_REAL;
	}

}
