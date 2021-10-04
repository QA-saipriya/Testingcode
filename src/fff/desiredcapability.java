package fff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class desiredcapability {
	public  void main(String[] args) {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("version", "93.0.455");
        capabilities.setCapability("platform", "win 10");
        capabilities.setCapability("infobar", "true");
        

	



	}
}