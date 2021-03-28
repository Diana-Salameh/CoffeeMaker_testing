package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class RecipeBook {
	
	/** Array of recipes in coffee maker*/
	private Recipe [] recipeArray;
	/** Number of recipes in coffee maker */
//	private final int NUM_RECIPES = 4; 
	
	/*
	 * if number of recipes set as final; 
	 * then the program will crash after adding 4 recipes continuously
	 */
	
	private int NUM_RECIPES = 4; 

	
	/**
	 * Default constructor for a RecipeBook.
	 */
	public RecipeBook() {
		recipeArray = new Recipe[NUM_RECIPES];
	}
	
	/**
	 * Returns the recipe array.
	 * @param r
	 * @return Recipe[]
	 */
	public synchronized Recipe[] getRecipes() {
		return recipeArray;
	}
	
	public synchronized boolean addRecipe(Recipe r) throws RecipeException {
		//Assume recipe doesn't exist in the array until 
		//find out otherwise
		boolean exists = false;
		//Check that recipe doesn't already exist in array
		

		for (int i = 0; i < recipeArray.length; i++ ) {
			if (r.equals(recipeArray[i])) {
				exists = true;
			}
		}
		//Assume recipe cannot be added until find an empty
		//spot
		boolean added = false;
		//Check for first empty spot in array
		
		
		/*
		 * Addition
		 * 1. check if the array is full
		 * 2. print "This recipe is already existed" if it is existed 
		 */
		
//		if (recipeArray == null) {  // never occurs
//			recipeArray = new Recipe[NUM_RECIPES];
//			recipeArray[0] = r;
//			added = true;
//			
//		} else if(NUM_RECIPES == recipeArray.length) {
//			Recipe newRecipeArray [] = new Recipe [NUM_RECIPES +4];
//			for (int i = 0; i < NUM_RECIPES; i++) {
//				newRecipeArray[i] = recipeArray[i];
//			}
//		    recipeArray = newRecipeArray;
//			recipeArray[NUM_RECIPES] = r;
//			added = true;
//			NUM_RECIPES ++;
//		} else {
			if (!exists) {
				for (int i = 0; i < recipeArray.length && !added; i++) {
					if (recipeArray[i] == null) {
						recipeArray[i] = r;
						added = true;
					}
				}
			} else {
				throw new RecipeException("This recipe is already existed!");
			}
		//}
		return added;
	}

	/**
	 * Returns the name of the recipe deleted at the position specified
	 * and null if the recipe does not exist.
	 * @param recipeToDelete
	 * @return String
	 */
	public synchronized String deleteRecipe(int recipeToDelete) {
		if (recipeArray[recipeToDelete] != null) {  
			String recipeName = recipeArray[recipeToDelete].getName();
			recipeArray[recipeToDelete] = new Recipe();
			return recipeName;
		} else {
			return null;
		}
	}
	
	/**
	 * Returns the name of the recipe edited at the position specified
	 * and null if the recipe does not exist.
	 * @param recipeToEdit
	 * @param newRecipe
	 * @return String
	 * @throws RecipeException 
	 * @throws NumberFormatException 
	 */
	public synchronized String editRecipe(int recipeToEdit, Recipe newRecipe) throws RecipeException {
		if (recipeArray[recipeToEdit] != null) {
			String recipeName = recipeArray[recipeToEdit].getName();
			/*
			 * the recipe name should be set as:
			 * set(resipeName)
			 */
			//newRecipe.setName("");  
			newRecipe.setName(recipeName);
			recipeArray[recipeToEdit] = newRecipe;
			return recipeName;
		} else {
			return null;
		}
	}

}
