package com.my.testcase.test_doclever.RunTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.my.testcase.test_doclever.setting.SettingCases;

@RunWith(MySuite.class)
@SuiteClasses({SettingCases.class})
public class AllTests {

}
