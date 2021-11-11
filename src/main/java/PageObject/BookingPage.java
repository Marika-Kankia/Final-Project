package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class BookingPage {
    protected SelenideElement
    destination=$(byAttribute("name", "q-destination")),
    date=$("._1ZtnNu"),
    currentmonth=$(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[1]/div[2]/div[1]/div/div/ul/li[1]/div/h2")),
    nextbtn=$(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[1]/div[2]/div[1]/div/div/button[2]")),
    selectday=$(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[1]/div[2]/div[1]/div/div/ul/li[1]/div/table/tbody/tr/td[contains(text(),'\"+date+\"')]\"")),
    checkoutbtn=$("._1yFrqc._1RdfF-"),
    checkoutdate=$(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[1]/div[2]/div[1]/div/div/ul/li[1]/div/table/tbody/tr[4]/td[7]/button")),
    guests=$(byText("Guests")),
    addadultsquantity=$("._1wp43W", 0),
    addchildren=$("._1wp43W", 1),
    ageofchildsection=$("._2v9X4l"),
    selectage=$(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[2]/div[2]/div[1]/div/div[2]/div/div[3]/div/div/select")),
    addaroom=$(".uolsaJ.WxdyDo"),
    deletearoom=$("._23Lf5I._3ZW5IO", 4),
    searchbtn=$(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[3]/button"));


}
