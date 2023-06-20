package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {

	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") WebElement ADD_FULL_NAME;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]") WebElement COMPANY_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='email']") WebElement EMAIL_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']") WebElement PHONE_NUMBER_FIELD;
	@FindBy(how = How.XPATH, using = "//select[@id='country']") WebElement COUNTRY_FIELD;
	@FindBy(how = How.XPATH, using = "//h5[contains(text(), 'Add Contact')]") WebElement ADD_CUSTOMER_HEADER_FIELD;


 	public void validateAddCustomerPage() {
 		Assert.assertEquals(ADD_CUSTOMER_HEADER_FIELD.getText(), "Add Contact", "ADD CUSTOMER PAGE NOT FOUND!");
 	}
 	
 	public void insertFullName(String fullName) {
 		String insertName = fullName + generateRandomNum(999);
 		ADD_FULL_NAME.sendKeys(insertName);
 	}
 	public void selectCompanyName(String company) {
 		selectField(COMPANY_FIELD, company);
	}
 	
 	public void insertEmail(String email) {
 		EMAIL_FIELD.sendKeys(generateRandomNum(999)+ email);
 	}
 	public void insertPhoneNum(String phone) {
 		PHONE_NUMBER_FIELD.sendKeys(phone);
 	}
 	public void selectCountryName(String country) {
 		selectField(COUNTRY_FIELD, country);
 	}
 		
 }

