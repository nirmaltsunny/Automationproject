package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registeraccount {
	WebDriver driver;
	By register =By.xpath("//*[@id=\"gh-ug-flex\"]/a");



	public Registeraccount(WebDriver driver)
	{
		this.driver=driver;
	}

	public void registeraccnt()
	{
		driver.findElement(register).click();
	}
}
