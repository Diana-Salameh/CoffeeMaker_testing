package edu.ncsu.csc326.coffeemaker.testRecipe;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.Recipe;

public class Recipe_RecipeTest {

	@Test
	public void testRecipe() {
		String name = "";
		int price = 0;
		int amtCoffee = 0;
		int amtMilk = 0;
		int amtSugar = 0;
		int amtChocolate = 0;

		Recipe objRecipe = new Recipe();
		assertEquals(name, objRecipe.getName());
		assertEquals(price, objRecipe.getPrice());
		assertEquals(amtChocolate, objRecipe.getAmtChocolate());
		assertEquals(amtCoffee, objRecipe.getAmtCoffee());
		assertEquals(amtSugar, objRecipe.getAmtSugar());
		assertEquals(amtMilk, objRecipe.getAmtMilk());

		//		 name = "coffee";
		//		 price = 50;
		//		 amtCoffee = 3;
		//		 amtMilk = 0;
		//		 amtSugar = 1;
		//		 amtChocolate = 0;

	}

}
