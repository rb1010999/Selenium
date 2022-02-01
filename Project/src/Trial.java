import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Trial {
  
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/rahul.badgujar/eclipse-workspace/Project Heirloom/bin/chromedriver 2");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.amazon.in/");
		
		Select sc = new Select(Driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		sc.selectByVisibleText("Amazon Fashion");    // Select Value from Drop-down List
		
		WebElement search = Driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		search.sendKeys("Shoes");					// Pass Value in Search Text Field
		search.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		
		Driver.navigate().back();  		// Navigate Back to previous Page
		// Driver.navigate().forward();	// Navigate to forward page
		// Driver.navigate().refresh(); // Refresh current page
		Thread.sleep(1000);
		
		Driver.manage().window().maximize();  // Maximize Screen
		Thread.sleep(1000);
		
		Actions actions = new Actions(Driver); 			// Action Class for Hover
		WebElement mainMenu = Driver.findElement(By.xpath("//a[@id='nav-link-prime']"));
		actions.moveToElement(mainMenu).perform();
		Thread.sleep(1000);
		
		JavascriptExecutor js= (JavascriptExecutor) Driver;  // Scroll down screen 
		js.executeScript("window.scrollBy(0,250)","");
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,-250)","");  	// Scroll Up Screen again
		Thread.sleep(1000);
		
		WebElement sign = Driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")); //Perform Hover Action on SIgn in 
		actions.moveToElement(sign).perform();
		Thread.sleep(1000);
		
		Driver.findElement(By.cssSelector(".nav-action-inner")).click(); // SignIn Account Page
		Driver.navigate().back();			//Navigate Back
		
		Driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();  //Select MObile 
		
		Driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[5]/ul[1]/li[1]/span[1]/a[1]/div[1]/label[1]/i[1]")).click();  //CHECKBOX
		
		js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(1000);								// Scroll down screen
		
		
		
		
	}

}
