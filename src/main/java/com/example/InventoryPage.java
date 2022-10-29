package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

import javax.xml.xpath.XPath;

public class InventoryPage<select> {
    public InventoryPage (WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//button[@id='add-to-chart-sauce-labs-backpack']")
    private static WebElement clickButtonIndexI;

    @FindBy (xpath = "select[@class='product_sort_container']")
    private static WebElement productshort;





    

        
    }



