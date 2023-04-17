package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests extends TestBase {
    @Test
    @DisplayName("Check that bla bla bla")
    void koko() {
        mainPage
                .openPage()
                .isOpen()
                .enterValue("HELLO WORLD")
                .pressEnter();
        searchPage
                .isOpen()
                .checkSearchInputFieldHasValue("HELLO WORLD");
    }
}
