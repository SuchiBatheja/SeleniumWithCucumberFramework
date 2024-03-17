package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	// 1. By Locators:

	private By EmailId = By.xpath("//*[@name='email']");

	private By password = By.xpath("//*[@name='password']");

	private By SubmitBtn = By.xpath("//*[text()='Login']");

	private By ForgotPasswordLink = By.linkText("Forgot your password?");

	// 2. Constructor of the Page Class

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	// 3. Page Actions: Features(behavior) of the page the form of methods:

	public String getLoginPageTitle() {

		return driver.getTitle();

	}

	public boolean isForgotPwdLinkExist() {

		return driver.findElement(ForgotPasswordLink).isDisplayed();
	}

	public void enterUserName(String username) {

		driver.findElement(EmailId).sendKeys(username);

	}

	public void enterPassword(String pwd1) {

		driver.findElement(password).sendKeys(pwd1);
	}

	public void clickOnLogin() {

		driver.findElement(SubmitBtn).click();
	}

	public ProductsPage doLogin(String un, String pwd) { 
		
		System.out.println("Login with " + un + "and" + pwd);
		driver.findElement(EmailId).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(SubmitBtn).click();
		
		return new ProductsPage(driver);
	}

}
