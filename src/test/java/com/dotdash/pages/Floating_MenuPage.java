package com.dotdash.pages;

import com.dotdash.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Floating_MenuPage {
    public Floating_MenuPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "menu")
    public WebElement floatingMenu;

    @FindBy(css = "[target='_blank']")
    public WebElement linkInBottom;
}
