package comTestCases;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import comPages.ComEleLoginPages;



public class ComEleLoginTestCases extends ComEleLoginPages {
	


	@Test	
	public void login() throws InterruptedException{
		// TODO Auto-generated method stub

		new ComEleLoginPages(driver).enterUsername("username").enterPassword("password").clickLoginButton();
		
	}

}
