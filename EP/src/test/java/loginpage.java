import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;;


public class loginpage {
	WebDriver driver;
	public static final String ULR_login = "http://localhost/wordpress/wp-login.php";
	public static final String URL_page = "http://localhost/wordpress/wp-admin/";
	@BeforeMethod
	public void setup(){
		driver = new FirefoxDriver();
		driver.get(ULR_login);
	}
	@AfterMethod
	public void teardown() {
		//driver.quit();
	}
}
