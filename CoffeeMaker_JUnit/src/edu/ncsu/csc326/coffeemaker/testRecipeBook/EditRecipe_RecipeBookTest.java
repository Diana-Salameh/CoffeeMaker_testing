package edu.ncsu.csc326.coffeemaker.testRecipeBook;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.Recipe;
import edu.ncsu.csc326.coffeemaker.RecipeBook;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class EditRecipe_RecipeBookTest {

	@Test
	public void testEditRecipe() throws RecipeException {
		
		String expected = "coffee";
		String actual;

		RecipeBook objRecipeBook = new RecipeBook();
		Recipe objRecipe = new Recipe();	
		objRecipe.setName("coffee");
		objRecipeBook.addRecipe(objRecipe);

		Recipe objRecipeToEdit = new Recipe();
		
		actual = objRecipeBook.editRecipe(0,objRecipeToEdit);
		
		assertTrue(expected == actual);
	}

	@Test(expected = NullPointerException.class)
	public void testEditRecipeNull() throws RecipeException {
		
		String expected = null;
		String actual;

		RecipeBook objRecipeBook = new RecipeBook();
		Recipe objRecipe = null;	
		objRecipeBook.addRecipe(objRecipe);

		Recipe objRecipeToEdit = new Recipe();
		
		actual = objRecipeBook.editRecipe(0,objRecipeToEdit);
		
		assertTrue(expected == actual);
	}
	@Test(expected = RecipeException.class)
	public void testEditRecipeNotExisted() throws RecipeException {
		
		String expected = null;
		String actual;

		RecipeBook objRecipeBook = new RecipeBook();
		Recipe objRecipe = null;	
		objRecipeBook.addRecipe(objRecipe);

		Recipe objRecipeToEdit = new Recipe();
		
		actual = objRecipeBook.editRecipe(0,objRecipeToEdit);
		
		assertTrue(expected == actual);
	}
}
