package QaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginWithLockedOutUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.Chrome.driver", "//usr/bin/google-chrome1");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");

		//Locate UserName Section
		WebElement UserName = driver.findElement(By.id("user-name"));
		//Provide UserName  
		UserName.sendKeys("locked_out_user");

		//Locate Password Section
		WebElement Password = driver.findElement(By.id("password"));		
		Password.sendKeys("secret_sauce");

		//Click Login
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();

	}


}
