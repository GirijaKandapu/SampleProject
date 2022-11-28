package modulepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModuleClass {
	public static WebDriver driver;
	public static void browserInitiation(String URL) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Teja Swaroop\\eclipse-workspace\\MavenPractice\\src\\main\\resources\\Drivers\\chromedriver.exe");;
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static void gmailAccountLogin() {
		
		driver.findElement(By.xpath("//*[@id=\'view_container\']/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div/ul/li[2]/div")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(driver.findElement(By.xpath("//*[@id=\'selectionc0\']")).isDisplayed()) {
		driver.findElement(By.xpath("//*[@id=\'password\']/div[1]/div/div[1]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\'password\']/div[1]/div/div[1]/input")).sendKeys("1Chicken@1027");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[3]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	}
	public static void composeEmail() {
		System.out.println(driver.getTitle());
		new WebDriverWait(driver,99).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div/div")));
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div/div")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			String Windowhandle = driver.getWindowHandle();
			driver.switchTo().window(Windowhandle);
			driver.findElement(By.xpath("//*[@id=\':rt\']")).sendKeys("tejaswaroop2010@gmail.com");
			driver.findElement(By.xpath("//*[@id=':rb']")).sendKeys("Helloo Husband!!!!");
			driver.findElement(By.xpath("//*[@id=':sh']")).sendKeys("Helloo Husband!!!!");
			driver.findElement(By.xpath("//*[@id=':r1']")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
    public static void logoutGmailAccount() {
    	driver.findElement(By.xpath("//*[@id=\'gb\']/div[2]/div[3]/div[1]/div[2]/div/a/img")).click();
    	driver.findElement(By.xpath("//*[@id=\'yDmH0d\']/c-wiz/div/div/div/div/div[2]/div/div/div[3]/span/a/div")).click();
		driver.quit();
	}
    
    public static void demoSiteWebElementsChecking() {
    	System.out.println(driver.getTitle());
    	System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/header/div/div[2]/div[1]/a/div")).getText());
    }
}
