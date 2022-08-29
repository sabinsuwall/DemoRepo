package com.qa.util;

public class TestUtil {

	public void testUtil() {
		System.out.println("Test Util");
	}
	public WebElement getElement (By locator) {
		return driver.findElement(locator);
	}
}
