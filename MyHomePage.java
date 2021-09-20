package comPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import comBase.ComElementBaseClass;

public class MyHomePage extends ComElementBaseClass {
	
	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
		
	}
	
	public ComEleLeadPage clickLeadsLink() {
		driver.findElement(By.linkText("Leads")).click();

		return new ComEleLeadPage(driver);

	}
	
	
	}
