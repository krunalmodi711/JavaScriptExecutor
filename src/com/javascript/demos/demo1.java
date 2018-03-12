package com.javascript.demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class demo1 {
	
	@Test
	public void demo1() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "G:\\Neon\\gecko driver\\geckodriver.exe");
		WebDriver objDriver = new FirefoxDriver();
		objDriver.manage().deleteAllCookies();
		objDriver.manage().window().maximize();
		objDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		objDriver.get("file:///C:/Users/krunal/Desktop/Selenium%20webpages/HTMLTag.html");
		WebElement objElement = objDriver.findElement(By.id("txtUserName"));
		// passing value to textbox without sendkeys
		JavascriptExecutor js = (JavascriptExecutor)objDriver;
		js.executeScript("arguments[0].value = 'krunal' ", objElement);
		WebElement objElement1 = objDriver.findElement(By.id("txtPassowrd"));
		js.executeScript("arguments[0].value ='modi'",objElement1);
		
		//click on element using javascript
		WebElement objElement3 = objDriver.findElement(By.id("btnLogIn"));
	//	js.executeScript("arguments[0].click();", objElement3);
		
		//scrolling window using javascrip
		//js.executeScript("scroll(0,400)");
	
		//getting height and width of an element
		Dimension d = objElement3.getSize();
		int height = d.getHeight();
		int width = d.getWidth();
		
		System.out.println("Height is " +height + "Width is "+width);
		
		//getting location of webelement
		
		Point objp = objElement3.getLocation();
		
		
		int Xcordi = objp.getX();
		int Ycordi = objp.getY();
		System.out.println("X cordinate is "+Xcordi + " Y cordinate is "+Ycordi);
		
		//getting title using javascript
		System.out.println(js.executeScript("return document.title;").toString());
		
		for(int i=0;i<=100;i++){
		
			js.executeScript("arguments[0].style.backgroundcolor = 'lightblue'", objElement);
		}
		
		
	
	}
	
	
}
