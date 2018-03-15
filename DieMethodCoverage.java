import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DieMethodCoverage {

	private Die die;
	
	@Test
	public void testConstrutorPadrao(){
		this.die = new Die();
		assertEquals(Die.DEFAULT_SIDES, this.die.getNumSides());
		assertEquals(1, this.die.getResult());
	}
	
	@Test
	public void testConstrutorApenasComNumeroLados(){
		this.die = new Die(10);
		assertEquals(10, this.die.getNumSides());
		assertEquals(1, this.die.getResult());
	}
	
	@Test
	public void testConstrutorComNumeroLadosEResultado(){
		this.die = new Die(10, 5);
		assertEquals(10, this.die.getNumSides());
		assertEquals(5, this.die.getResult());
	}

	@Test
	public void testToString(){
		this.die = new Die(20, 4);
		String resultadoEsperado = "Num sides " + 20 + " result " + 4;
		assertEquals(resultadoEsperado, this.die.toString());
	}
	
	@Test
	public void testEquals(){
		Die die1 = new Die();
		Die die2 = new Die();
		
		assertEquals(die1, die2);
	}
	
	@Test
	public void testRoll(){
		this.die = new Die(10, 5);
		assertTrue(this.die.roll() >= 1 && this.die.roll() <= 10);
		
	}



}
