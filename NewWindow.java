package org.openqa.selenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/divimadan28/Downloads/chromedriver");
WebDriver driver= new ChromeDriver();
driver.get("https://rahulshettyacademy.com/angularpractice/");
// switching windows
driver.switchTo().newWindow(WindowType.WINDOW);
Set<String> handles= driver.getWindowHandles();
//Iterator to switch windows
Iterator<String> it= handles.iterator();
String parentWindowId=it.next();
String childWindowId= it.next();
driver.switchTo().window(childWindowId);
driver.get("https://rahulshettyacademy.com/");
String CourseName= driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
driver.switchTo().window(parentWindowId);
WebElement name= driver.findElement(By.xpath("//input[@name='name']"));
name.sendKeys(CourseName);
//screenshot
File file= name.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(file, new File("logo.png"));
//Get height & width

System.out.println(name.getRect().getDimension().getHeight());
System.out.println(name.getRect().getDimension().getWidth());


	}

}
