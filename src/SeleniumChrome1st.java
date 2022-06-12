import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChrome1st {
	public static void main(String[] args) throws InterruptedException {
		 
		
		 System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Standalone-selenium\\Browser\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.youtube.com/");
		// Thread.sleep(100);
		 driver.close();
		 System.out.println("Execution complete");
		 
		 }
}
