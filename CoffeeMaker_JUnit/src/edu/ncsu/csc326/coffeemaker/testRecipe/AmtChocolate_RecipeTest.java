package edu.ncsu.csc326.coffeemaker.testRecipe;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.Recipe;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class AmtChocolate_RecipeTest {

	@Test
	public void testGetAmtChocolate() {
		int expected = 0;
		int actual = -1;

		Recipe objRecipe = new Recipe();
		actual = objRecipe.getAmtChocolate();

		assertTrue(expected == actual);		
		}

	@Test
	public void testSetAmtChocolatePositive() throws NumberFormatException, RecipeException {
		int expected = 1;
		int actual = 0;
		String chocolate = "1";

		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(chocolate);
		actual = objRecipe.getAmtChocolate();

		assertTrue(expected == actual);
	}

	@Test
	public void testSetAmtChocolateZero() throws NumberFormatException, RecipeException   {
		int expected = 0;
		int actual = -1;
		String chocolate = "0";

		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(chocolate);
		actual = objRecipe.getAmtChocolate();

		assertTrue(expected == actual);
	}
	
	@Test (expected = RecipeException.class)
	public void testSetAmtChocolateNegaitive() throws NumberFormatException, RecipeException   {
		int expected = 0;
		int actual = 0;
		String chocolate = "-1";


		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(chocolate);
		actual = objRecipe.getAmtChocolate();

		assertTrue(expected == actual);
	}
	
	@Test (expected = NumberFormatException.class)
	public void testSetAmtChocolateChar() throws NumberFormatException, RecipeException {
		int expected = 0;
		int actual = 0;
		String chocolate = "c";

		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(chocolate);
		actual = objRecipe.getAmtChocolate();

		assertTrue(expected == actual);
	}


	@Test (expected = NumberFormatException.class)
	public void testSetAmtChocolateChar2() throws NumberFormatException, RecipeException   {
		int expected = 0;
		int actual = 0;
		String chocolate = "#";

		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(chocolate);
		actual = objRecipe.getAmtChocolate();

		assertTrue(expected == actual);
	}
	
	@Test (expected = NumberFormatException.class)
	public void testSetAmtChocolateDouble() throws NumberFormatException, RecipeException   {
		int expected = 1;
		int actual = 0;
		String chocolate = "1.5";

		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(chocolate);
		actual = objRecipe.getAmtChocolate();

		assertTrue(expected == actual);
	}

}
