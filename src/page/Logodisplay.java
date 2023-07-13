package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logodisplay {
	WebDriver driver;
	By logodisplay =By.xpath("//*[@id=\"gh-logo\"]");



	public Logodisplay(WebDriver driver)
	{
		this.driver=driver;
	}

	public void logodisplays()
	{
		boolean logo=driver.findElement(logodisplay).isDisplayed();
    	if(logo)
    	{
    		System.out.println("logo is present");
    	}
    	else
    	{
    		System.out.println("logo is not present");
    	}
}
}
