package test;

import java.awt.AWTException;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import page.Registeraccount;

public class Registeraccounttest extends Baseclass{

	
	
	@Test
	public void test() throws Exception
	{
		Registeraccount ra=new Registeraccount(driver);
		ra.registeraccnt();
		FileInputStream f=new FileInputStream("C:\\Users\\Nirmal\\Desktop\\Newebay.xls");
		HSSFWorkbook wrb=new HSSFWorkbook(f);
		HSSFSheet sh= wrb.getSheet("Sheet1");
		int row=sh.getLastRowNum();
		for(int i=1;i<=row;i++)
		{
			String firstname =sh.getRow(i).getCell(0).getStringCellValue();
			String lastname =sh.getRow(i).getCell(1).getStringCellValue();
			String email =sh.getRow(i).getCell(2).getStringCellValue();
			String password = sh.getRow(i).getCell(3).getStringCellValue();
			System.out.println("username="+firstname+"\n"+"lastname="+lastname+"\n"+"email="+email+"\n"+"password="+password);
			driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(firstname);
			driver.findElement(By.xpath("//*[@id='firstname']")).clear();
			driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(lastname);
			driver.findElement(By.xpath("//*[@id='lastname']")).clear();
			driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(email);
			driver.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
			
		}

	
}
}
