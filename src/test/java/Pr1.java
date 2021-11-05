import Chrome.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.impl.WebElementSelector;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Asserts;
//import org.junit.Assert;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Pr1 extends ChromeRunner {
 @Test
 public void case1(){
  $(byXpath("//*[@id=\"myAccountDropdown\"]")).click();
  $(byText("Join")).click();
  $(By.id("Email")).setValue("marikankia72@gmail.com").click();
  $(By.id("FirstName")).setValue("Marika").click();
  $(By.id("LastName")).setValue("Kankia").click();
  $(By.id("Password")).setValue("marika1357").click();
  $(By.id("registration-show-me")).click();
  $(By.id("BirthDay")).$(byAttribute("value","24")).click();
  $(By.id("BirthMonth")).$(byAttribute("value","11")).click();
  $(By.id("BirthYear")).$(byAttribute("value","1999")).click();
  $(".tickbox-container",0).click();
  $(byText("Select All")).click();
  $(By.id("clear-all-checkbox-button")).click();
  $(".checkmark",0).waitUntil(Condition.enabled,3000);
  $(".checkmark",0).click();
  $(".checkmark",0).click();
  $(".checkmark",1).click();
  $(".checkmark",1).click();
  $(".checkmark",2).click();
  $(".checkmark",2).click();
  $(".checkmark",3).click();
  $(".checkmark",3).click();
  $(".modal-preference-button-open").click();
  $(".close-asos").click();
  Assert.assertTrue($(By.id("register")).is(Condition.enabled));
  sleep(3000);

 }

 @Test
 public void case2(){
  $(byXpath("//*[@id=\"myAccountDropdown\"]")).click();
  $(byText("Join")).click();
  $(By.id("Email")).setValue("marikakankia").click();
  $(By.id("FirstName")).click();
  Assert.assertTrue($(By.id("Email-error")).is(Condition.visible));
  $(By.id("Email")).setValue("marikakankia72").sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
  $(By.id("Email")).setValue("marikakankia72@").click();
  $(By.id("FirstName")).click();
  Assert.assertTrue($(By.id("Email-error")).is(Condition.visible));
  $(By.id("Email")).setValue("marikakankia72@").sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
  $(By.id("Email")).setValue("marikakankia72@gmail.com").click();
  $(By.id("FirstName")).click();
  Assert.assertFalse($(By.id("Email-error")).is(Condition.visible));
  $(By.id("LastName")).click();
  Assert.assertTrue($(By.id("FirstName-error")).is(Condition.visible));
  $(By.id("Password")).click();
  Assert.assertTrue($(By.id("LastName-error")).is(Condition.visible));
  $(By.id("FirstName")).click();
  Assert.assertTrue($(By.id("Password-error")).is(Condition.visible));
  Assert.assertTrue($(By.id("register")).is(Condition.disabled));

 }
}