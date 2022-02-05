package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SideBar extends BasePage {
    static SelenideElement logoutBtnSB = $(".text-danger");

    public static SideBar logOutSB() {
        logoutBtnSB.click();
        return new SideBar();
    }
}
