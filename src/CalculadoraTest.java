import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	@Test
	void testSomar() {
		double n1 = 15;
		double n2 = 15;
		double resultadoEsp = 30;
		Calcular calc = new Calcular();
		double resultado = calc.somar(n1, n2);
		assertEquals(resultadoEsp,resultado);
		
		
	}
	
	@Test
	void testSomarErrado() {
		double n1 = 15;
		double n2 = 100;
		double resultadoEsp = 30;
		Calcular calc = new Calcular();
		double resultado = calc.somar(n1, n2);
		assertEquals(resultadoEsp,resultado);
		
		
	}
	
	@Test
	void testSubratrair() {
		double n1 = 100;
		double n2 = 10;
		double resultadoEsp = 90;
		Calcular calc = new Calcular();
		double resultado = calc.subtrair(n1, n2);
		assertEquals(resultadoEsp,resultado);
		
		
	}
	
	
	@Test
	void testSubratrairErrado() {
		double n1 = 100;
		double n2 = 20;
		double resultadoEsp = 90;
		Calcular calc = new Calcular();
		double resultado = calc.subtrair(n1, n2);
		assertEquals(resultadoEsp,resultado);
		
		
	}
	@Test
	void testMultiplicar() {
		double n1 = 50;
		double n2 = 5;
		double resultadoEsp = 250;
		Calcular calc = new Calcular();
		double resultado = calc.multiplicar(n1, n2);
		assertEquals(resultadoEsp,resultado);
		
		
	}
	@Test
	void testMultiplicarErrado() {
		double n1 = 50;
		double n2 = 6;
		double resultadoEsp = 250;
		Calcular calc = new Calcular();
		double resultado = calc.multiplicar(n1, n2);
		assertEquals(resultadoEsp,resultado);
		
		
	}
	
	@Test
	void testDividir() {
		double n1 = 200;
		double n2 = 10;
		double resultadoEsp = 20;
		Calcular calc = new Calcular();
		double resultado = calc.dividir(n1, n2);
		assertEquals(resultadoEsp,resultado);
		
		
	}
	//dividir por zero
	@Test
	void testDividirpor0() {
		double n1 = 200;
		double n2 = 0;
		double resultadoEsp = 20;
		Calcular calc = new Calcular();
		double resultado = calc.dividir(n1, n2);
		assertEquals(resultadoEsp,resultado);
		
		
	}
	@Test
	void testDividirErrado() {
		double n1 = 200;
		double n2 = 5;
		double resultadoEsp = 20;
		Calcular calc = new Calcular();
		double resultado = calc.dividir(n1, n2);
		assertEquals(resultadoEsp,resultado);
		
		
	}

}
