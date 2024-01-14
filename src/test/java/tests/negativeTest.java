package tests;

import Pages.page;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class negativeTest extends Base {
    @Test
    @DisplayName("Проверка ввода неверного пароля")
void testWrongPassword() {
    page page = new page();
    page.inputData();
    page.pressEnter();
    page.checkError();


    }


}
