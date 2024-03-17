package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

	private WebDriver driver;

	// 1. By locators
	private By settingsIcon = By.cssSelector("div[role='listbox']");

	private By ProductsTab = By.xpath("//span[contains(text(),'Products')]");

	private By NewButton = By.xpath("//a//button[contains(text(),'New')]");

	private By NameField = By.xpath("//*[@name='name']");

	private By SaveButton = By.xpath("//button[contains(text(),'Save')]");

	// 2. Constructor of Page class

	public ProductsPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. Page Actions

	public void selectSettingsIcon() {
	driver.findElement(settingsIcon).click();

	}

	public void selectProductsTab() {
		driver.findElement(ProductsTab).click();

	}

	public void selectNewButton() {
		driver.findElement(NewButton).click();
	}

	public void enterNameField(String Name) {
		driver.findElement(NameField).sendKeys(Name);

	}

	public void selectSaveButton() {
		driver.findElement(SaveButton).click();
	}

}
