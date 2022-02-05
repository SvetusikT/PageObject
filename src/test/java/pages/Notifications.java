package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class Notifications {

    public void shouldHaveText(String text) {
        $(".alert").shouldHave(Condition.text(text));
    }
    public void shouldHaveText2(String text) {
        $(".alert-list").shouldHave(Condition.text(text));
    }
    public void shouldHaveURL(String url) {webdriver().shouldHave(url(url));}
}
