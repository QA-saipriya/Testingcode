package fff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hi {

	public static void main(String[] args) throws InterruptedException {
		

System.setProperty("webdriver.chrome.driver", "C:\\Users\\sk\\Desktop\\sele-java-jar\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://m.facebook.com/");

String mytitle = driver.getTitle();
int TitleLength= driver.getTitle().length();
System.out.println("title is"+mytitle);
System.out.println("length of the title is :"+TitleLength);
String pageSource = driver.getPageSource();
int pageSourcelength = driver.getPageSource().length();
System.out.println("total length of the page is :"+ pageSourcelength);
driver.close();

	}

	}

