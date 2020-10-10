           package com.usa.smarttech;

            import org.openqa.selenium.By;
            import org.openqa.selenium.WebDriver;
             import org.openqa.selenium.chrome.ChromeDriver;

             public class LoginTest {
              static WebDriver driver;
		      public static void main(String[] args) {
				
				System. setProperty("webdriver.chrome.driver", "C:\\Users\\13474\\eclipse-workspace\\Smarttech_Automation\\Driver\\chromedriver.exe");
			// Initialize browser.
				WebDriver driver=new ChromeDriver();
				driver.navigate().to("https://www.zoopla.co.uk/");
				driver.get("https://www.zoopla.co.uk");
				driver.manage(). window().maximize();
		        driver.findElement(By.xpath("//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();
		        driver.findElement(By.xpath("(//*[@class='css-fa8dvy e11d441i1'])[4]")).click();
		    
				driver.findElement(By.id("signin_email")).sendKeys("teresacruze79@gmail.com");		

                driver.findElement(By.id("signin_password")).sendKeys("Cruzeteresa");		
                 driver.findElement(By.id("signin_submit")).click();
                 driver.findElement(By.linkText("//https://plus.google.com/118429606719656973951\" rel=\"publisher\">")).click();
                 System.out.println(driver.getTitle());
                 
		}}

                
                 		