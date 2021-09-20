package comPages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import comBase.ComElementBaseClass;

public class ComEleLoginPages extends ComElementBaseClass {
	

	public ComEleLoginPages(ChromeDriver driver) {
		this.driver = driver;
	}
	
	// action+elementName
	public ComEleLoginPages enterUsername(String username) throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(5000);
		return this;
	}

	public ComEleLoginPages enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}

	public ComEleHomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
			
		return new ComEleHomePage(driver);

	}
	}
	

