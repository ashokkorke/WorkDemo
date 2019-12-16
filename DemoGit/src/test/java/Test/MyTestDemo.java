package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class MyTestDemo {
	 public WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.softwaretestingmaterial.com/");
  }
  @BeforeMethod
  public void beforeMethod() {
	 
	  System.setProperty("webdriver.chrome.driver", "Resource//chromedriver.exe");
	  driver = new ChromeDriver();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
