package com.hepsiburada.pages.selenium.hepsiburada;

import java.lang.reflect.Method;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import com.hepsiburada.base.SeleniumAbstractTest;

public class HepsiBurada extends SeleniumAbstractTest {
	String chrome="chrome";
	String firefox="firefox";
	protected ThreadLocal <PageHepsiBuradaLogin> lgn =new ThreadLocal<PageHepsiBuradaLogin>();
	
	@BeforeMethod
	
	public void Before (Method method) {
	DOMConfigurator.configureAndWatch("log.xml");	
	WebDriver  driver;
	driver =super.setUpBrowser(chrome);
	lgn.set(new PageHepsiBuradaLogin(driver));
	
}
	
	protected PageHepsiBuradaLogin startTest() {
		
		return lgn.get();
	}
}