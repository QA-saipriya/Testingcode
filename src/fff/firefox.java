package fff;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sk\\Desktop\\sele-java-jar\\geckodriver-v0.29.1-win64\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
//String url=("https://www.flipkart.com/");
//driver. get(url);
	}

}