package modulepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ModuleClass {
	public static WebDriver driver;
	public static void browserInitiation(String URL) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Teja Swaroop\\eclipse-workspace\\MavenPractice\\src\\main\\resources\\Drivers\\chromedriver.exe");;
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Home page title is : "+driver.getTitle());
	}
	
	public static void gmailAccountLogin() {
		
		WebElement Username=driver.findElement(By.id("identifierId"));
		Username.clear();
		Username.sendKeys("kgirija1717@gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\'identifierNext\']/div/button/div[3]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Password=driver.findElement(By.xpath("//*[@id=\'password\']/div[1]/div/div[1]/input"));
		Password.clear();
		Password.sendKeys("kgirija1717@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[3]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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

	public static void checkboxesFunctionality() {
		
		System.out.println("Now clicking on "+driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[6]/a")).getText()+" to check Checkboxes functionality");
		driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[6]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\'checkboxes\']/input[1]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\'checkboxes\']/input[2]")).isSelected(), "Checkbox is not selected");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Assertion for checkbox is successful");
		System.out.println("Testing of checkboxes is successful");
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	public static void mousehoverFunctionality() {
		
		System.out.println("Now clicking on "+driver.findElement(By.xpath("//*[@id='content']/ul/li[9]/a")).getText()+" to check Mousehover functionality");
		driver.findElement(By.xpath("//*[@id='content']/ul/li[9]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Home= driver.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/a"));
		System.out.println(Home.getText());
		Actions x= new Actions(driver);
		Action Mouseover =x.moveToElement(Home).build();
		Mouseover.perform();
		System.out.println("Testing of Mouseover is successful");
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	public static void dropdownFunctionality() {
		
		System.out.println("Now clicking on "+driver.findElement(By.xpath("//*[@id='content']/ul/li[11]/a")).getText()+" to check Dropdown functionality");
		driver.findElement(By.xpath("//*[@id='content']/ul/li[11]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Values in the dropdown are : " +driver.findElement(By.xpath("//*[@id=\'dropdown\']")).getText());
		new Select(driver.findElement(By.xpath("//*[@id=\'dropdown\']"))).selectByVisibleText("Option 1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Testing of Dropdown is successful");
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	public static void framesFunctionality() {
		
		System.out.println("Now clicking on "+driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[22]/a")).getText()+" to check Frames functionality");
		driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[22]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int size= driver.findElements(By.tagName("iFrame")).size();
		System.out.println("Number of frames present : "+size);
		System.out.println("Testing of Frames is successful");
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void closeBrowser() {
		
		driver.quit();
		System.out.println("**** End of Testing ****");
		
	}
}
