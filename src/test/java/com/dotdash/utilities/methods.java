package com.dotdash.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.io.File;
import java.util.Objects;

import static java.lang.Character.*;


public class methods {
    public static void click_on(String nameButton){
        switch (nameButton.toLowerCase()){
            case"add/remove elements":
                Driver.get().findElement(By.cssSelector("[href=\"/add_remove_elements/\"]")).click();
                break;
            case "add element":
                Driver.get().findElement(By.cssSelector("[onclick=\"addElement()\"]")).click();
        }
    }
}
