
package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class login {
	

	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Given("user should navigate to the applicaiton")
	public void userShouldNavigateToTheApplicaiton() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://bookcart.azurewebsites.net/");
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Given("user clicks on login link")
	public void userClicksOnLoginLink() {
	   driver.findElement(By.xpath("//span[text()=' Login ']")).click();
	}
	@Given("user enters the username as {string}")
	public void userEntersTheUsernameAs(String username) {
	  driver.findElement(By.xpath("//input[@formcontrolname=\"username\"]")).sendKeys(username);
	}
	@Given("user enters the password as {string}")
	public void userEntersThePasswordAs(String password) {
	  driver.findElement(By.xpath("//input[@formcontrolname=\"password\"]")).sendKeys(password);
	}
	@When("user clicks on login button")
	public void userClicksOnLoginButton() {
	    driver.findElement(By.xpath("//span[text()=\"Login\"]")).click();
	}
	@Then("Login should be success")
	public void loginShouldBeSuccess() throws InterruptedException {
		Thread.sleep(3000);
	    System.out.println("======="+driver.getTitle()+"=======");
	   WebElement expected = driver.findElement(By.xpath("(//span[@class=\"mdc-button__label\"]//span)[1]"));
	   Assert.assertEquals("ortoni", expected.getText());
	   driver.quit();
	}

}
