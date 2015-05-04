package com.tk.pages.gmail;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by taras_krysiuk on 04.05.15.
 */
@DefaultUrl("http://www.google.com")
public class GoogleHomePage extends PageObject {

    @FindBy(name = "q")
    private WebElement inputField;

    @FindBy(name = "btnG")
    private WebElement submitButton;

    @FindBy(id = "gb_70")
    private WebElement loginButton;

    public  GoogleHomePage(WebDriver driver){
        super(driver);
    }

    public void setInputField(String query){
        enter(query).into(inputField);
    }

    public void clickSubmitSearch(){
        clickOn(submitButton);
    }

    public void clickOnLoginButton(){
        clickOn(loginButton);
    }
}
