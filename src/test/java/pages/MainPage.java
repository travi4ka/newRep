package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    private SelenideElement searchInputField = $("textarea[name='q']");

    @Step("Type any value")
    public MainPage enterValue(String value) {
        searchInputField.setValue(value);
        return this;
    }

    @Step("Open page")
    public MainPage openPage() {
        open("https://google.com");
        return this;
    }

    @Step("Page is open")
    public MainPage isOpen() {
        searchInputField.shouldBe(visible);
        return this;
    }

    @Step("Press enter")
    public MainPage pressEnter() {
        searchInputField.pressEnter();
        return this;
    }
}
