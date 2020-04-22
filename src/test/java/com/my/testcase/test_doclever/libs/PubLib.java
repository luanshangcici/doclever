package com.my.testcase.test_doclever.libs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import com.my.testcase.test_doclever.setting.SettingObjectStore;

public class PubLib {

	private WebDriver driver;
	// private PubObjectStore pubObjectStore;

	public static By parseObject(String p_object) {
		String newObject = null;

		if (p_object.startsWith(".//") || p_object.startsWith("//")) { // ����selenium ide xpath��ʶ��
			return By.xpath(p_object);
		} else if (p_object.startsWith("link=") || p_object.startsWith("Link=")) {
			newObject = p_object.substring(p_object.indexOf("=") + 1); // ��ȡ=�������е��ַ���       
			return By.linkText(newObject);
		} else if (p_object.startsWith("xpath=")) {
			newObject = p_object.substring(p_object.indexOf("=") + 1);
			return By.xpath(newObject);
		} else if (p_object.startsWith("id=")) {  
			newObject = p_object.substring(p_object.indexOf("=") + 1);
			return By.id(newObject);
		} else if (p_object.startsWith("css=")) {
			newObject = p_object.substring(p_object.indexOf("=") + 1);
			return By.cssSelector(newObject);
		} else if (p_object.startsWith("class=")) {
			newObject = p_object.substring(p_object.indexOf("=") + 1);
			return By.className(newObject);
		} else if (p_object.startsWith("tagName=")) {
			newObject = p_object.substring(p_object.indexOf("=") + 1);
			return By.tagName(newObject);
		} else if (p_object.startsWith("name=")) {
			newObject = p_object.substring(p_object.indexOf("=") + 1);
			return By.name(newObject);
		} else
			return null;

	}

	public void login(WebDriver p_driver, String p_user, String p_pwd) throws InterruptedException {

		driver = p_driver;

		driver.findElement(parseObject(PubObjectStore.LOGIN_LINK)).click();
		driver.findElement(parseObject(PubObjectStore.LOGIN_USER)).clear();
		driver.findElement(parseObject(PubObjectStore.LOGIN_USER)).sendKeys(p_user);
		driver.findElement(parseObject(PubObjectStore.LOGIN_PWD)).clear();
		driver.findElement(parseObject(PubObjectStore.LOGIN_PWD)).sendKeys(p_pwd);
		driver.findElement(parseObject(PubObjectStore.LOGIN_BTN)).click();

		Thread.sleep(5000);
	}

	public void logout(WebDriver p_driver) throws InterruptedException {
		driver = p_driver;
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(parseObject(PubObjectStore.USER_LINK))).perform();
		Thread.sleep(1000);
		driver.findElement(parseObject(PubObjectStore.LOGOUT_BTN)).click();
		Thread.sleep(5000);

	}

}
