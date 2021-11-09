package StepObject;

import DataObject.OnlineShoppingData;
import PageObject.OnlineShoppingPage;
import com.codeborne.selenide.Condition;

import static DataObject.OnlineShoppingData.*;

public class OnlineShoppingSteps extends OnlineShoppingPage {
    public OnlineShoppingSteps ChooseCategory(){
        chooseCategory.click();
        return this;
    }
    public OnlineShoppingSteps ChooseItem(){
        chooseItem.click();
        return this;
    }
    public OnlineShoppingSteps addToCompare(){
        addtoCompare.click();
        return this;
    }
    public OnlineShoppingSteps GoToItemsList(){
        countCompare.click();
        return this;
    }
    public OnlineShoppingSteps ChooseSecondCategory(){
        chooseSecondCategory.click();
        return this;
    }
    public OnlineShoppingSteps ChooseSecondItem(){
        chooseSecondItem.click();
        return this;
    }
    public OnlineShoppingSteps ChooseAnotherCategory(){
        chooseAnotherCategory.click();
        return this;
    }
    public OnlineShoppingSteps ChooseAnotherItem(){
        chooseAnotherItem.click();
        return this;
    }
    public OnlineShoppingSteps ListOfItems(){
        listOfItemstoCompare.click();
        return this;
    }
    public OnlineShoppingSteps ShowMessage(){
        showMessage.is(Condition.visible);
        return this;
    }
    public OnlineShoppingSteps DeleteItem(){
        deleteItem.click();
        return this;
    }
    public OnlineShoppingSteps SearchItem(){
        searchItem.setValue(Item);
        return this;
    }
    public OnlineShoppingSteps ClickSearchButton(){
        clickSearchButton.click();
        return this;
    }
    public OnlineShoppingSteps SelectItem(){
        selectItem.click();
        return this;
    }
    public OnlineShoppingSteps AddToCart(){
        AddToCart.click();
        return this;
    }
    public OnlineShoppingSteps ClickTheCart(){
        clickToThecart.click();
        return this;
    }
    public OnlineShoppingSteps GoToCart(){
        gotoTheCart.click();
        return this;
    }
    public OnlineShoppingSteps AddRequestedItem(){
        addRequestedItem.click();
        return this;
    }
    public OnlineShoppingSteps IncrementOperator(){
        incrementOperator.click();
        return this;
    }
    public OnlineShoppingSteps DecrementOperator(){
        decrementOperator.click();
        return this;
    }
    public OnlineShoppingSteps RemoveFirstItem(){
        removeFirstItem.click();
        return this;
    }
    public OnlineShoppingSteps RemoveSecondItem(){
        removeSecondItem.click();
        return this;
    }
    public OnlineShoppingSteps ScrollUp(){
        scrollUp.click();
        return this;
    }
    public OnlineShoppingSteps CartEmptyMessage(){
        cartEmptyMessage.is(Condition.visible);
        return this;
    }
    public OnlineShoppingSteps ShowAllCharasteristic(){
        allCharacteristic.click();
        return this;
    }
    public OnlineShoppingSteps DemantPhotoOrVideo(){
        demandPhotoOrVideo.click();
        return this;
    }
    public OnlineShoppingSteps RequestMessage(){
        requestMessage.is(Condition.visible);
        return this;
    }
    public OnlineShoppingSteps SelectVisualOption(){
        photo.click();
        return this;
    }
    public OnlineShoppingSteps SelectContactOption(){
        contactOption.click();
        return this;
    }
    public OnlineShoppingSteps InsertFirstNameAndLastname(){
        firstNameAndlastName.setValue(firstNameandlastName);
        return this;
    }
    public OnlineShoppingSteps InsertMobileNumber(){
        mobileNumber.setValue(OnlineShoppingData.mobileNumber);
        return this;
    }
    public OnlineShoppingSteps SendRequest(){
        sendRequest.click();
        return this;
    }
    public OnlineShoppingSteps WarningMessage(){
        warningMessage.is(Condition.visible);
        return this;
    }
}
