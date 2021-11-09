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
    @Test
    public void case3(){
        $(byAttribute("name","q-destination")).setValue("Paris,France");
        $("._1ZtnNu").click();
        String ExpectedMonth="November 2021";
        String CurrentMonth=$(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[1]/div[2]/div[1]/div/div/ul/li[1]/div/h2")).getText();
        if (CurrentMonth.contains(ExpectedMonth)){
            System.out.println("Month is already selected");
        }
        else{
            while(CurrentMonth.contains(ExpectedMonth)){
                $(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[1]/div[2]/div[1]/div/div/button[2]")).click();
            }
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
        $("._2U8Hy7",1).click();
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
        $("._3pFoIe",1).click();
        sleep(3000);
        $("._1GKI32",0).click();
        $(byText("Stars (low to high)")).click();
        $("._1GKI32",1).click();
        $(byAttribute("value","DISTANCE_FROM_LANDMARK:504261")).click();
        $("._1GKI32",2).click();
        $(byText("Price (low to high)")).click();
        $(".-RcIiD",0).click();
        sleep(3000);
//        $("._2GE5Xq",1).

    }
    @Test
    public void case4(){

    }


}
