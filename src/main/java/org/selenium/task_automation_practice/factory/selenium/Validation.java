package org.selenium.task_automation_practice.factory.selenium;

import org.testng.Assert;

public class Validation {

    public void validateText(String expected, String actual) {
        Assert.assertEquals(actual, expected);
    }

    public void notNull(String elemento) {
        Assert.assertNotNull(elemento);
    }
}
