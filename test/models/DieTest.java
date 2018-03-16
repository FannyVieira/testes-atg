import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import models.Die;

public class DieTest {
	
	private Die die, die1, die2, die3;
	
	@Before
	public void setUp() {
		die1 = new Die();
		die2 = new Die(4);
		die3 = new Die(4, 2); 
		
	}
	
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
	
	@Test
	public void testRoll1() {
		assertTrue(this.die1.roll() >= 1 || this.die1.roll() <= 6);
	}
	
	@Test
	public void testRoll2() {
		assertTrue(this.die2.roll() >= 1 || this.die2.roll() <= 4);
	}
	
	@Test
	public void testRoll3() {
		assertTrue(this.die3.roll() >= 1 || this.die3.roll() <= 4);
	}

	@Test
	public void testGetNumSides1() {
		assertEquals(6, this.die1.getNumSides());
	}
	
	@Test
	public void testGetNumSides2() {
		assertEquals(4, this.die2.getNumSides());
	}
	
	@Test
	public void testGetNumSides3() {
		assertEquals(4, this.die3.getNumSides());
	}

	@Test
	public void testGetResult() {
		assertEquals(1, this.die1.getResult());
	}
	
	@Test
	public void testGetResult1() {
		assertEquals(1, this.die1.getResult());
	}
	
	@Test
	public void testGetResult2() {
		assertEquals(1, this.die2.getResult());
	}
	
	@Test
	public void testGetResult3() {
		assertEquals(2, this.die3.getResult());
	}

	@Test
	public void testEqualsObject() {
		assertFalse(this.die1.equals(null));
	}
	
	@Test
	public void testEqualsObject2() {
		assertTrue(this.die1.equals(this.die1));
	}
	
	@Test
	public void testEqualsObject3() {
		assertFalse(this.die1.equals(new HashSet<>()));
	}
	
	@Test
	public void testEqualsObject4() {
		Die otherDie = new Die(4, 2);
		assertTrue(this.die3.equals(otherDie));
	}
	
	@Test
	public void testEqualsObject5() {
		Die otherDie = new Die(3, 2);
		assertFalse(this.die3.equals(otherDie));
	}
	
	@Test
	public void testEqualsObject6() {
		Die otherDie = new Die(3, 1);
		assertFalse(this.die3.equals(otherDie));
	}
	
	@Test
	public void testDie1() {
		try{
			new Die(0, 0);
		} catch (AssertionError a) {
			assertEquals(a.getMessage(), "Violation of precondition");
		}
	}
	
	@Test
	public void testDie2() {
		try{
			new Die(0, 2);
		} catch (AssertionError a) {
			assertEquals(a.getMessage(), "Violation of precondition");
		}
	}
	
	@Test
	public void testDie3() {
		try{
			new Die(4, 0);
		} catch (AssertionError a) {
			assertEquals(a.getMessage(), "Violation of precondition");
		}
	}
	
	@Test 
	public void testDie4() {
		try{
			new Die(4, 8);
		} catch (AssertionError a) {
			assertEquals(a.getMessage(), "Violation of precondition");
		}
	}
	
	@Test
	public void testDie6() {
		try{
			new Die(-9);
		} catch (AssertionError a) {
			assertEquals(a.getMessage(), "Violation of precondition: numSides = -9numSides must be greater than 1");
		}
	}
}
