package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Header extends BasePage {
    static SelenideElement myProfileBtn = $("#userNavDropdown");
    static SelenideElement logoutBtn = $x("//button[text()='Logout']");

    public static Header logOut() {
        myProfileBtn.click();
        logoutBtn.click();
        return new Header();
    }
}
