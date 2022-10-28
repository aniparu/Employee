package org.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		// brower Launch
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anipa\\eclipse-workspace\\SeleniumBatch2Pm\\drivers\\chromedriver.exe");

		// instanciation
		WebDriver driver = new ChromeDriver();

		// to launch given url in the webpage
		driver.get(" https://output.jsbin.com/osebed/2");

		driver.manage().window().maximize();

	    System.out.println("kavi");

		WebElement mon = driver.findElement(By.xpath("//select[@id='fruits']"));

		Select s = new Select(mon);
		// to check whether it is single /multiple select drop down

		if (s.isMultiple()) {

			System.out.println("we can select more than one option");

		} else {
			System.out.println("we can select only one option");
		}

		s.selectByValue("apple");
		s.selectByVisibleText("Grape");
		s.selectByIndex(2);

	
		
		WebElement firstOpt = s.getFirstSelectedOption();
		System.out.println(firstOpt.getText());
		
		
		// to fetch all Options
		List<WebElement> allOptions = s.getOptions();
		


		int y = allOptions.size();
		System.out.println(y);

		for (int i = 0; i < allOptions.size(); i++) {

			WebElement eachOpt = allOptions.get(i);
			System.out.println(eachOpt.getText());

		}

		for (WebElement eachOpt : allOptions) {
			System.out.println(eachOpt.getText());

		}
		
		
		List<WebElement> selectOpt = s.getAllSelectedOptions();
		
		System.out.println(selectOpt.size());
		
		for (int i = 0; i < selectOpt.size(); i++) {
			WebElement eachsel = selectOpt.get(i);
			System.out.println(eachsel.getText());
			
		}
		
		
		//[w1   w2    w3    w4]
		//[     w2    w3     w4]
		//[w1]
		
		
		allOptions.removeAll(selectOpt);
		for (int i = 0; i < allOptions.size(); i++) {
			WebElement opt = allOptions.get(i);
			System.out.println(opt.getText());
			
		}
		
		
		s.deselectAll();
		
		
		
		
		
		
		
		
		

	}

}
