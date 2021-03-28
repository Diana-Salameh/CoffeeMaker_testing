package edu.ncsu.csc326.coffeemaker.testRecipe;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.Recipe;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class AmtSugar_RecipeTest {

	@Test
	public void testGetAmtSugar() {
		int expected = 0;
		int actual = -1;

		Recipe objRecipe = new Recipe();
		actual = objRecipe.getAmtSugar();

		assertTrue(expected == actual);	
	}
	
	@Test
	public void testSetAmtSugarPositive() throws NumberFormatException, RecipeException {
		int expected = 1;
		int actual = 0;
		String sugar = "1";

		Recipe objRecipe = new Recipe();
		objRecipe.setAmtSugar(sugar);
		actual = objRecipe.getAmtSugar();

		assertTrue(expected == actual);
	}

	@Test
	public void testSetAmtSugarZero() throws NumberFormatException, RecipeException   {
		int expected = 0;
		int actual = -1;
		String sugar = "0";

		Recipe objRecipe = new Recipe();
		objRecipe.setAmtSugar(sugar);
		actual = objRecipe.getAmtSugar();

		assertTrue(expected == actual);
	}
	
	@Test (expected = RecipeException.class)
	public void testSetAmtSugarNegaitive() throws NumberFormatException, RecipeException   {
		int expected = 0;
		int actual = 0;
		String sugar = "-1";


		Recipe objRecipe = new Recipe();
		objRecipe.setAmtSugar(sugar);
		actual = objRecipe.getAmtSugar();

		assertTrue(expected == actual);
	}
	
	@Test (expected = NumberFormatException.class)
	public void testSetAmtSugarChar() throws NumberFormatException, RecipeException {
		int expected = 0;
		int actual = 0;
		String sugar = "c";

		Recipe objRecipe = new Recipe();
		objRecipe.setAmtSugar(sugar);
		actual = objRecipe.getAmtSugar();

		assertTrue(expected == actual);
	}


	@Test (expected = NumberFormatException.class)
	public void testSetAmtSugarChar2() throws NumberFormatException, RecipeException   {
		int expected = 0;
		int actual = 0;
		String sugar = "#";

		Recipe objRecipe = new Recipe();
		objRecipe.setAmtSugar(sugar);
		actual = objRecipe.getAmtSugar();

		assertTrue(expected == actual);
	}
	
	@Test (expected = NumberFormatException.class)
	public void testSetAmtSugarDouble() throws NumberFormatException, RecipeException   {
		int expected = 1;
		int actual = 0;
		String sugar = "1.5";

		Recipe objRecipe = new Recipe();
		objRecipe.setAmtSugar(sugar);
		actual = objRecipe.getAmtSugar();

		assertTrue(expected == actual);
	}

}
