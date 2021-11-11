import Chrome.Chromrunner2;
import StepObject.BookingSteps;
import com.codeborne.selenide.*;
import com.codeborne.selenide.impl.WebElementSelector;
import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Assert;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


import javax.print.attribute.standard.Destination;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
public class Pr2 extends Chromrunner2 {
    private Object Destination;

    @Test(priority = 0)
    public void case3() {
        BookingSteps steps = new BookingSteps();
        steps
                .ChooseDestination("Paris,France")
                .Checkinbtn()
                .selectdate()
                .Checkoutbtn()
                .selectdate()
                .Guestsbtn()
                .AddNumberOfAdults()
                .AddNumberOfChildren()
                .SelectAge()
                .AgeOFChildrenSection()
                .AddRoom()
                .DeleteRoom()
                .SearchInformation();

    }

    //        $(byAttribute("name", "q-destination")).setValue("Paris,France");
//        $("._1ZtnNu").click();
//        String ExpectedMonth = "November 2021";
//        String date="27";
//        String CurrentMonth = $(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[1]/div[2]/div[1]/div/div/ul/li[1]/div/h2")).getText();
//        if (CurrentMonth.contains(ExpectedMonth)) {
//            System.out.println("Month is already selected");
//        } else {
//            for (int i = 1; i < 12; i++) {
//                $(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[1]/div[2]/div[1]/div/div/button[2]")).click();
//                ExpectedMonth = "November 2021";
//                CurrentMonth = $(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[1]/div[2]/div[1]/div/div/ul/li[i]/div/h2")).getText();
//                if (CurrentMonth.contains(ExpectedMonth)) {
//                    System.out.println("Month is selected");
//                    break;
//                }
//            }
//            $(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[1]/div[2]/div[1]/div/div/ul/li[1]/div/table/tbody/tr/td[contains(text(),'\"+date+\"')]\"")).click();
//        }
//
//        $("._1yFrqc._1RdfF-").click();
//        $(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[1]/div[2]/div[1]/div/div/ul/li[1]/div/table/tbody/tr[4]/td[7]/button")).click();
//        $(byText("Guests")).click();
//        $("._1wp43W", 0).click();
//        $("._1wp43W", 1).click();
//        Assert.assertTrue($("._2v9X4l").is(Condition.visible));
//        $(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[2]/div[2]/div[1]/div/div[2]/div/div[3]/div/div/select")).click();
//        $(".uolsaJ.WxdyDo").click();
//        $("._23Lf5I._3ZW5IO", 4).click();
//        $("._23Lf5I._3ZW5IO", 4).waitUntil(Condition.disappear,1000);
//        $(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[3]/button")).click();
//    }
    @Test(priority = 1)
    public void case4() {
        $(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[3]/button")).click();
        sleep(2000);
        List<SelenideElement> beforetest = $$("._3XSqn6");
        List<Double> beforetestlist = new ArrayList<>();
        for (SelenideElement p : beforetest) {
            beforetestlist.add(Double.valueOf(p.getText().replace("$", "")));
        }

        $("._1GKI32", 2).click();
        $(byText("Price (low to high)")).click();
        List<SelenideElement> aftertest = $$("._3XSqn6");
        List<Double> aftertestlist = new ArrayList<>();
        for (SelenideElement p : aftertest) {
            aftertestlist.add(Double.valueOf(p.getText().replace("$", "")));
        }
        Collections.sort(beforetestlist);
        Assert.assertEquals(beforetestlist, aftertestlist);
        sleep(1000);
        $(By.id("2")).waitUntil(Condition.appears, 5000);
        $(By.id("2")).click();
        switchTo().window(1);
        $(byText("Choose room")).waitUntil(Condition.visible, 3000);
        $(byText("Choose room")).click();
        sleep(1000);
        $(byXpath("//*[@id=\"roomsAndRates2\"]/section/ul/li[1]/div/div[1]/div[2]/div[2]/button")).waitUntil(Condition.visible, 2000);
        $(byXpath("//*[@id=\"roomsAndRates2\"]/section/ul/li[1]/div/div[1]/div[2]/div[2]/button")).click();
        $(byXpath("//*[@id=\"modal-panel-room-property-information13-0\"]/section/div/section/div/div/button[3]")).waitUntil(Condition.visible, 1000);

        SelenideElement buttonelement=$(byXpath("//*[@id=\"modal-panel-room-property-information13-0\"]/section/div/section/div/div/button[3]"));
        int i;
        for(i=0;i<=5;i++){
            buttonelement.click();
        }
        $(".modal-button.modal-button-close").waitUntil(Condition.appears, 2000);
        $(".modal-button.modal-button-close").click();
        $(byXpath("//*[@id=\"roomsAndRates2\"]/section/ul/li[1]/div/div[2]/ul/li[2]/div/div[3]/button")).waitUntil(Condition.enabled, 2000);
        $(byXpath("//*[@id=\"roomsAndRates2\"]/section/ul/li[1]/div/div[2]/ul/li[2]/div/div[3]/button")).click();
        $(byXpath("//*[@id=\"modal-panel-price-breakdown14-0\"]/header/button")).waitUntil(Condition.enabled, 1000);
        $(byXpath("//*[@id=\"modal-panel-price-breakdown14-0\"]/header/button")).click();
        $(byXpath("//*[@id=\"roomsAndRates2\"]/section/ul/li[1]/div/div[2]/ul/li[2]/div/div[3]/form/button")).waitUntil(Condition.enabled, 2000);
        $(byXpath("//*[@id=\"roomsAndRates2\"]/section/ul/li[1]/div/div[2]/ul/li[2]/div/div[3]/form/button")).click();

    }
}

