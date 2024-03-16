package stepDefinitions;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginPageSteps {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	private static String title;

	@Given("user is on login page")
	public void user_is_on_login_page() {
	   
		DriverFactory.getDriver().get("https://ui.cogmento.com/");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
	    
		 title = loginPage.getLoginPageTitle();
		System.out.println("Title of the page is : "+title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
	 
		Assert.assertEquals(title, expectedTitle);
		
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
	}

	@When("user enters username {string}")
	public void user_enters_username(String usrName) {
		loginPage.enterUserName(usrName);
		
	}

	@When("user enters password {string}")
	public void user_enters_password(String pwd) {
		loginPage.enterPassword(pwd);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		loginPage.clickOnLogin();
	}

	
	
	
	
	
	
}
