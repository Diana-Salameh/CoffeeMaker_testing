package edu.ncsu.csc326.coffeemaker.testRecipe;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.Recipe;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class Name_RecipeTest {

	@Test
	public void testGetName() {
		String expected = "";
		String actual = "";

		Recipe objRecipe = new Recipe();
		actual = objRecipe.getName();

		assertTrue(expected == actual);			}

	@Test(expected = NullPointerException.class)
	public void testSetNameNull() throws NumberFormatException, RecipeException {
		 String name = null;	
//		 String actual = null;
		 
		 Recipe objRecipe = new Recipe();
		 objRecipe.setName(name);
		 assertFalse(objRecipe.getName().equals(null));
	}
	
	@Test(expected = RecipeException.class)
	public void testSetNameNumber() throws NumberFormatException, RecipeException{
		 String expected = "";	
		 String actual = "";
		 String name = "55.5";
		 
		 Recipe objRecipe = new Recipe();
		 objRecipe.setName(name);
		 actual = objRecipe.getName();
		 assertTrue(expected.equals(actual));
	}

	@Test(expected = NumberFormatException.class)
	public void testSetNameSingleChar() throws NumberFormatException, RecipeException{
		 String expected = "";	
		 String actual = "";
		 String name = "x";
		 
		 Recipe objRecipe = new Recipe();
		 objRecipe.setName(name);
		 actual = objRecipe.getName();
		 assertTrue(expected.equals(actual));
	}

}
