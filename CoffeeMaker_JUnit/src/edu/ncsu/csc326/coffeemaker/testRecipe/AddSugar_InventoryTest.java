//package edu.ncsu.csc326.coffeemaker.testRecipe;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//
//import edu.najah.csp.coffeemaker.Inventory;
//import edu.najah.csp.coffeemaker.exceptions.InventoryException;
//
//public class AddSugar_InventoryTest {
//
//	@Test (expected = InventoryException.class)
//	public void testAddSugar() throws InventoryException ,NumberFormatException{
//		int expected = 16;
//		int actual = 0;
//		String newUnit = "1.5";
//
//		Inventory obj = new Inventory();
//		obj.addSugar(newUnit);
//		actual = obj.getSugar();
//		System.out.println(actual);
//		assertTrue(expected == actual);
//	}
//
//}
