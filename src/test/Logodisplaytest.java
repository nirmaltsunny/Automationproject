package test;

import org.testng.annotations.Test;

import page.Logodisplay;

public class Logodisplaytest extends Baseclass {
	@Test
	public void method()
	{
	Logodisplay ldy=new Logodisplay(driver);
	ldy.logodisplays();
	}

}

