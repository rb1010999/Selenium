import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/rahul.badgujar/eclipse-workspace/Project Heirloom/bin/chromedriver 2");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		Driver.findElement(By.cssSelector("input[name='upfile']")).sendKeys("//Users//rahul.badgujar//Downloads//Fire-Backgrounds-07-2272-x-1704.jpeg");
	}

}
