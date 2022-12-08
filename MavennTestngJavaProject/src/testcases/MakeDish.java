package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class MakeDish {

	@Test(priority=1)
	public void selectRecipe()
	{
		System.out.println("selectRecipe");
	}
	
	@Test(priority=2,dependsOnMethods="selectRecipe")
	public void prepIngredients()
	{
		System.out.println("prepIngredients");
	}
	
	@Test(priority=3,dependsOnMethods={"selectRecipe","prepIngredients"},expectedExceptions=SkipException.class,enabled=false)
	public void setTime()
	{
		System.out.println("setTime");
		throw new SkipException("did this occur?");
	}
	
	@Test(priority=4)
	public void setTemp()
	{
		System.out.println("setTemp");
	}
	
}
