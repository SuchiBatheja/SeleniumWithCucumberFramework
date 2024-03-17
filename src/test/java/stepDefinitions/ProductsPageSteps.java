package stepDefinitions;

import java.util.List;
import java.util.Map;

import com.pages.LoginPage;
import com.pages.ProductsPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ProductsPageSteps {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private ProductsPage productsPage;
	
	@Given("User has looged in to application")
	public void user_has_looged_in_to_application(DataTable dataTable) {
	    
		List<Map<String,String>> credList = dataTable.asMaps();
		String username = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		
		DriverFactory.getDriver().get("https://ui.cogmento.com/");
		
		productsPage=loginPage.doLogin(username, password);
		
	}

	@Given("user is on Products Page")
	public void user_is_on_products_page() throws InterruptedException {
		Thread.sleep(3000);
		productsPage.selectSettingsIcon();
		Thread.sleep(3000);
		productsPage.selectProductsTab();
	}

	@Given("User selects New Button")
	public void user_selects_new_button() throws InterruptedException {
		Thread.sleep(3000);
		productsPage.selectNewButton();
		
	}

	@Given("Enters field name {string}")
	public void enters_field_name(String Name) throws InterruptedException {
		Thread.sleep(3000);
		productsPage.enterNameField(Name);
	}

	@Then("User selects Save button")
	public void user_selects_save_button() throws InterruptedException {
		Thread.sleep(3000);
		productsPage.selectSaveButton();
		
		
	}


	
	
	

}
