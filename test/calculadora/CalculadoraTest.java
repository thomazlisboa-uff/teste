package calculadora;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe para teste da calculadora")
public class CalculadoraTest {
	
	private Calculadora calc;
	
	@BeforeEach
	public void inicializa() {
		calc = new Calculadora();
	}
	
	@DisplayName("Testa a soma de dois n�meros")
	@Test
	public void testSomaDoisNumeros() {
		int soma = calc.soma(4, 5);		
		Assertions.assertEquals(9, soma);		
	}
	
	@Test
	public void testDivisaoDoisNumeros() {
		int divisao = calc.divisao(8, 4);
		assertTrue(divisao == 2);
	}
	
	@Test
	public void testDivisaoPorZero() {
		try {
			int divisao = calc.divisao(8, 0);
			fail("Exce��o n�o lan�ada");
		}catch (ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}		
	}
	
	@Test
	public void testDivisaoPorZeroComAssertThrows() {
		assertThrows(ArithmeticException.class,
				() -> calc.divisao(8, 0));
	}
	@Test
	public void testSubtracao(){
		int resultado = calc.subtracao(5, 2);
		assertTrue(resultado == 3);
	}
	@Test
	public void testSomatoria(){
		int resultado = calc.somatoria(5);

		Assertions.assertEquals(15, resultado);
	}

	@Test
	public void testehPositivo(){
		boolean resultado = calc.ehPositivo(3);
		assertTrue(resultado);
	}

	@Test
	public void testCompara() {
		int num1 = 2;
		int num2 = 4;
		Assertions.assertAll("compara",
				() -> assertEquals(0, calc.compara(num1, num1)),
				() -> assertEquals(-1, calc.compara(num1, num2)),
				() -> assertEquals(1, calc.compara(num2, num1))

		);
	}

}
