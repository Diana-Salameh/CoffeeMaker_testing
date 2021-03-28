package edu.ncsu.csc326.coffeemaker.testRecipe;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.Recipe;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class AmtCoffee_RecipeTest {

	@Test
	public void testGetAmtCoffee() {
		int expected = 0;
		int actual = -1;

		Recipe objRecipe = new Recipe();
		actual = objRecipe.getAmtCoffee();

		assertTrue(expected == actual);		}

	@Test
	public void testSetAmtCoffeePositive() throws NumberFormatException, RecipeException {
		int expected = 1;
		int actual = 0;
		String coffee = "1";

		Recipe objRecipe = new Recipe();
		objRecipe.setAmtCoffee(coffee);

		actual = objRecipe.getAmtCoffee();

		assertTrue(expected == actual);
	}

	@Test
	public void ttestSetAmtCoffeeZero() throws NumberFormatException, RecipeException   {
		int expected = 0;
		int actual = -1;
		String coffee = "0";

		Recipe objRecipe = new Recipe();
		objRecipe.setAmtCoffee(coffee);

		actual = objRecipe.getAmtCoffee();

		assertTrue(expected == actual);
	}
	
	@Test (expected = RecipeException.class)
	public void testSetAmtCoffeeNegaitive() throws NumberFormatException, RecipeException   {
		int expected = 0;
		int actual = 0;
		String coffee = "-1";


		Recipe objRecipe = new Recipe();
		objRecipe.setAmtCoffee(coffee);
		

		actual = objRecipe.getAmtCoffee();
		System.out.println(actual);

		assertTrue(expected == actual);
	}
	
	@Test (expected = NumberFormatException.class)
	public void testSetAmtCoffeeChar() throws NumberFormatException, RecipeException {
		int expected = 0;
		int actual = 0;
		String coffee = "c";

		Recipe objRecipe = new Recipe();
		objRecipe.setAmtCoffee(coffee);
		actual = objRecipe.getAmtCoffee();
		System.out.println(actual);

		assertTrue(expected == actual);
	}


	@Test (expected = NumberFormatException.class)
	public void testSetAmtCoffeeChar2() throws NumberFormatException, RecipeException   {
		int expected = 0;
		int actual = 0;
		String coffee = "#";

		Recipe objRecipe = new Recipe();
		objRecipe.setAmtCoffee(coffee);
		actual = objRecipe.getAmtCoffee();
		System.out.println(actual);

		assertTrue(expected == actual);
	}
	
	@Test (expected = NumberFormatException.class)
	public void ttestSetAmtCoffeeDouble() throws NumberFormatException, RecipeException   {
		int expected = 1;
		int actual = 0;
		String coffee = "1.5";

		Recipe objRecipe = new Recipe();
		objRecipe.setAmtCoffee(coffee);
		actual = objRecipe.getAmtCoffee();
		System.out.println(actual);

		assertTrue(expected == actual);
	}


}
