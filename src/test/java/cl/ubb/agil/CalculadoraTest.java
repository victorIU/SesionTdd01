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
	@Test
	public void RestaDoscientosMenosSetentaYTresEsCientoveintisiete(){
		
		Calculadora calculadora=new Calculadora();
		
		int suma=calculadora.resta(200, 73);
		
		assertThat(suma, is(127));
	}
	@Test
	public void RestaMenosDiezYCincoEsQuince(){

		Calculadora calculadora=new Calculadora();
		
		int suma=calculadora.resta(-10, 5);
		
		assertThat(suma, is(-15));
	}
	@Test
	public void divisionDeDoceYTresEsCuatro(){
		Calculadora calculadora=new Calculadora();
		
		int division=calculadora.division(12, 3);
		
		assertThat(division,is(4));
	}
	@Test
	public void divisionDeTreintaYSeisEsSeis(){
		Calculadora calculadora=new Calculadora();
		
		int division=calculadora.division(30, 6);
		
		assertThat(division,is(6));
	}
	@Test (expected=ExcepcionOperacionInvalida.class)
	public void divisionDeDiceYCeroLanzaExcepcion(){
Calculadora calculadora=new Calculadora();
		
		int division=calculadora.division(12, 0);
		
		assertThat(division,is(6));
	}
}

