package test;

import org.testng.annotations.Test;

import page.Signin;

public class Signintest extends Baseclass{
	@Test
	public void test()
	{
		Signin ob=new Signin(driver);
		//ob.clickaccount();
		
		ob.clicksignin();
		ob.enteremail("abcd@gmail.com");
		ob.continuesignin();
		ob.password("1234988uio");
		
		
		
	}

}
