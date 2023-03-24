 package org.basepkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	//browser launch
	
	public static WebDriver browserlaunch(String browsername) {
		if(browsername.equalsIgnoreCase("chrome"))   {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	else if(browsername.equalsIgnoreCase("firefox")) {
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
   }

    else if(browsername.equalsIgnoreCase("edge")) {
    WebDriverManager.edgedriver().setup();
    driver=new EdgeDriver();
	
    }
	return driver;
  }


public static WebDriver browserlaunch1(String browsername) {
	
	switch(browsername) {
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
	case "edge":
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		break;
	}
    return driver;
}

public static WebDriver ChromeBrowser() {
	WebDriverManager.chromedriver().setup();
	return driver=new ChromeDriver();
	}

public static WebDriver FirefoxBrowser() {
	WebDriverManager.firefoxdriver().setup();
	return driver=new FirefoxDriver();
}

public static WebDriver edgeBrowser() {
	WebDriverManager.edgedriver().setup();
	return driver=new EdgeDriver();
}

//url launch

public static void urlLaunch(String url) {
	driver.get(url);
}

//maximize

public static void maximize() {
	driver.manage().window().maximize();

}

//implicitly wait

public static void implycitlywait(int secs) {
	driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
}

//sendkeys

public static void sendkeys(WebElement e, String value) {
	e.sendKeys(value);
}

//click

public static void click(WebElement e) {
e.click();	
}

//getText

public static String getText(WebElement e) {
	String text = e.getText();
	return text;
}

//Title

public static String title() {
	String title = driver.getTitle();
	return title;
}

//Current Url

public static String currentUrl() {
	String currentUrl = driver.getCurrentUrl();
	return currentUrl;
}

//getAttribute

public static String getAttribute(WebElement e) {
	String att = e.getAttribute("value");
	return att;

}

//moveToElement

public static void moveToElement(WebElement target) {
	Actions a=new Actions(driver);
	a.moveToElement(target).perform();
}

//SelectByIndex

public static void selectByIndex(WebElement drd, int index) {
	Select s=new Select(drd);
	s.selectByIndex(index);

}

public static void quit() {
	driver.quit();
}













}
