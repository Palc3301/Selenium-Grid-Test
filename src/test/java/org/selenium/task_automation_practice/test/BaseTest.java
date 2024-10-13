package org.selenium.task_automation_practice.test;

import org.selenium.task_automation_practice.factory.selenium.BrowserService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BrowserService {

    @BeforeMethod
    public void abrirNavegador(){
        chromeDriverInit("http://www.automationpractice.pl/index.php");
    }

    @AfterMethod
    public void fecharNavegador(){
        quit();
    }
}