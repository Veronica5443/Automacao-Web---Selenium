package maps;

import org.openqa.selenium.By;

public class productCartMaps {
	public By productInCart(String product) {
		return By.xpath("//h3[text()='" + product + "']/../../..//input");
	}
}
