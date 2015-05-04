package com.tk;

import com.tk.requirements.Application;
import com.tk.steps.StepsOnGoogle;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesRunner.class)
public class SearchByKeywordStoryTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public StepsOnGoogle steps;

    @ManagedPages
    Pages pages;

    @Test
    public void searching_by_keyword() {
        steps.openGoogle();
        steps.searchWord("test");

    }

}