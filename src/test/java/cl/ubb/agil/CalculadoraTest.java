package cl.ubb.agil;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.hamcrest.CoreMatchers.is;

public class CalculadoraTest {
	@Test
	public void sumarDosYTresEsCinco(){
		
		Calculadora calculadora=new Calculadora();
		
		int suma=calculadora.suma(2, 3);
		
		assertThat(suma,is(5));
	}
	@Test
	public void sumarMenosUnoYSiete(){
		
		Calculadora calculadora = new Calculadora();
		
		int suma=calculadora.suma(-1, 7);
		
		assertThat(suma,is(6));
	}
}

