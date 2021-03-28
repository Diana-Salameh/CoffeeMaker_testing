package edu.ncsu.csc326.coffeemaker.testRecipe;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.Recipe;

public class ToString_RecipeTest {

	@Test
	public void testToString() {

		Recipe objRecipe = new Recipe();
		String name = "";
		int price = 0;
		int amtCoffee = 0;
		int amtMilk = 0;
		int amtSugar = 0;
		int amtChocolate = 0;
		StringBuffer expected = new StringBuffer();
		expected.append("Name: ");
		expected.append(name);
		expected.append("\n");
		expected.append("Coffee: ");
		expected.append(amtCoffee);
		expected.append("\n");
		expected.append("Milk: ");
		expected.append(amtMilk);
		expected.append("\n");
		expected.append("Sugar: ");
		expected.append(amtSugar);
		expected.append("\n");
		expected.append("Chocolate: ");
		expected.append(amtChocolate);
		expected.append("\n");
		expected.append("Price: ");
		expected.append(price);
		expected.append("\n");
		String expectedStr = expected.toString();
		assertEquals(expectedStr, objRecipe.toString());

	}

}
