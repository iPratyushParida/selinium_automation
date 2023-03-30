package selinium_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/");
		Thread.sleep(2000);
		String titel=driver.getTitle();
		System.out.println(titel);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();
	}
}
