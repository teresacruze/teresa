     package com.usa.smarttech;

     import org.openqa.selenium.By;
     import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;

    public class Login3 {
  static WebDriver driver;
   public static void main(String[] args) {
				
     System. setProperty("webdriver.chrome.driver", "C:\\Users\\13474\\eclipse-workspace\\Smarttech_Automation\\Driver\\chromedriver.exe");
    //Initialize browser.
	 driver=new ChromeDriver();
	driver.manage().deleteAllCookies();				

	driver.get("https://www.ups.com/US/en/Home.page");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()='Sign up / Log in']")).click();
				
	driver.findElement(By.xpath("//a[@class='ups-analytics']"));
	driver.findElement(By.id("id=\"email\"")).sendKeys("teresacruze79@gmail.com");	
	driver.findElement(By.id("id=\"pwd\"")).sendKeys("Henessy@2020%");
	driver.findElement(By.id("id=\"submitBtn\"")).click();
	System.out.println(driver.getTitle());
				
			
}}
