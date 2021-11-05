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
        $(byAttribute("name","q-destination")).setValue("Paris");
        $("._1ZtnNu").click();
        $("._2U8Hy7",1).click();
        $(byText("Guests")).click();
        $("._1wp43W",0).click();
        $(".ZHPFu2",0).click();
        $("._1wp43W",1).click();
        Assert.assertTrue($("._2v9X4l").is(Condition.visible));
        $(".ZHPFu2",1).click();
        $("._3pFoIe",1).click();
        sleep(3000);

    }
    @Test
    public void case4(){

    }


}
