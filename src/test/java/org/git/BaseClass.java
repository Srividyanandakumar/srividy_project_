package org.git;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static WebDriver chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		return driver;	
	}
	
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}
	
	public static void implicitlyWait(int a) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	public static void sendkeys(WebElement s,String value) {
		s.sendKeys(value);
	}
	
	public static void click(WebElement s) {
		s.click();
	}
	
	public static void clear(WebElement s) {
		s.clear();
	}
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}
	
	public static String getTitle() {
		String title = driver.getTitle();
		return title;

	}
	
	public static void quit() {
		driver.quit();

	}
	
	public static String getText(WebElement s) {
		String text = s.getText();
		return text;
	}
	
	public static String getAttribute(WebElement s) {
		String attribute = s.getAttribute("value");
		return attribute;

	}
	
	public static void moveToElement(WebElement s) {
		Actions a=new Actions(driver);
		a.moveToElement(s).perform();

	}
	
	
	public static void dragAndDrop(WebElement src, WebElement dest) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}
	
	public static void selectByIndex(WebElement s,int d) {
		Select s1=new Select(s);
		s1.selectByIndex(d);
	}
	
	public static void selectByVisibleText(WebElement s,String input) {
		Select s1=new Select(s);
		s1.selectByVisibleText(input);
		
	}
	
	public static void selectByValue(WebElement s,String input1) {
		Select s1=new Select(s);
		s1.selectByValue(input1);

	}
	
	public static String isMultiple(WebElement s) {
		Select s1= new Select(s);
		boolean multiple = s1.isMultiple();
		return null;

	}
	
	public static void deselectAll(WebElement s) {
		Select s1= new Select(s);
		s1.deselectAll();
	}
	
	public static void deselectByIndex(WebElement s,int i) {
		Select s1= new Select(s);
		s1.deselectByIndex(i);

	}
	
	public static void scrollDown(WebElement s2) {
		JavascriptExecutor jk= (JavascriptExecutor)driver;
		jk.executeScript("arguments[0].scrollIntoView(true)", s2);
	}
	
	public static void scrollUp(WebElement s2) {
		JavascriptExecutor jk= (JavascriptExecutor)driver;
		jk.executeScript("arguments[0].scrollIntoView(false)", s2);

	}
	
	public static void doubleClick(WebElement s3) {
		Actions a=new Actions(driver);
		a.doubleClick(s3);	
	}
	
	
	public static void deleteText(WebElement s3) throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);

	}
	
	
		
}


