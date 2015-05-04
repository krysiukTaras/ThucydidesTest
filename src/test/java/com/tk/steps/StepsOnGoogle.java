package com.tk.steps;

import com.tk.pages.gmail.GoogleHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by taras_krysiuk on 04.05.15.
 */
public class StepsOnGoogle extends ScenarioSteps {


    GoogleHomePage homePage;

    public StepsOnGoogle(Pages pages){
        super(pages);
    }

    @Step
    public void openGoogle(){
        homePage.open();
    }

    @Step
    public void searchWord(String query){
        homePage.setInputField(query);
        homePage.clickSubmitSearch();
    }

}
