package com.model;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\cjc Software\\Testing\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	
	Set<Cookie>cookie=driver.manage().getCookies();
	int count=cookie.size();
	for(Cookie cook:cookie)
	{
		System.out.println("-----GitHub------");
	System.out.println("The name of cookie :"+cook.getName());
	System.out.println("The Domain of cookie :"+cook.getDomain());
	System.out.println("The Path of cookie :"+cook.getPath());
	System.out.println("The expiry of cookis :"+cook.getExpiry());
	System.out.println("The value of cookie :"+cook.getValue());
	System.out.println("The class of cookie :"+cook.getClass());
	System.out.println("check cookie is secure :"+cook.isSecure());
	System.out.println("check cookie is httponly :"+cook.isHttpOnly());
	}
	driver.manage().deleteCookieNamed("S");
	Cookie cookie1=new Cookie("username","password");
	driver.manage().addCookie(cookie1);
	
	String cookienm=driver.manage().getCookieNamed("S").getName();
	System.out.println("Name of cookie is :"+cookienm);
	
	Cookie cookienm1=driver.manage().getCookieNamed("T");
	System.out.println("Nmae of cookie :"+cookienm1);
}
}
