import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Heirloom{

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","/Users/rahul.badgujar/eclipse-workspace/Project Heirloom/bin/chromedriver 2");
				WebDriver Driver = new ChromeDriver();
				Driver.get("https://dev.heirloomproject.co/login");
				
				Driver.manage().window().maximize();
				
				Driver.findElement(By.id("email")).sendKeys("rahul101099@yopmail.com");
				Thread.sleep(1000);
				
				Driver.findElement(By.id("password")).sendKeys("Rahul@101099");
				Thread.sleep(1000);
				
				Driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
				Thread.sleep(1000);
				
			}

		

	}


