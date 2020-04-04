package work23;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SmsConfirmationPage {
    @Step("Очищаем поле пароль и вводим новый")
    public SmsConfirmationPage otpCode (String otpCode) {
        $(By.name("otpCode")).clear();
        $(By.name("otpCode")).setValue(otpCode);
        return this;
    }

    @Step("Нажимаем кнопку войти")
    public SmsConfirmationPage inputButton () {
        $(By.xpath("//button[@id='login-otp-button']")).click();
        return this;
    }
}