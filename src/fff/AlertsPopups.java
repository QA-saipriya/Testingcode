package fff;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sk\\\\Desktop\\\\sele-java-jar\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
String url="https://demoqa.com/alerts";
driver.get(url);
//JavascriptExecutor js=(JavascriptExecutor)driver; 
//js.executeScript("windows scrollBy(0,300", "");
WebElement el=driver.findElement(By.xpath("//button[@id='promtButton']"));
((JavascriptExecutor) driver).executeScript("arguments[0].click()", el);

Alert a= driver.switchTo().alert();
Thread.sleep(5000);
a.sendKeys("SaiPriya");

a.accept();
//System.out.println(a.getText());
Thread.sleep(3000);
//driver.close();

		
	}

}  
