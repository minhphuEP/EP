import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class modifypage extends loginpage{
	String URL_page = "http://localhost/wordpress/wp-admin/";
	String user_login = "user_login";
	String user_pass = "user_pass";
	String submitBT = "wp-submit";
	public void login(String username, String password) {
		driver.findElement(By.id(user_login)).sendKeys(username);
		driver.findElement(By.id(user_pass)).sendKeys(password);
		driver.findElement(By.id(submitBT)).click();
	}
  @Test
  public void loginbyadmin() {
	  driver.get("http://localhost/wordpress/wp-admin/post-new.php");
	  login("admin", "1_Abc_123");
//	  driver.findElement(By.id("title")).sendKeys("This is the title");
//		driver.switchTo().frame("content_ifr");
//		driver.findElement(By.id("tinymce")).sendKeys("This is the body");
//		driver.switchTo().defaultContent();
//		driver.findElement(By.id("publish")).click();
//		driver.findElement(By.cssSelector("#message a")).click();
		//String title = driver.findElement(By.tagName("h2")).getText();
		//Assert.assertEquals(title, "This is the title");
  }
}
