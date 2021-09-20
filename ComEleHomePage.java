package comPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import comBase.ComElementBaseClass;

public class ComEleHomePage extends ComElementBaseClass {
	
	
	public ComEleHomePage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public ComEleHomePage verifyHomePage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
	}


//Logout
	/*public ComEleLoginPages clickLogoutButton() {
		driver.findElement(By.className("decorativeSubmit")).click();

		return new ComEleLoginPages(driver);
	}*/

	
	public MyHomePage clickCrmSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();

		return new MyHomePage(driver);

	}}
