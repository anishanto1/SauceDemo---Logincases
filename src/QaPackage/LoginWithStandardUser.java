package QaPackage;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class LoginWithStandardUser {


	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.Chrome.driver", "//usr/bin/google-chrome1 ");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com");

		//Locate UserName Section
		WebElement UserName = driver.findElement(By.id("user-name"));
		//Provide UserName  
		UserName.sendKeys("standard_user");

		//Locate Password Section
		WebElement Password = driver.findElement(By.id("password"));		
		Password.sendKeys("secret_sauce");

		//Click Login
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();

	}

}
