package com.hepsiburada.pages.selenium.hepsiburada;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.hepsiburada.commons.selenium.HepsiBuradaCommons;

public class PageHepsiBuradaAnaSayfa {
	HepsiBuradaCommons lib;
	
public PageHepsiBuradaAnaSayfa(HepsiBuradaCommons lib) {
	this.lib=lib;
	PageFactory.initElements(this.lib.driver, this);
		
}

@FindBy (how =How.XPATH, using ="//input[@placeholder='Ürün, kategori veya marka ara']")
WebElement txtUrunAra;
@FindBy (how =How.XPATH, using ="//div[@class='SearchBoxOld-buttonContainer']")
WebElement btnUrunAra;
@FindBy (how =How.XPATH, using ="//a[contains(text(),'Çok satanlar')]")
List <WebElement> cntrlUrunlerPage;
@FindBy (how =How.XPATH, using ="//span[@id='shoppingCart']")
WebElement btnSepetim;

public PageHepsiBuradaUrunler UrunArama(String UrunAdi) throws InterruptedException {
	Thread.sleep(2000);
	lib.sendKeys(txtUrunAra,UrunAdi);
	lib.click(btnUrunAra);
	lib.Control(lib.isElementExist(cntrlUrunlerPage), "Urun Aramasi Yapildi", "Urun Aramasi Yapilamadi");
	return new PageHepsiBuradaUrunler(lib);
}

public PageHepsiBuradaSepetim Sepetim() {
	lib.click(btnSepetim);
	return new PageHepsiBuradaSepetim(lib);
}
}

