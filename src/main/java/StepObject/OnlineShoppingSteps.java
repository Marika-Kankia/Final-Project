package StepObject;

import DataObject.OnlineShoppingData;
import PageObject.OnlineShoppingPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import static DataObject.OnlineShoppingData.*;

public class OnlineShoppingSteps extends OnlineShoppingPage {
    @Step("Choose category")
    public OnlineShoppingSteps ChooseCategory(){
        chooseCategory.click();
        return this;
    }
    @Step("Choose item")
    public OnlineShoppingSteps ChooseItem(){
        chooseItem.click();
        return this;
    }
    @Step("Add Item to the list to compare")
    public OnlineShoppingSteps addToCompare(){
        addtoCompare.click();
        return this;
    }
    @Step("Go to the Items list")
    public OnlineShoppingSteps GoToItemsList(){
        countCompare.click();
        return this;
    }
    @Step("Choose second other category")
    public OnlineShoppingSteps ChooseSecondCategory(){
        chooseSecondCategory.click();
        return this;
    }
    @Step("Choose second other item")
    public OnlineShoppingSteps ChooseSecondItem(){
        chooseSecondItem.click();
        return this;
    }
    @Step("Choose another category")
    public OnlineShoppingSteps ChooseAnotherCategory(){
        chooseAnotherCategory.click();
        return this;
    }
    @Step("Choose another item")
    public OnlineShoppingSteps ChooseAnotherItem(){
        chooseAnotherItem.click();
        return this;
    }
    @Step("Show the list of items")
    public OnlineShoppingSteps ListOfItems(){
        listOfItemstoCompare.click();
        return this;
    }
    @Step("Show 'დაამატე პროდუქტები იგივე კატეგორიაში შესადარებლად' message")
    public OnlineShoppingSteps ShowMessage(){
        showMessage.is(Condition.visible);
        return this;
    }
    @Step("Check if it's necessary section")
    public OnlineShoppingSteps Itemssectionvisibility(){
        Assert.assertFalse(compareitemssection.is(Condition.visible));
        return this;
    }
    @Step("Delete selected items")
    public OnlineShoppingSteps DeleteItem(){
        deleteItem.click();
        deleteItem.waitUntil(Condition.disappear,1000);
        return this;
    }
    @Step("Fill search input ")
    public OnlineShoppingSteps SearchItem(){
        searchItem.setValue(Item);
        return this;
    }
    @Step("Click search button")
    public OnlineShoppingSteps ClickSearchButton(){
        clickSearchButton.click();
        return this;
    }
    @Step("Select any item")
    public OnlineShoppingSteps SelectItem(){
        selectItem.click();
        return this;
    }
    @Step("Add item to the cart")
    public OnlineShoppingSteps AddToCart(){
        AddToCart.click();
        return this;
    }
    @Step("Click to the cart button")
    public OnlineShoppingSteps ClickTheCart(){
        clickToThecart.click();
        return this;
    }
    @Step("Go to the cart")
    public OnlineShoppingSteps GoToCart(){
        gotoTheCart.click();
        return this;
    }
    @Step("Add offered item")
    public OnlineShoppingSteps AddOfferedItem(){
        addOfferedItem.click();
        return this;
    }
    @Step("Increase number of item")
    public OnlineShoppingSteps IncrementOperator(){
        incrementOperator.click();
        return this;
    }
    @Step("Decrease number of item")
    public OnlineShoppingSteps DecrementOperator(){
        decrementOperator.click();
        return this;
    }
    @Step("Remove First Item")
    public OnlineShoppingSteps RemoveFirstItem(){
        removeFirstItem.click();
        return this;
    }
    @Step("Remove second item")
    public OnlineShoppingSteps RemoveSecondItem(){
        removeSecondItem.click();
        return this;
    }
    @Step("Scroll up")
    public OnlineShoppingSteps ScrollUp(){
        scrollUp.click();
        return this;
    }
    public OnlineShoppingSteps Activebtn(){
        activebtn.waitUntil(Condition.visible,3000);
        return this;
    }
    @Step("Check if the message 'თქვენი კალათა ამჟამად ცარიელია' is visible")
    public OnlineShoppingSteps CartEmptyMessage(){
        cartEmptyMessage.is(Condition.visible);
        return this;
    }
    @Step("Show item's all charasteristic")
    public OnlineShoppingSteps ShowAllCharasteristic(){
        allCharacteristic.click();
        return this;
    }
    @Step("Request photo or video resource")
    public OnlineShoppingSteps RequestPhotoOrVideo(){
        requestPhotoOrVideo.click();
        return this;
    }
    public OnlineShoppingSteps RequestMessage(){
        requestMessage.is(Condition.visible);
        return this;
    }
    @Step("Select one of the visual options")
    public OnlineShoppingSteps SelectVisualOption(){
        photo.click();
        return this;
    }
    @Step("Select where we want to receive this visual resource")
    public OnlineShoppingSteps SelectContactOption(){
        contactOption.click();
        return this;
    }
    @Step("FIll firstname and lastname inputs,Value:{0}")
    public OnlineShoppingSteps InsertFirstNameAndLastname(){
        firstNameAndlastName.setValue(firstNameandlastName);
        return this;
    }
    @Step("Insert mobile number")
    public OnlineShoppingSteps InsertMobileNumber(){
        mobileNumber.setValue(OnlineShoppingData.mobileNumber);
        return this;
    }
    @Step("Send request")
    public OnlineShoppingSteps SendRequest(){
        sendRequest.click();
        return this;
    }
    public OnlineShoppingSteps WarningMessage(){
        warningMessage.is(Condition.visible);
        return this;
    }
}
