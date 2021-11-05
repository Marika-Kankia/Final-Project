import Chrome.ChromeRunner4;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Pr4 extends ChromeRunner4 {
    @Test
    public void case8(){
        $(By.xpath("//*[@id=\"root\"]/footer/div[4]/div/div[1]/button")).click();
        $(".img-upload").click();


        sleep(3000);
    }
}
