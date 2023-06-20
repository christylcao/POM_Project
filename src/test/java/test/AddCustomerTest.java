package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;
	String username = "demo@techfios.com";
	String password = "abc123";
	String name = "Selenium102";
	String company = "Bank Of America";
	String email = "abdojwmd@gmail.com";
	String country = "Svalbard And Jan Mayen";
	String phone = "0123456789";		
	
	@Test
	public void userShouldBeAbleAddCustomer() throws InterruptedException {
		
		driver = BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login(username, password);
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage();
		Thread.sleep(2000);
		dashboardPage.clickOnCustomerMenu();
		dashboardPage.clickOnAddCustomer();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.validateAddCustomerPage();
		Thread.sleep(2000);
		addCustomerPage.insertFullName(name);
		addCustomerPage.selectCompanyName(company);
		addCustomerPage.insertEmail(email);
		addCustomerPage.insertPhoneNum(phone);
		addCustomerPage.selectCountryName(country);
	}
	
}
