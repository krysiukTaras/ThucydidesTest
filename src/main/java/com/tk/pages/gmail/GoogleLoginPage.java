package com.tk.pages.gmail;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

/**
 * Created by taras_krysiuk on 04.05.15.
 */
public class GoogleLoginPage extends PageObject {

    @FindBy(id = "Email")
    private WebElement emailField;

    @FindBy(id = "Passwd")
    private WebElement passwordField;

    @FindBy(id = "signIn")
    private WebElement loginButton;

    public void inputEmail(String email){
        enter(email).into(emailField);
    }

    public void inputPassword(String password){
        enter(password).into(passwordField);
    }

    public void clickLogin(){
        clickOn(loginButton);
    }
}
