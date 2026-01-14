package akselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		
		//<input type="text" placeholder="Username" id="inputUsername" value="">
		//1.Using Id locator
		driver.findElement(By.id("inputUsername")).sendKeys("Akshay");
		
		//<input type="password" placeholder="Password" name="inputPassword" value="">
		//2.Using Name locator
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		
		//<button class="submit signInBtn" type="submit">Sign In</button>
		//3.Using class locator
		driver.findElement(By.className("submit")).click();
		
		//<p class="error">* Incorrect username or password </p>
		//4. Using CSS Selector syntax: tagname[attribute='value']
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//<a href="#">Forgot your password?</a>
		//5. Using LinkText Locator
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//<input type="text" placeholder="Name">
		//6. Using Xpath Locator Syntax: //tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Albert");
		
		//<input type="text" placeholder="Email">
		//7.Using Customized cssSelector
		//Syntax: tagName[attribute='value']
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("albert@rsa.com");
		
		//8. Using Indexing with xpath
		//Syntax: //tagName[@attribute='value'][index]
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		//9.Using Indexing with cssSelector
		//Syntax: tagname[attribute='value']:nth-child(index)
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("albert@gmail.com");
		
		
		//10.Traverse to child element using xpath tagname
		//Syntax: //parentTagName/childTagName
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("989090000");
		
		
		//11.Traverse using cssSelector tagname
		//Syntax: TagName.className
		//driver.findElement(By.className("Button.reset-pwd-btn")).click();
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); //both are same
		
		//12. Traverse to child element using cssSelector tagname
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		
		//13. Traverse to child element xpath tagname and indexing
		//Syntax: //tagName[@attribute,'value']/childTagName[index]
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		//14.Using cssSelector with Id
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		
		//15.cssSelectorwith regular expression
		//Syntax: tagName[attribute*='value']
		driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("rahulshettyacademy");
		
		Thread.sleep(2000);
		//16. clicking on checkbox
		driver.findElement(By.id("chkboxOne")).click();
		
		//17. Using contains method(regular expression) with xpath
		driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();
		
		
		
		
		
	}

}
