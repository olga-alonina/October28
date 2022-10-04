package com.dotdash.pages;

import com.dotdash.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicContentPage {
    public DynamicContentPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ":nth-child(1) > .large-10")
    public WebElement firstElement;
}
