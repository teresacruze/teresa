    package seleninum.automation;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;

     public class LoginTest {
	 public static void main(String[] args) {
		
		System. setProperty("webdriver.chrome.driver", "C:\\Users\\13474\\eclipse-workspace\\Smarttech_Automation\\Driver\\chromedriver.exe");
		// Initialize browser.
		WebDriver driver = new ChromeDriver();
		//driver.get("http://www.pnc.com/");
		//driver.get("http://www.onlinebanking.pnc.com");
		//driver.get("http://onlinebanking.standardbank.co.za");
		//driver.get("https://aka.ms/remoteconnect");		
		// server and browser both are closed
		//If IE(Internet explorer)only browser closed.
	   //If I want use ID browser then I have to use driver.close method
		    
		driver.get("http://online.adp.com/portal/login.html");
		
	driver.findElement(By.xpath("")).click();
	driver.findElement(By.id("")).click();
		
	}}
	