package StepObject;

import PageObject.BookingPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import javax.print.attribute.standard.Destination;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class BookingSteps extends BookingPage {
    @Step("Choose destination")
    public BookingSteps ChooseDestination(String Destination){
        destination.setValue(Destination);
        return this;
    }
    @Step("Click checkin button")
    public BookingSteps Checkinbtn(){
        date.click();
        return this;
    }
    public void Selectdate(){
     String currentdate=$(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[1]/div[2]/div[1]/div/div/ul/li[1]/div/h2")).getText();
        String expecteddate="November 2021";
        if (currentdate.equals(expecteddate)){
            System.out.println("Month is already selected");
        }else{
            for (int i=1;1<12;i++){
                nextbtn.click();
                if (expecteddate.equals(currentdate)){
                    System.out.println("Month is selected");
                    break;
                }
            }
        }
    }
    @Step("Select date")
    public BookingSteps selectdate(){
        Selectdate();
        return this;
    }
    @Step("Click checkout button")
    public BookingSteps Checkoutbtn(){
        checkoutbtn.click();
        return this;
    }
    @Step("Select more options")
    public BookingSteps Guestsbtn(){
        guests.click();
        return this;
    }
    @Step("Add number of adults")
    public BookingSteps AddNumberOfAdults(){
        addadultsquantity.click();
        return this;
    }
    @Step("Add number of children")
    public BookingSteps AddNumberOfChildren(){
        addchildren.click();
        return this;
    }
    @Step("Checking if age of children section is visible")
    public BookingSteps AgeOFChildrenSection(){
        Assert.assertTrue($("._2v9X4l").is(Condition.visible));
        return this;
    }
    @Step("Select children age")
    public BookingSteps SelectAge(){
        selectage.click();
        return this;
    }
    @Step("Add more room")
    public BookingSteps AddRoom(){
        addaroom.click();
        return this;
    }
    @Step("Delete added room")
    public BookingSteps DeleteRoom(){
        deletearoom.click();
        deletearoom.waitUntil(Condition.disappear,1000);
        return this;
    }
    @Step("Search information within selected options")
    public BookingSteps SearchInformation(){
        searchbtn.click();
        return this;
    }



}
