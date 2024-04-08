package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getDriver(String browserName) {
		switch (browserName) {
		case "CHROME":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "EDGE":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "FIREFOX":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			break;
		}
		return driver;
	}

	public static void launchURL(String url) {
		driver.get(url);
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void unconditionalWait(int msecs) throws InterruptedException {
		Thread.sleep(msecs);
	}

	public void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public void click(WebElement element) {
		element.click();
	}

	public void clickByJS(WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", element);
	}

	public void sendKeysByJS(WebElement element, String data) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('value','" + data + "')", element);
	}

	public void clear(WebElement element) {
		element.clear();
	}

	public void sendKeys(WebElement element, String data) {
		element.sendKeys(data);
	}

	public String getText(WebElement element) {
		String txt = element.getText();
		return txt;
	}

	public void moveCursor(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element);
	}

	public void clickByEnterKey() {
		Actions ac = new Actions(driver);
		ac.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
	}

	public File takeScreenshot() {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		return screenshotAs;
	}

	public byte[] cucumberScreenshot() {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		return screenshotAs;
	}

	public static String getProjectPath() {
		String path = System.getProperty("user.dir");
		return path;
	}

	public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream(getProjectPath() + "\\src\\test\\resources\\PropertyFiles\\Datas.properties"));
		String value = (String) prop.get(key);
		return value;
	}

	public static String generateRandomString(int length) {
		String name = "au";
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder randomString = new StringBuilder();

		Random random = new Random();
		for (int i = 0; i < length; i++) {
			int index = random.nextInt(characters.length());
			randomString.append(characters.charAt(index));
		}
		return name + randomString.toString();
	}

	public static String generateRandomNumber(int length) {
		String characters = "0123456789";
		StringBuilder randomString = new StringBuilder();

		Random random = new Random();
		for (int i = 0; i < length; i++) {
			int index = random.nextInt(characters.length());
			randomString.append(characters.charAt(index));
		}
		return randomString.toString();
	}

	public static String VINGeneration() {
		launchURL("https://randomvin.com/");
		driver.findElement(By.xpath("//input[@id='button' and @name='mk_vin']")).click();
		return driver.findElement(By.xpath("//span[@id='Result']")).getText();
	}

}
