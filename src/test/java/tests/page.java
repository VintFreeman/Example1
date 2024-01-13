package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class page {
private final SelenideElement loginField = $(By.xpath("//input[@type='text']"));
public void inputData() {
    loginField.setValue("alexeygarmanov@inbox.ru");
    loginField.sendKeys(Keys.TAB);
    passwordField.setValue("Ghbdtn123");
}
private final SelenideElement passwordField = $(By.xpath("//input[@type='password']"));

public void pressEnter() {
    loginField.sendKeys(Keys.ENTER);
}
private final SelenideElement errorMessage = $(By.xpath("//span[@class='text-danger field-validation-error']"));
public void checkError() {
    errorMessage.shouldBe(Condition.visible);
}

}
