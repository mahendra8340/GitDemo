package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	@Before("@netBanking")
	public void netBankingSetup()
	{
		System.out.println("******************");
		System.out.println("NetBanking initial setup");
		
	}

	
	@Before("@mobileBanking")
	public void mobileBankingSetup()
	{
		System.out.println("******************");
		System.out.println("Mobile Banking initial setup");
		
	}
	
	
	@After
	public void tearDown()
	{
		System.out.println("Before closing");
		System.out.println("******************");
		
		
	}
}
