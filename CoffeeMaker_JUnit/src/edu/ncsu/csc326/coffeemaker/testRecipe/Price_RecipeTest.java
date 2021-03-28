package edu.ncsu.csc326.coffeemaker.testRecipe;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.Recipe;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class Price_RecipeTest {

	@Test
	public void testGetPrice() {
		int expected = 0;
		int actual = -1;

		Recipe objRecipe = new Recipe();
		actual = objRecipe.getPrice();

		assertTrue(expected == actual);			}

	
	@Test
	public void testSetPricePositive() throws NumberFormatException, RecipeException {
		int expected = 1;
		int actual = 0;
		String price = "1";

		Recipe objRecipe = new Recipe();
		objRecipe.setPrice(price);
		actual = objRecipe.getPrice();

		assertTrue(expected == actual);
	}

	@Test
	public void testSetPriceZero() throws NumberFormatException, RecipeException   {
		int expected = 0;
		int actual = -1;
		String price = "0";

		Recipe objRecipe = new Recipe();
		objRecipe.setPrice(price);
		actual = objRecipe.getPrice();

		assertTrue(expected == actual);
	}
	
	@Test (expected = RecipeException.class)
	public void ttestSetPriceNegaitive() throws NumberFormatException, RecipeException   {
		int expected = 0;
		int actual = 0;
		String price = "-1";


		Recipe objRecipe = new Recipe();
		objRecipe.setPrice(price);
		actual = objRecipe.getPrice();

		assertTrue(expected == actual);
	}
	
	@Test (expected = NumberFormatException.class)
	public void testSetPriceChar() throws NumberFormatException, RecipeException {
		int expected = 0;
		int actual = 0;
		String price = "c";

		Recipe objRecipe = new Recipe();
		objRecipe.setPrice(price);
		actual = objRecipe.getPrice();

		assertTrue(expected == actual);
	}


	@Test (expected = NumberFormatException.class)
	public void testSetPriceChar2() throws NumberFormatException, RecipeException   {
		int expected = 0;
		int actual = 0;
		String price = "#";

		Recipe objRecipe = new Recipe();
		objRecipe.setPrice(price);
		actual = objRecipe.getPrice();

		assertTrue(expected == actual);
	}
	
	@Test (expected = NumberFormatException.class)
	public void testSetPriceDouble() throws NumberFormatException, RecipeException   {
		int expected = 1;
		int actual = 0;
		String price = "1.5";

		Recipe objRecipe = new Recipe();
		objRecipe.setPrice(price);
		actual = objRecipe.getPrice();

		assertTrue(expected == actual);
	}


}
