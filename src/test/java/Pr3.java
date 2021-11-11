import Chrome.ChromeRunner3;
import StepObject.OnlineShoppingSteps;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;
import static DataObject.OnlineShoppingData.*;
public class Pr3 extends ChromeRunner3 {
    @Test
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
                .ListOfItems()
                .ShowMessage()
                .ChooseAnotherCategory()
                .ChooseAnotherItem()
                .addToCompare()
                .ListOfItems()
                .DeleteItem();
    }
    @Test
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
    @Test
    public void case7(){
        OnlineShoppingSteps steps=new OnlineShoppingSteps();
        steps
                .ChooseCategory()
                .ChooseItem()
                .ShowAllCharasteristic()
                .ScrollUp()
                .DemantPhotoOrVideo()
                .RequestMessage()
                .SelectVisualOption()
                .SelectContactOption()
                .InsertFirstNameAndLastname()
                .InsertMobileNumber()
                .SendRequest()
                .WarningMessage();
    }

}
//        $(".nav__link",7).click();
//        $(".products__item-wrap",3).click();
//        $(".js-compare-item").click();
//        $(".js-compare-count",0).click();
//        $(".nav__link",5).click();
//        $(".products__item-wrap",0).click();
//        $(".js-compare-item").click();
//        $(".icon-compare",0).click();
//        $(".js-compare").click();
//        $(".top-bar__left").shouldBe(Condition.visible);
//        $(byText("დაამატე პროდუქტები იგივე კატეგორიაში შესადარებლად")).shouldBe(Condition.visible);
//        $(".nav__link",2).click();
//        $(".products__item-wrap",2).click();
//        $(".js-compare-item").click();
//        $(".js-compare").click();
//        $(".js-compare-item-delete",0).click();
//
//    }
//    @Test
//    public void case6(){
//        $(By.id("title-search-input")).setValue("ბროში");
//        $(byName("s")).click();
//        $(".products__item",1).click();
//        $(".product__buy",1).click();
//        $(".js-cart").click();
//        $(byText("კალათაში გადასვლა")).click();
//        $(byName("add")).click();
//        $(".inc-text",0).waitUntil(Condition.visible,4000);
//        $(".inc-text",0).click();
//        $(".dec",0).click();
//        $(".cart__item-remove",0).click();
//        $(".cart__item-remove",1).click();
//         sleep(3000);
//    }
//    @Test
//    public void case7(){
//        $(".nav__link",7).click();
//        $(".products__item-wrap",1).click();
//        $(".product__features-list-item").click();
//        $(".buttonScrollTop").click();
//        $(".request-video-foto-link").waitUntil(Condition.visible,4000);
//        $(".request-video-foto-link").click();
//        Assert.assertTrue($(byText("მსურს რეალური ფოტო/ვიდეო")).is(Condition.visible));
//        $(".jq-radio__div",3).click();
//        $(".jq-radio__div",5).click();
//        $(".field-input",2).setValue("Marika Kankia");
//        $(".input-phone",1).setValue("598459815");
//        $(By.id("btn-requestphotovideo")).click();
//        Assert.assertFalse($(byText("ყველა ველი აუცილებელია")).is(Condition.visible));
//
//    }
//
//}
