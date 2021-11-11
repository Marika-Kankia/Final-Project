package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class OnlineShoppingPage {
    protected SelenideElement
        chooseCategory=$(".nav__link",7),
        chooseItem=$(".products__item-wrap",3),
        addtoCompare=$(".js-compare-item"),
        countCompare=$(".js-compare-count",0),
        chooseSecondCategory=$(".nav__link",5),
        chooseSecondItem=$(".products__item-wrap",0),
        listOfItemstoCompare=$(".js-compare"),
        showMessage=$(byText("დაამატე პროდუქტები იგივე კატეგორიაში შესადარებლად")),
        compareitemssection=$(byText("პროდუქტების შედარება")),
        chooseAnotherCategory=$(".nav__link",2),
        chooseAnotherItem=$(".products__item-wrap",2),
        deleteItem=$(".js-compare-item-delete",0),
        searchItem=$(By.id("title-search-input")),
        clickSearchButton=$(byName("s")),
        selectItem=$(".products__item",1),
        AddToCart=$(".product__buy",1),
        clickToThecart=$(".js-cart"),
        gotoTheCart=$(byText("კალათაში გადასვლა")),
        addOfferedItem=$(byName("add")),
        incrementOperator=$(".inc-text",0),
        decrementOperator=$(".dec",0),
        removeFirstItem=$(".cart__item-remove",0),
        removeSecondItem=$(".cart__item-remove",1),
        scrollUp=$(".buttonScrollTop"),
        cartEmptyMessage=$(".cart-empty__message"),
        allCharacteristic=$(".product__features-list-item"),
        demandPhotoOrVideo=$(".request-video-foto-link"),
        requestMessage=$(byText("მსურს რეალური ფოტო/ვიდეო")),
        photo=$(".jq-radio__div",3),
        contactOption=$(".jq-radio__div",5),
        firstNameAndlastName=$(".field-input",2),
        mobileNumber=$(".input-phone",1),
        sendRequest=$(By.id("btn-requestphotovideo")),
        warningMessage=$(byText("ყველა ველი აუცილებელია"));
}
