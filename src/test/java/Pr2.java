import Chrome.Chromrunner2;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.impl.WebElementSelector;
import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Assert;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
public class Pr2 extends Chromrunner2 {
    @Test(priority = 0)
    public void case3(){
        $(byAttribute("name","q-destination")).setValue("Paris,France");
        $("._1ZtnNu").click();
        String ExpectedMonth="November 2021";
        String CurrentMonth=$(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[1]/div[2]/div[1]/div/div/ul/li[1]/div/h2")).getText();
        if (CurrentMonth.contains(ExpectedMonth)){
            System.out.println("Month is already selected");
        }
        else{
            for(int i=1;i<12;i++){
                $(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[1]/div[2]/div[1]/div/div/button[2]")).click();
                ExpectedMonth="January 2022";
                CurrentMonth=$(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[1]/div[2]/div[1]/div/div/ul/li[1]/div/h2")).getText();
                if (ExpectedMonth==CurrentMonth){
                    System.out.println("Month is selected");
                    break;
                }
            }
        }
        $(byText("Guests")).click();
        $("._1wp43W",0).click();
        $(".ZHPFu2",0).click();
        $("._1wp43W",1).click();
        Assert.assertTrue($("._2v9X4l").is(Condition.visible));
        $(".ZHPFu2",1).click();
        $(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[2]/div[2]/div[1]/div/div[2]/button")).click();
        $("._1wp43W",2).click();
        $(".ZHPFu2",2).click();
        $("._1wp43W",3).click();
        $(".ZHPFu2",3).click();
        $(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[1]/button")).click();
        sleep(1000);
        $("._3pFoIe",1).click();
        sleep(1000);
        $("._1GKI32",0).click();
        $(byText("Stars (low to high)")).click();
        $("._1GKI32",1).click();
        $(byAttribute("value","DISTANCE_FROM_LANDMARK:504261")).click();
        $("._1GKI32",2).click();
        $(byText("Price (low to high)")).click();
//        $(By.id("2")).waitUntil(Condition.visible,3000);
        sleep(3000);
        $(By.id("2")).click();
        switchTo().window(1);
        $(byText("Choose room")).waitUntil(Condition.visible,3000);
        $(byText("Choose room")).click();
        $(byXpath("//*[@id=\"roomsAndRates2\"]/section/ul/li[1]/div/div[1]/div[2]/div[2]/button")).waitUntil(Condition.enabled,2000);
        $(byXpath("//*[@id=\"roomsAndRates2\"]/section/ul/li[1]/div/div[1]/div[2]/div[2]/button")).click();
        $(byXpath("//*[@id=\"modal-panel-room-property-information13-0\"]/section/div/section/div/div/button[3]")).waitUntil(Condition.enabled,1000);
        $(byXpath("//*[@id=\"modal-panel-room-property-information13-0\"]/section/div/section/div/div/button[3]")).click();
        $(byXpath("//*[@id=\"modal-panel-room-property-information13-0\"]/header/button")).waitUntil(Condition.enabled,1000);
        $(byXpath("//*[@id=\"modal-panel-room-property-information13-0\"]/header/button")).click();
        $(byXpath("//*[@id=\"roomsAndRates2\"]/section/ul/li[1]/div/div[2]/ul/li[2]/div/div[3]/button")).waitUntil(Condition.enabled,2000);
        $(byXpath("//*[@id=\"roomsAndRates2\"]/section/ul/li[1]/div/div[2]/ul/li[2]/div/div[3]/button")).click();
        $(byXpath("//*[@id=\"modal-panel-price-breakdown14-0\"]/header/button")).waitUntil(Condition.enabled,1000);
        $(byXpath("//*[@id=\"modal-panel-price-breakdown14-0\"]/header/button")).click();
        $(byXpath("//*[@id=\"roomsAndRates2\"]/section/ul/li[1]/div/div[2]/ul/li[2]/div/div[3]/form/button")).waitUntil(Condition.enabled,2000);
        $(byXpath("//*[@id=\"roomsAndRates2\"]/section/ul/li[1]/div/div[2]/ul/li[2]/div/div[3]/form/button")).click();

    }
    @Test(priority = 1)
    public void case4(){


    }


}
