package com.hepsiburada.pages.selenium.hepsiburada;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.hepsiburada.base.SeleniumAbstractTest;
import com.hepsiburada.commons.selenium.HepsiBuradaCommons;
import com.hepsiburada.data.GetData;



public class PageHepsiBuradaLogin extends SeleniumAbstractTest {
	HepsiBuradaCommons lib;
	public WebDriver test;
	public PageHepsiBuradaLogin (WebDriver driver) {
		lib= new HepsiBuradaCommons(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (how =How.XPATH, using ="//div[@id='myAccount']")
	WebElement btnGiris;
	@FindBy (how =How.XPATH, using ="//a[@id='login']")
	WebElement btnLogin;
	@FindBy (how =How.XPATH, using ="//span[@class='_17OD2T5uhxYRT6atZy_yA7 hpa5gnmuOMPuH0E31USHp']")
	List <WebElement> cntrlGirisSayfa;
	@FindBy (how =How.XPATH, using ="//input[@id='txtUserName']")
	WebElement txtUserName;
	@FindBy (how =How.XPATH, using ="//input[@id='txtPassword']")
	WebElement txtPassword;
	@FindBy (how =How.XPATH, using ="//button[@id='btnLogin']")
	WebElement btnLoginGirisi;
	@FindBy (how =How.XPATH, using ="//input[@placeholder='Ürün, kategori veya marka ara']")
	List <WebElement> cntrlAnaSayfa;
	
	
	//Test.123456789
	public PageHepsiBuradaAnaSayfa login () throws InterruptedException {
		
		lib.navigateTo(GetData.url);
		girisYap();
		return new PageHepsiBuradaAnaSayfa(lib);
	}
	
	public PageHepsiBuradaLogin girisYap() throws InterruptedException {
		lib.click(btnGiris);
		Thread.sleep(1000);
		lib.click(btnLogin);
		Thread.sleep(1000);
		lib.Control(lib.isElementExist(cntrlGirisSayfa), "Giriş Sayfası Kontrolü Başarılı", "Giriş Sayfası Kontrolü Başarısız !");
		lib.sendKeys(txtUserName, "testhepsiburada23@gmail.com");
		lib.sendKeys(txtPassword, "Test.123456789");
		lib.click(btnLoginGirisi);
		lib.Control(lib.isElementExist(cntrlAnaSayfa), "Giris Yapildi", "Giris Yapilamadi");
		
		return this;
		
	}
}