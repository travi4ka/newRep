package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchPage {
    private SelenideElement searchInputField = $("textarea[name='q']");
    private SelenideElement picturesLink = $x("//a[text()='Картинки']");
    private SelenideElement picturesLink2 = $$("a").findBy(exactText("Картинки"));

    @Step("Page is open")
    public SearchPage isOpen() {
        picturesLink.shouldBe(visible);
        picturesLink2.shouldBe(visible);
        return this;
    }

    @Step("Check that input field has value {0}")
    public SearchPage checkSearchInputFieldHasValue(String value) {
        searchInputField.shouldHave(exactTextCaseSensitive(value));
        return this;
    }

}
