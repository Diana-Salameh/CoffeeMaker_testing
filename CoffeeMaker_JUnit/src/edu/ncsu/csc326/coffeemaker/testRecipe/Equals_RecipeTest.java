package edu.ncsu.csc326.coffeemaker.testRecipe;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.Recipe;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class Equals_RecipeTest {

	@Test
	public void testEqualsObject(){
	
		boolean expected = true;
		boolean actual;
		boolean actualName;
		Recipe objRecipe1 = new Recipe();
		Recipe objRecipe2 = new Recipe();
		String name = objRecipe1 .getName();
		actual = objRecipe1.equals(objRecipe2);
		actualName = objRecipe2.getName().equals(name);
		
		assertNotNull(objRecipe1);
		assertNotNull(objRecipe2);
		assertTrue(expected == actual && expected == actualName);	

	}
	
	@Test(expected = NullPointerException.class)
	public void testEqualsObjectNull(){

		boolean expected = false;
		boolean actual;
		Recipe objRecipe1 = new Recipe();
		Recipe objRecipe2 = null;

		actual = objRecipe1.equals(objRecipe2);
		
		assertNotNull(objRecipe1);
		assertNull(objRecipe2);
		assertTrue(expected == actual);	

	}

	@Test(expected = NullPointerException.class)
	public void testEqualsObjectNullName() throws RecipeException{

		boolean expected = true;
		boolean actual;
		Recipe objRecipe1 = new Recipe();
		Recipe objRecipe2 = new Recipe();
		boolean expectedName = false;
		boolean actualName;
		String name = objRecipe1.getName();
		objRecipe2.setName(null);

		actual = objRecipe1.equals(objRecipe2);
		actualName = objRecipe1.getName().equals(name);

		
		assertNotNull(objRecipe1);
		assertNotNull(objRecipe2);

		assertTrue(expected == actual );	
		assertTrue(expectedName == actualName);

	}
}
