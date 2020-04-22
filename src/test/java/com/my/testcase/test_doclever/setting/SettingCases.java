package com.my.testcase.test_doclever.setting;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.lowagie.text.pdf.PdfPublicKeyRecipient;
import com.my.testcase.test_doclever.libs.PubLib;

public class SettingCases {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  
  PubLib pb= new PubLib();
  SettingLib sb = new SettingLib();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test01() throws Exception {
    driver.get("http://www.doclever.cn/controller/index/index.html");
    
    
    pb.login(driver, "roadtester", "123456");
    isElementPresent(PubLib.parseObject(SettingObjectStore.USER_LINK));
    
    sb.settingInfo(driver, "p_file", "2", "女", "22", "222", "2222", "22222");
    
    
    pb.logout(driver);
  } 
  
  @Test
  public void test02() throws Exception {
	    driver.get("http://www.doclever.cn/controller/index/index.html");
	    
	    
	    pb.login(driver, "roadtester", "123456");
	    isElementPresent(PubLib.parseObject(SettingObjectStore.USER_LINK));
	    
	    sb.settingInfo(driver, "p_file", "2", "女", "22", "222", "2222", "22222");
	    
	    
	    pb.logout(driver);
	  }
  
  @Test
  public void test03() throws Exception {
    driver.get("http://www.doclever.cn/controller/index/index.html");
    
    
    pb.login(driver, "roadtester", "123456");
    isElementPresent(PubLib.parseObject(SettingObjectStore.USER_LINK));
    
    sb.settingInfo(driver, "p_file", "2", "女", "22", "222", "2222", "22222");
    
    
    pb.logout(driver);
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
