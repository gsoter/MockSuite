package conversor;

public class ConversorNumerico {

	/**
	 * Recebe um valor em moeda e converte em valor processável (Ex.: 2.590,99 =
	 * 2590.99)
	 * 
	 * @param valor em moeda
	 * @return o valor convertido
	 */
	public Double converterValor(String valor) {
		String result = valor.replaceAll(",", ".").replaceAll("[abc]", "");
		return (Double) Double.parseDouble(result);
	}
}
