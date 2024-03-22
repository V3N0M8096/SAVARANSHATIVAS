package com.savaransh.pom;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HomePage {
	@Test
	public class CustomerModule {
		@Test(groups= {"regressiontest","smoketest"})
		public void createCustomer()
		{
			Reporter.log("CreateCustomer",true);
		}

}
}
