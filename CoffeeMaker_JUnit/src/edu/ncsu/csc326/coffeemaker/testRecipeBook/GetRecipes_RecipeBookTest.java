package edu.ncsu.csc326.coffeemaker.testRecipeBook;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.Recipe;
import edu.ncsu.csc326.coffeemaker.RecipeBook;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class GetRecipes_RecipeBookTest {

	@Test(expected = NullPointerException.class)
	public void testGetRecipes() throws RecipeException {
		Recipe expected = new Recipe();
		Recipe objRecipe = new Recipe();
		Recipe actual [] ;

		RecipeBook objRecipeBook = new RecipeBook();
		objRecipeBook.addRecipe(objRecipe);
		actual = objRecipeBook.getRecipes();
		assertEquals(expected, actual);

	}

}
