package com.my.testcase.test_doclever.setting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.my.testcase.test_doclever.libs.PubLib;

public class SettingLib {
	
	private WebDriver driver;	
	

	
	    
	  public void settingInfo(WebDriver p_driver,String p_file,String p_age,String p_sex,String p_company,String p_qq,String p_email,String p_phone){
			driver=p_driver;
			driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_TAB)).click();
			driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_AGE)).clear();
			driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_AGE)).sendKeys(p_age);;
            driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_SEX)).click();
           
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            if(p_sex.equals("男"))
               driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_SEX_MALE)).click();
            else
              driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_SEX_FEMALE)).click();
			
			driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_COMPANY)).clear();
			driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_COMPANY)).sendKeys(p_company);
			driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_QQ)).clear();
			driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_QQ)).sendKeys(p_qq);
			driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_EMAIL)).clear();
			driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_EMAIL)).sendKeys(p_email);
			driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_PHONE)).clear();
			driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_PHONE)).sendKeys(p_phone);
			//driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_PHOTO)).sendKeys(p_file);	
			driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_SAVE_BTN)).click();
		   
		    try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     	
		
	}
	  
	  public void logout(WebDriver p_driver){
		  driver=p_driver;
		  driver.findElement(PubLib.parseObject(ObjectStore.HOMEPAGE_USER)).click();
		  driver.findElement(PubLib.parseObject(ObjectStore.LOGOUT_LINK)).click();  
		  try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
		}
	

}
