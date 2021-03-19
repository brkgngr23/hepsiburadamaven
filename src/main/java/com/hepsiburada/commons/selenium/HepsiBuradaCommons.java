package com.hepsiburada.commons.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.hepsiburada.basepage.SeleniumAbstractPage;

public class HepsiBuradaCommons extends SeleniumAbstractPage {
	
	public HepsiBuradaCommons (WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}
	
}