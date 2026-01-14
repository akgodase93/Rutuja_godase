package SeleniumRutuja;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver //seleniuminstrution
{
	public static void main(String [] args)

	{
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        System.out.print("CurrentURL"+ " : ");
        System.out.println(driver.getCurrentUrl());
        System.out.println("Title Of Page"+" : "+driver.getTitle());
        driver.navigate().to("https://www.orangehrm.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());
        driver.manage().window().setSize((new Dimension(20, 40)));
        driver.manage().window().setPosition(new Point(20, 50));
        
        driver.close();
        driver.quit();
        
        
	}
}
