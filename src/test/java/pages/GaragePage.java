package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class GaragePage extends BasePage {
    SelenideElement addCarBtn = $(".btn-primary");
    SelenideElement carBrandId = $("#addCarBrand");
    SelenideElement carModelId = $("#addCarModel");
    SelenideElement milleageValue = $("#addCarMileage");
    SelenideElement addBtn = $x("//button[text()='Add']");

    public GaragePage addCar(String brand, String model, Double mileage){
        addCarBtn.click();
        carBrandId.click();
        carBrandId.sendKeys(brand);
        carModelId.click();
        carModelId.sendKeys(model);
        milleageValue.click();
        String mil = mileage == null ? "" : mileage.toString();
        milleageValue.setValue(mil);
        addBtn.click();
//        $(".btn-primary").shouldHave(Condition.exactText("Add")).click();


        return this;
    }
}
