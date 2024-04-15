package com.testing;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class WebApplication {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver", "E:\\java_projects\\selerium\\project\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/city/mumbai");
		
		// TODO Auto-generated method stub

	}

}
