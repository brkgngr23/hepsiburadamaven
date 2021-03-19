package com.hepsiburada.pages.selenium.hepsiburada;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.hepsiburada.commons.selenium.HepsiBuradaCommons;
import com.hepsiburada.utility.log;

public class PageHepsiBuradaSepetim {
	HepsiBuradaCommons lib;
	
public PageHepsiBuradaSepetim(HepsiBuradaCommons lib) {
	this.lib=lib;
	PageFactory.initElements(this.lib.driver, this);
		
}

@FindBy (how =How.XPATH, using ="//div[contains(@class,'col lg-4')]//ul")
List <WebElement> cntrlUrunDetay;
@FindBy (how =How.XPATH, using ="//h3[@class='product-title title'][contains(text(),'Huawei P20 Lite 64 GB (')]")
WebElement txtSozGezdiginizUrunFirst;
@FindBy (how =How.XPATH, using ="//h3[contains(text(),'Samsung Galaxy Tab A 8 S')]")
WebElement txtSozGezdiginizUrunSecond;
@FindBy (how =How.XPATH, using ="//h3[contains(text(),'iPhone 11 64 GB')]")
WebElement txtSozGezdiginizUrunLast;

public PageHepsiBuradaSepetim SonGezdiginizUrunlerKarsilastir(String UrunAdiFirst, String UrunAdiSecond,String UrunAdiLast) {
	String IlkUrun=lib.getTextOfElement(txtSozGezdiginizUrunFirst);
	String[] parts=IlkUrun.split("\\(");
	String ilkUrun = parts[0];
	if(UrunAdiFirst.contains(ilkUrun)) {
		log.info(IlkUrun +"'un Son gezdiginiz Urunlerdeki kontrolu basarili");
		}
	else {
		log.info("Urun kontrolu basarisiz");
	}
	
	String SecondUrun=lib.getTextOfElement(txtSozGezdiginizUrunSecond).split("\\.")[0];
	if(UrunAdiSecond.contains(SecondUrun)) {
		log.info(SecondUrun +"'un Son gezdiginiz Urunlerdeki kontrolu basarili");
		}
	else {
		log.info("Urun kontrolu basarisiz");
	}
	
	String LastUrun=lib.getTextOfElement(txtSozGezdiginizUrunLast);
	if(UrunAdiLast.contains(LastUrun)) {
		log.info(LastUrun +"'un Son gezdiginiz Urunlerdeki kontrolu basarili");
		}
	else {
		log.info("Urun kontrolu basarisiz");
	}
	
	
	return this;
}

}