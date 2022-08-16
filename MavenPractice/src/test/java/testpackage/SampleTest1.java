package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest1 {

		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Teja Swaroop\\eclipse-workspace\\MavenPractice\\src\\main\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Hellooo");
		driver.quit();
	}

}
