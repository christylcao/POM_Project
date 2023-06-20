package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest  {
	
	static WebDriver driver;
	static String browser = "edge";
	static String url = "https://www.techfios.com/billing/?ng=admin/";

	String username = "demo@techfios.com";
	String password = "abc123";
	
	@Test
	public void validUserShouldBeAbleToLogin() {
		
		driver = BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUsername(username);
		loginPage.insertPassword(password);
		loginPage.clickSubmit();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage();
		
		BrowserFactory.tearDown();
	}
}

