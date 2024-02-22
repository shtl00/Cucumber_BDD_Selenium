package org.example;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.example.driver.DriverManager;

public class Hooks {
    DriverManager driverManager=new DriverManager();


    @Before
    public void setUpMethod() throws IllegalAccessException {
        driverManager.runOnLocalBrowser();
        //driverManager.runInHeadlessBrowser();
        driverManager.maxBrowser();
        driverManager.openUrl();
        driverManager.applyImplicitWait();

    }
    @After
    public void tearDownMethod(Scenario scenario) throws InterruptedException {
        if (scenario .isFailed()){
            driverManager.takeScreenshot(scenario);
        }
        driverManager.sleepBrowser(5000);
        driverManager.closeBrowser();



    }
}
