package tests;

import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class Base {
    @BeforeEach
    void openURL() {
    open("https://xn--80afcdbalict6afooklqi5o.xn--p1ai/identity/account/login");
    }
}
