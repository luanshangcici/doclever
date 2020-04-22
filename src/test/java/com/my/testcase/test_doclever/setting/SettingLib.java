package com.my.testcase.test_doclever.setting;



import com.my.testcase.test_doclever.libs.*;
import com.my.testcase.test_doclever.tools.RobotKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class SettingLib {
	
	private WebDriver driver;	
//	private PubLib pubLib;
//	private SettingObjectStore settingObjectStore;
	
	public void setInfo(WebDriver p_driver,String p_age,String p_sex,String p_company,String p_qq,String p_email,String p_phone) throws Exception {
		driver=p_driver;
		

		
		driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_TAB)).click();

	    Thread.sleep(1000);
	    
	    
	    Screen s = new Screen();
        try{
                s.click(SettingObjectStore.SIKULI_SETTING_PHOTO);
        }
        catch(FindFailed e){
                e.printStackTrace();
        }
        
        Thread.sleep(1000);
	    
		
       
		RobotKeyboard.getInstance().type(SettingObjectStore.SIKULI_SETTING_SHOWING);
		Thread.sleep(1000);
		RobotKeyboard.getInstance().typeKey("Tab", 2);
		Thread.sleep(1000);
		RobotKeyboard.getInstance().typeKey("Enter", 2);
		Thread.sleep(1000);
	    
	    driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_AGE)).clear();
	    driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_AGE)).sendKeys(p_age);
	    driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_SEX)).click();
	   
	    
	    if(p_sex=="女") 
	    {
		    driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_SEX_FEMALE)).click();
	    	
	    }else {
	    driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_SEX_MALE)).click();
	    }

	    driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_COMPANY)).clear();
	    driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_COMPANY)).sendKeys(p_company);
	    driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_QQ)).clear();
	    driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_QQ)).sendKeys(p_qq);
	    driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_EMAIL)).clear();
	    driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_EMAIL)).sendKeys(p_email);
	    driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_PHONE)).clear();
	    driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_PHONE)).sendKeys(p_phone);
	    driver.findElement(PubLib.parseObject(SettingObjectStore.SETTING_SAVE_BTN)).click();
	    Thread.sleep(5000);
	    
	    
	}

}
