package page;

import static constants.TimeOut.*;

import javax.management.monitor.StringMonitor;

import org.openqa.selenium.Keys;

import maps.HomeMaps;
import util.StringManager;

public class HomePage extends BasePage {
	private HomeMaps homeMaps = new HomeMaps();

	public void access_portal(String url) {
		navigate(url);
	}

	public void searchProduct(String product) {
		waitElement(homeMaps.searchProduct, MIN_SECONDS);
		sendKeys(getWebElement(homeMaps.searchProduct), product);
		sendKey(getWebElement(homeMaps.searchProduct), Keys.ENTER);
		waitElement(homeMaps.searchProduct, MIN_SECONDS);
	}

	public String getProductSearched() {
		String productSearched = StringManager.substringByRegex(getTextElement(homeMaps.productSearched),
				"(\\“|\\\")[^\\“\\”\\\"]+");
		productSearched = productSearched.substring(1, productSearched.length());
		return productSearched;
	}

	public void accessProduct(String product) throws Throwable {
		waitElement(homeMaps.productInSearchList(product), MIN_SECONDS);
		scrollToElement(homeMaps.productInSearchList(product));
		click(getWebElement(homeMaps.productInSearchList(product)));

	}
}
