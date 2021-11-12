import Utils.ChromeRunner3;
import StepObject.OnlineShoppingSteps;
import com.sun.net.httpserver.Authenticator;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utils.TestLister.class)
public class Pr3 extends ChromeRunner3 {
    @Test(retryAnalyzer = Authenticator.Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("Compare items case")
    public void case5(){
        OnlineShoppingSteps steps=new OnlineShoppingSteps();
        steps
                .ChooseCategory()
                .ChooseItem()
                .addToCompare()
                .GoToItemsList()
                .Itemssectionvisibility()
                .ChooseSecondCategory()
                .ChooseSecondItem()
                .addToCompare()
                .Activebtn()
                .ListOfItems()
                .ShowMessage()
                .ChooseAnotherCategory()
                .ChooseAnotherItem()
                .addToCompare()
                .Activebtn()
                .ListOfItems()
                .DeleteItem();
    }

    @Test(retryAnalyzer = Authenticator.Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("Add item to the cart case")
    public void case6(){
        OnlineShoppingSteps steps=new OnlineShoppingSteps();
        steps
                .SearchItem()
                .ClickSearchButton()
                .SelectItem()
                .AddToCart()
                .ScrollUp()
                .ClickTheCart()
                .GoToCart()
                .AddOfferedItem()
                .IncrementOperator()
                .DecrementOperator()
                .RemoveFirstItem()
                .RemoveSecondItem()
                .CartEmptyMessage();
    }

    @Test(retryAnalyzer = Authenticator.Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("Request photo or video resources case")
    public void case7(){
        OnlineShoppingSteps steps=new OnlineShoppingSteps();
        steps
                .ChooseCategory()
                .ChooseItem()
                .ShowAllCharasteristic()
                .ScrollUp()
                .RequestPhotoOrVideo()
                .RequestMessage()
                .SelectVisualOption()
                .SelectContactOption()
                .InsertFirstNameAndLastname()
                .InsertMobileNumber()
                .SendRequest()
                .WarningMessage();
    }

}

