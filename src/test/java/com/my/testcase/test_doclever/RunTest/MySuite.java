package com.my.testcase.test_doclever.RunTest;

import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;

import com.report.html.GlobleHtmlFile;
import com.report.html.HtmlFile;
import com.report.html.HtmlUtil;

public class MySuite extends Suite {
	
	

	protected MySuite(Class<?> klass, Class<?>[] suiteClasses) throws InitializationError {
		super(klass, suiteClasses);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public void run(final RunNotifier notifier) {
		System.out.println("aaa");
		GlobleHtmlFile.createLog("d:\\test11.html");
		super.run(notifier);
		GlobleHtmlFile.closeLog();
		System.out.println("bbb");
	}


}
