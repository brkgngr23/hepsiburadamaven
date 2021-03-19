package selenium.hepsiburada;

import org.testng.annotations.Test;

import com.hepsiburada.pages.selenium.hepsiburada.HepsiBurada;

public class HepsiBuradaLoginTest extends HepsiBurada {

@Test
public void HepsiBurada_Login() throws InterruptedException {
	startTest().login().UrunArama("Iphone 11")
	.UrunSec()
	.UrunArama("Samsung Galaxy Tab A 8 SM-T290 32GB Tablet Gümüş")
	.UrunSec()
	.UrunArama("Huawei P20 Lite 64 GB (İthalatçı Garantili)")
	.UrunSec()
	.Sepetim()
	.SonGezdiginizUrunlerKarsilastir("Huawei P20 Lite 64 GB (İthalatçı Garantili)", "Samsung Galaxy Tab A 8 SM-T290 32GB Tablet Gümüş", "iPhone 11 64 GB");
}

}