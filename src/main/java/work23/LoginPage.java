package work23;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class LoginPage {

    @Step("Вводим логин")
    public LoginPage loginInput(String setlogin) {
        $(By.name("username")).clear();
        $(By.name("username")).sendKeys(setlogin);
        return this;

    }

    @Step("Вход в систему под учетной записью demo/demo")
    public LoginPage passwordInput(String password) {

        $(By.name("password")).clear();
        $(By.name("password")).setValue(password);
        return this;
    }
    @Step("Нажимаем войти")
    public LoginPage loginButton() {
        $(By.id("login-button")).click();
        return this;
    }

    @Step("Проверяем что страница соотвествует нужной")
    public LoginPage verificationTitile(String expectedTitle) {
        Assert.assertEquals(getWebDriver().getTitle(),expectedTitle);
        return this;
    }

}
