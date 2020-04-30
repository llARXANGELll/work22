package work23;

import io.qameta.allure.Step;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class Work23Test {

    OverviewTabPage overviewTabPage = new OverviewTabPage();


    @Test
    public void oneTest() {
        open("https://idemo.bspb.ru/");
        LoginPage login = new LoginPage();
        login.verificationTitile("Интернет банк - Банк Санкт-Петербург")
                .loginInput("demo")
                .passwordInput("demo")
                .loginButton();

        SmsConfirmationPage smsConfirmationPage = new SmsConfirmationPage();
        smsConfirmationPage.smsCode("0000")
                .inputButtonCode();

        overviewTabPage.overviewButton()
                .amountMoney();

        overviewTabPage.myMoney();
    }
}
