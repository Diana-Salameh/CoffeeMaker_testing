package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

/**
 * @author   Sarah Heckman
 */
public class Recipe {
	private String name;
	private int price;
	private int amtCoffee;
	private int amtMilk;
	private int amtSugar;
	private int amtChocolate;

	/**
	 * Creates a default recipe for the coffee maker.
	 */
	public Recipe() {
		this.name = "";
		this.price = 0;
		this.amtCoffee = 0;
		this.amtMilk = 0;
		this.amtSugar = 0;
		this.amtChocolate = 0;
	}

	/**
	 * @return   Returns the amtChocolate.
	 */
	public int getAmtChocolate() {
		return amtChocolate;
	}
	/**
	 * @param amtChocolate   The amtChocolate to set.
	 */
	public void setAmtChocolate(String chocolate) throws RecipeException,NumberFormatException {
		int amtChocolate = 0;
		try {
			amtChocolate = Integer.parseInt(chocolate);
		} catch (NumberFormatException e) {
			/*
			 *  throwing incompatible exception :
			 *  throw new RecipeException("Units of sugar must be a positive integer");
			 *  
			 *  the correctness:
			 */
			throw new NumberFormatException("Error in parsing the sugar value to integer");
		}
		if (amtChocolate >= 0) {
			this.amtChocolate = amtChocolate;
		} else {
			throw new RecipeException("Units of chocolate must be a positive integer");
		}
	}
	/**
	 * @return   Returns the amtCoffee.
	 */
	public int getAmtCoffee() {
		return amtCoffee;
	}
	/**
	 * @param amtCoffee   The amtCoffee to set.
	 */
	public void setAmtCoffee(String coffee) throws RecipeException ,NumberFormatException{
		int amtCoffee = 0;
		try {
			amtCoffee = Integer.parseInt(coffee);
		} catch (NumberFormatException e) {
			/*
			 *  throwing incompatible exception :
			 *  throw new RecipeException("Units of sugar must be a positive integer");
			 *  
			 *  the correctness:
			 */
			throw new NumberFormatException("Error in parsing the sugar value to integer");
		}
		if (amtCoffee >= 0) {
			this.amtCoffee = amtCoffee;
		} else {
			throw new RecipeException("Units of coffee must be a positive integer");
		}
	}
	/**
	 * @return   Returns the amtMilk.
	 */
	public int getAmtMilk() {
		return amtMilk;
	}
	/**
	 * @param amtMilk   The amtMilk to set.
	 */
	public void setAmtMilk(String milk) throws RecipeException , NumberFormatException{
		int amtMilk = 0;
		try {
			amtMilk = Integer.parseInt(milk);
		} catch (NumberFormatException e) {

			/*
			 *  throwing incompatible exception :
			 *  throw new RecipeException("Units of sugar must be a positive integer");
			 *  
			 *  the correctness:
			 */
			throw new NumberFormatException("Error in parsing the sugar value to integer");
		}
		if (amtMilk >= 0) {
			this.amtMilk = amtMilk;
		} else {
			throw new RecipeException("Units of milk must be a positive integer");
		}
	}
	/**
	 * @return   Returns the amtSugar.
	 */
	public int getAmtSugar() {
		return amtSugar;
	}
	/**
	 * @param amtSugar   The amtSugar to set.
	 * @throws RecipeException 
	 */
	public void setAmtSugar(String sugar) throws RecipeException , NumberFormatException{
		int amtSugar = 0;
		try {
			amtSugar = Integer.parseInt(sugar);
		} catch (NumberFormatException e) {

			/*
			 *  throwing incompatible exception :
			 *  throw new RecipeException("Units of sugar must be a positive integer");
			 *  
			 *  the correctness:
			 */

			throw new NumberFormatException("Error in parsing the sugar value to integer");

		}
		if (amtSugar >= 0) {
			this.amtSugar = amtSugar;
		} else {
			throw new RecipeException("Units of sugar must be a positive integer");
		}
	}
	/**
	 * @return   Returns the name.
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name   The name to set.
	 * @throws RecipeException 
	 */
	public void setName(String name) throws RecipeException {
		if(name != null ) {
			this.name = name;
		} else {

		/*
		 * Addition:
		 * the name of the recipe should not be a number 
		 */

		double d;

		try {
			d = Double.parseDouble(name);
		} catch (NumberFormatException e) {
			throw new NumberFormatException("Error in parsing the name value to Double");
		}
		if(d >=0 || d<0 ) {
			throw new RecipeException("The name of the recipe must be a real string");
		}
		}
	}
	/**
	 * @return   Returns the price.
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price   The price to set.
	 */
	public void setPrice(String price) throws RecipeException , NumberFormatException{
		int amtPrice = 0;
		try {
			/*
			 **In reality, the price could has fractions; 
			 * but as for the machine it may could not 
			 * and the price would be in unified coin type.
			 */

			amtPrice = Integer.parseInt(price);  
		} catch (NumberFormatException e) {
			/*
			 *  throwing incompatible exception :
			 *  throw new RecipeException("Units of sugar must be a positive integer");
			 *  
			 *  the correctness:
			 */
			throw new NumberFormatException("Error in parsing the sugar value to integer");
		}
		if (amtPrice >= 0) {
			this.price = amtPrice;
		} else {
			throw new RecipeException("Price must be a positive integer");
		}
	} 

	/**
	 * Returns the name of the recipe.
	 * @return String
	 */
	public String toString() {
//		return name;
		StringBuffer buf = new StringBuffer();
		buf.append("Name: ");
    	buf.append(getName());
    	buf.append("\n");
    	buf.append("Coffee: ");
    	buf.append(getAmtCoffee());
    	buf.append("\n");
    	buf.append("Milk: ");
    	buf.append(getAmtMilk());
    	buf.append("\n");
    	buf.append("Sugar: ");
    	buf.append(getAmtSugar());
    	buf.append("\n");
    	buf.append("Chocolate: ");
    	buf.append(getAmtChocolate());
    	buf.append("\n");
    	buf.append("Price: ");
    	buf.append(getPrice());
    	buf.append("\n");
    	return buf.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null) 
//			return false; 
			throw new NullPointerException("Null pointer exception");
		
		if (getClass() != obj.getClass())
			return false;
		final Recipe other = (Recipe) obj;
		if (name == null) {
//			if (other.name != null)
//				return false;
			throw new NullPointerException("Null pointer exception");

		} 
		else if (!name.equals(other.name))
			return false;
		return true;
	}

}
