package AspireP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AspireQA2 {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.gecko.driver", "D:\\Aman\\projects\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://aspireapp.odoo.com/web/login");
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Maximize the window
		driver.manage().window().maximize();
		
		// enter email and password
		
		//Step - 1 Login to the system
		
		driver.findElement(By.id("login")).sendKeys("user@aspireapp.com");
		driver.findElement(By.id("password")).sendKeys("@sp1r3app");
		driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/form/div[3]/button")).click();

		//Step -2 Navigates to the Inventory feature
		Thread.sleep(5000);	
		driver.findElement(By.id("result_app_1")).click();		
		
		//Step - 3 From the top-menu bar select products - product item - create new
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[2]/button/span")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[2]/div/a[1]")).click();
	
		// Create new product 
		// Enter Product name
		Thread.sleep(5000);
		driver.findElement(By.className("o_cp_buttons")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"o_field_input_10\"]")).sendKeys("aspire40");
		
		// Click on Save button 
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/div[2]/button[1]")).click();
		
		// Update quantity -------------------------------
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[1]/div/button[2]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/button[4]")).click();
		
		// add qty
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/table/tbody/tr[1]/td[6]/input")).clear();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/table/tbody/tr[1]/td[6]/input")).sendKeys("31");
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/table/tbody/tr[1]/td[6]/input")).clear();
		
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/table/tbody/tr[1]/td[6]/input")).sendKeys("30");
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div")).click();
		
				
		
		//Step -5 Click on Application Icon
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/header/nav/a[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/a[3]/div[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/button[3]")).click();
		
		//enter product name
		Thread.sleep(5000);
		
		driver.findElement(By.className("o_dropdown_button")).click();
  }
}
