package work23;

import io.qameta.allure.Step;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
@Test
public class Work23Test {

    @Step
    public void Login() {
        open("https://idemo.bspb.ru");
        LoginPage login = new LoginPage();
        login.loginInput("demo")
                .passwordInput("demo")
                .loginButton();

    }

    @Step
    public void SmsConfirmation() {
       SmsConfirmationPage smsConfirmationPage = new SmsConfirmationPage();
       smsConfirmationPage.otpCode("0000")
               .inputButton();
    }

    @Step
    public void OverviewTab() {
        OverviewTabPage overviewTabPage = new OverviewTabPage();
        overviewTabPage.overviewButton()
                .amountMoney()
                .myMoney();
    }


}
