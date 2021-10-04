package fff;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countoflinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sk\\\\Desktop\\\\sele-java-jar\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
List<WebElement>	links=driver.findElements(By.tagName("a"));
System.out.println("Total number of links avilable is : " + links.size());
List<WebElement> texts = driver.findElements(By.tagName("input"));
System.out.println("Total number of textbox available :"+ texts.size());
List<WebElement> buttons = driver.findElements(By.tagName("button"));
System.out.println("Total number of buttons available : "+ buttons.size());
List<WebElement> images = driver.findElements(By.tagName("img"));
System.out.println("Total number of images available are you ok:"+ images.size());



JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,2000)", "");
js.executeScript("window.scrollBy(0,-1000)","");

		

}
}