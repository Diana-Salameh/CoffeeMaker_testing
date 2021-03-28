package edu.ncsu.csc326.coffeemaker.testRecipeBook;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.Recipe;
import edu.ncsu.csc326.coffeemaker.RecipeBook;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class DeleteRecipe_RecipeBookTest {

	@Test
	public void testDeleteRecipe() throws RecipeException {

		String expected = "coffee";
		String actual;
		Recipe objRecipe = new Recipe();
		objRecipe.setName("coffee");
		RecipeBook objRecipeBook = new RecipeBook();
		
		objRecipeBook.addRecipe(objRecipe);
		
		actual = objRecipeBook.deleteRecipe(0);
		
		assertTrue(expected .equals(actual));
	}

	@Test(expected = NullPointerException.class)
	public void testDeleteRecipeNull() throws RecipeException {

		Recipe objRecipe = null;
		
		RecipeBook objRecipeBook = new RecipeBook();
		
		objRecipeBook.addRecipe(objRecipe);
		
		assertNull(objRecipeBook.deleteRecipe(0));
	}
	
	@Test(expected = RecipeException.class)
	public void testDeleteRecipeNotExisted() throws RecipeException {


		String expected = "";
		String actual;
		Recipe objRecipe = new Recipe();
		
		RecipeBook objRecipeBook = new RecipeBook();
		
		objRecipeBook.addRecipe(objRecipe);
		
		actual = objRecipeBook.deleteRecipe(0);
		
		assertTrue(expected .equals(actual));
	}

}
