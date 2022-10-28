package com.dotdash.step_definitions;

import com.dotdash.utilities.ConfigurationReader;
import com.dotdash.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.*;

import static com.dotdash.utilities.methods.click_on;

public class Steps{
    @When("user click on {string} button")
    public void user_click_on_button(String nameButton) {
       Driver.get().get(ConfigurationReader.getProperty("baseUrl"));
        click_on(nameButton);
    }

    @When("user adds {string} number of elements")
    public void user_adds_number_of_elements(String numberOfClicks) {
        int num = Integer.parseInt(numberOfClicks);
        for (int i = 0; i < num; i++) {
            click_on("add element");
        }
    }

    @Then("asserts that {string} number of elements exist on the page")
    public void asserts_that_number_of_elements_exist_on_the_page(String amountElements) {
        int amount = Integer.parseInt(amountElements);
        List<WebElement> deleteMe = Driver.get().findElements(By.cssSelector("[onclick=\"deleteElement()\"]"));
        Assert.assertEquals(deleteMe.size(), amount);
    }
}