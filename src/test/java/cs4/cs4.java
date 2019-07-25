package cs4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cs4 {
	WebDriver driver=null;
	//int sz;
	@Given("open application")
	public void open_application() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		Thread.sleep(2000);
	
	}

	@When("login the app")
	public void login_the_app() {
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("give username as {string}")
	public void give_username_as(String string) {
		 driver.findElement(By.name("userName")).sendKeys(string);
	}

	@When("give password as {string}")
	public void give_password_as(String string) {
		  driver.findElement(By.name("password")).sendKeys(string);
		  driver.findElement(By.name("Login")).click();
	}

	@When("search for required item")
	public void search_for_required_item() throws InterruptedException {
		Thread.sleep(2000);
	driver.findElement(By.name("products")).click();
	driver.findElement(By.name("products")).sendKeys("headphones");
	}

	@When("click search")
	public void click_search() {
	   driver.findElement(By.xpath("html/body/div[1]/form/input")).click();
	}

	@Then("check for cart")
	public void check_for_cart() {
	 int sz=driver.findElements(By.linkText("Cart")).size();
	 if(sz==0)
	 {
		 System.out.println("Cart not found");
	 }
	 else
	 {
		 driver.findElement(By.linkText("Cart")).click();
	 }
	}

	@Then("close application")
	public void close_application() {
	   driver.close();
	}


}
