package edu.ncsu.csc326.coffeemaker.testRecipe;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.Recipe;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class AmtMilk_RecipeTest {

	@Test
	public void testGetAmtMilk() {
		int expected = 0;
		int actual = -1;

		Recipe objRecipe = new Recipe();
		actual = objRecipe.getAmtMilk();

		assertTrue(expected == actual);			
		}


	@Test
	public void testSetAmtMilkPositive() throws NumberFormatException, RecipeException {
		int expected = 1;
		int actual = 0;
		String milk = "1";

		Recipe objRecipe = new Recipe();
		objRecipe.setAmtMilk(milk);
		actual = objRecipe.getAmtMilk();

		assertTrue(expected == actual);
	}

	@Test
	public void ttestSetAmtMilkZero() throws NumberFormatException, RecipeException   {
		int expected = 0;
		int actual = -1;
		String milk = "0";

		Recipe objRecipe = new Recipe();
		objRecipe.setAmtMilk(milk);
		actual = objRecipe.getAmtMilk();

		assertTrue(expected == actual);
	}
	
	@Test (expected = RecipeException.class)
	public void testSetAmtMilkNegaitive() throws NumberFormatException, RecipeException   {
		int expected = 0;
		int actual = 0;
		String milk = "-1";


		Recipe objRecipe = new Recipe();
		objRecipe.setAmtMilk(milk);		
		actual = objRecipe.getAmtMilk();
		
		assertTrue(expected == actual);
	}
	
	@Test (expected = NumberFormatException.class)
	public void testSetAmtMilkChar() throws NumberFormatException, RecipeException {
		int expected = 0;
		int actual = 0;
		String milk = "c";

		Recipe objRecipe = new Recipe();
		objRecipe.setAmtMilk(milk);
		actual = objRecipe.getAmtMilk();

		assertTrue(expected == actual);
	}


	@Test (expected = NumberFormatException.class)
	public void ttestSetAmtMilkChar2() throws NumberFormatException, RecipeException   {
		int expected = 0;
		int actual = 0;
		String milk = "#";

		Recipe objRecipe = new Recipe();
		objRecipe.setAmtMilk(milk);
		actual = objRecipe.getAmtMilk();

		assertTrue(expected == actual);
	}
	
	@Test (expected = NumberFormatException.class)
	public void testSetAmtMilkDouble() throws NumberFormatException, RecipeException   {
		int expected = 1;
		int actual = 0;
		String milk = "1.5";

		Recipe objRecipe = new Recipe();
		objRecipe.setAmtMilk(milk);
		actual = objRecipe.getAmtMilk();

		assertTrue(expected == actual);
	}

}
