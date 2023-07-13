package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signin {
	WebDriver driver;
	By Signinlink =By.xpath("//*[@id=\"gh-ug\"]/a");
	By emailid =By.xpath("//*[@id=\"userid\"]");
	By passwd=By.xpath("//*[@id=\"pass\"]");
	By continuebutton= By.xpath("//*[@id=\"signin-continue-btn\"]");
	
	public Signin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void clicksignin()
	{
		driver.findElement(Signinlink).click();
	}
	public void enteremail(String mailid) 
	{
		driver.findElement(emailid).sendKeys(mailid);
	}
	public void continuesignin()
	{
		driver.findElement(continuebutton).click();
		
	}
	public void password(String password)
	{
		driver.findElement(passwd).sendKeys(password);
	}
}
