package com.hepsiburada.pages.selenium.hepsiburada;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.hepsiburada.commons.selenium.HepsiBuradaCommons;

public class PageHepsiBuradaUrunler {
	HepsiBuradaCommons lib;
	
public PageHepsiBuradaUrunler(HepsiBuradaCommons lib) {
	this.lib=lib;
	PageFactory.initElements(this.lib.driver, this);
		
}

@FindBy (how =How.XPATH, using ="//div[contains(@class,'col lg-4')]//ul")
List <WebElement> cntrlUrunDetay;
@FindBy (how =How.XPATH, using ="//li[1]//div[1]//a[1]")
WebElement btnUrunSec;

public PageHepsiBuradaAnaSayfa UrunSec() {
	lib.click(btnUrunSec);
	lib.Control(lib.isElementExist(cntrlUrunDetay), "Urun Secildi", "Urun Secilemedi");
	return new PageHepsiBuradaAnaSayfa(lib);
}

}