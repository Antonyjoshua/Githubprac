package FirstMaven.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

	// All the test cases will be written in test folder
   public WebDriver driver;
	@Test
	private void test() {
	  driver = new ChromeDriver();
		driver.get("https://confluence.atlassian.com/bitbucketserver/basic-git-commands-776639767.html");

	}

	@Test
	public void login() {
		System.out.println("Selenium login");
		 driver = new ChromeDriver();
			driver.get("https://confluence.atlassian.com/bitbucketserver/basic-git-commands-776639767.html");
		System.out.println(driver.getCurrentUrl());
	}

	@Test
	public void Logout() {
		System.out.println("Selenium Logout");
	}
	@Test
	public void Logout2() {
		System.out.println("Selenium Logout");
	}


}
