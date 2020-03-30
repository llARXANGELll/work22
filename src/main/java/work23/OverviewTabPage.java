package work23;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class OverviewTabPage {

    public OverviewTabPage overviewButton() {
        $(By.id("bank-overview")).click();
        return  this;
    }

    public OverviewTabPage amountMoney () {
        $((By.xpath("//div[2]/div/div/span/span[normalize-space(@class='amount')]"))).shouldHave(text("2 718 764.83 ₽"));
        return this;
    }

    public OverviewTabPage myMoney () {
        $(By.className("my-assets")).waitWhile(text("Моих средств 2 936 972.64 ₽"),50);
        return this;
    }

}
