package cl.ubb.agil;

public class Calculadora {
public Calculadora(){
		
	}
	public int suma(int num1,int num2){
		return (num1+num2);
	}
	public int resta(int num1, int num2){
		return num1-num2;
	}
	public int division(int dividendo, int divisor)throws ExcepcionOperacionInvalida{
		if(divisor==0){
			throw new ExcepcionOperacionInvalida();
		}else{
			return dividendo/divisor;
		}
		
	}
}
