package edu.ncsu.csc326.coffeemaker.testRecipeBook;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.Recipe;
import edu.ncsu.csc326.coffeemaker.RecipeBook;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class AddRecipe_RecipeBookTest {

	private Recipe expected[];

	@Test
	public void testAddRecipe() throws RecipeException {
		Recipe objRecipe = new Recipe();
		boolean expected = true;
		boolean actual = false;
		
		RecipeBook objRecipeBook = new RecipeBook();
		actual = objRecipeBook.addRecipe(objRecipe);
		
		assertTrue(expected == actual);

		
	}

	
	@Test(expected = NullPointerException.class)
	public void testAddRecipeNull() throws RecipeException {
		expected = null;
		Recipe actual[] = null;
		
		RecipeBook objRecipeBook = new RecipeBook();
		
		objRecipeBook.addRecipe(null);
		actual = objRecipeBook.getRecipes();
		
		assertTrue(expected.equals(actual));

	}
	
	@Test(expected = RecipeException.class)	
	public void testAddRecipeExisted() throws RecipeException {
		Recipe objRecipe1 = new Recipe();
		Recipe objRecipe2 = new Recipe();

		boolean expected = false;
		boolean actual = false;
		
		RecipeBook objRecipeBook = new RecipeBook();
		objRecipeBook.addRecipe(objRecipe1);
		actual = objRecipeBook.addRecipe(objRecipe2);
		
		assertTrue(expected == actual);

		
	}
}
