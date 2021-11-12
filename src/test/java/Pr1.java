import Utils.ChromeRunner;
import StepObject.RegistrationSteps;
//import org.apache.hc.core5.util.Asserts;
//import org.junit.Assert;
//import org.junit.Test;
import com.sun.net.httpserver.Authenticator;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static DataObject.RegistrationData.*;

@Listeners(Utils.TestLister.class)
public class Pr1 extends ChromeRunner {
 @Test(retryAnalyzer = Authenticator.Retry.class,priority = 0)
 @Severity(SeverityLevel.CRITICAL)
 @Description("Registration cases")
 public void case_1() {
  RegistrationSteps steps = new RegistrationSteps();
  steps
          .CreateAccount()
          .join()
          .email(emailAddress)
          .firstName(firstName)
          .lastName(lastName)
          .password(password)
          .birthDay()
          .birthMonth()
          .birthYear()
          .SelectGender()
          .SelectAllCheckBox()
          .DeleteCheckBox()
          .CheckMark1()
          .ModalButton()
          .CloseButton()
          .EnabledButton();





//  $(byXpath("//*[@id=\"myAccountDropdown\"]")).click();
//  $(byText("Join")).click();
//  $(By.id("Email")).setValue("marikankia72@gmail.com").click();
//  $(By.id("FirstName")).setValue("Marika").click();
//  $(By.id("LastName")).setValue("Kankia").click();
//  $(By.id("Password")).setValue("marika1357").click();
//  $(By.id("registration-show-me")).click();
//  $(By.id("BirthDay")).$(byAttribute("value","24")).click();
//  $(By.id("BirthMonth")).$(byAttribute("value","11")).click();
//  $(By.id("BirthYear")).$(byAttribute("value","1999")).click();
//  $(".tickbox-container",0).click();
//  $(byText("Select All")).click();
//  $(By.id("clear-all-checkbox-button")).click();
//  $(".checkmark",0).waitUntil(Condition.enabled,3000);
//  $(".checkmark",0).click();
//  $(".checkmark",0).click();
//  $(".checkmark",1).click();
//  $(".checkmark",1).click();
//  $(".checkmark",2).click();
//  $(".checkmark",2).click();
//  $(".checkmark",3).click();
//  $(".checkmark",3).click();
//  $(".modal-preference-button-open").click();
//  $(".close-asos").click();
//  Assert.assertTrue($(By.id("register")).is(Condition.enabled));
//  sleep(3000);

 }

 @Test(retryAnalyzer = Authenticator.Retry.class,priority = 1)
 @Severity(SeverityLevel.CRITICAL)
 @Description("Registration cases")
 public void case2(){
  RegistrationSteps steps=new RegistrationSteps();
  steps
//          .CreateAccount()
//          .join()
          .EmailSendKeys()
          .FirstnameSendKeys()
          .LastNameSendkKeys()
          .PasswordSendKeys()
          .email("marikakankia")
          .firstName("marika")
          .EmailError()
          .EmailSendKeys()
          .email("marikakankia72")
          .EmailError()
          .EmailSendKeys()
          .email("marikakankia72@")
          .EmailError()
          .email("marikakankia72@gmail.com")
          .FirstnameSendKeys()
          .FirstNameError()
          .lastName("kankia")
          .LastNameSendkKeys()
          .password("marik")
          .LastNameError()
          .DisabledButton()
          .birthDay()
          .PasswordError()
          .birthMonth()
          .EmptyBirthYear()
          .BirthDayError();






//  $(byXpath("//*[@id=\"myAccountDropdown\"]")).click();
//  $(byText("Join")).click();
//  $(By.id("Email")).setValue("marikakankia").click();
//  $(By.id("FirstName")).click();
//  Assert.assertTrue($(By.id("Email-error")).is(Condition.visible));
//  $(By.id("Email")).setValue("marikakankia72").sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
//  $(By.id("Email")).setValue("marikakankia72@").click();
//  $(By.id("FirstName")).click();
//  Assert.assertTrue($(By.id("Email-error")).is(Condition.visible));
//  $(By.id("Email")).setValue("marikakankia72@").sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
//  $(By.id("Email")).setValue("marikakankia72@gmail.com").click();
//  $(By.id("FirstName")).click();
//  Assert.assertFalse($(By.id("Email-error")).is(Condition.visible));
//  $(By.id("LastName")).click();
//  Assert.assertTrue($(By.id("FirstName-error")).is(Condition.visible));
//  $(By.id("Password")).click();
//  Assert.assertTrue($(By.id("LastName-error")).is(Condition.visible));
//  $(By.id("FirstName")).click();
//  Assert.assertTrue($(By.id("Password-error")).is(Condition.visible));
//  Assert.assertTrue($(By.id("register")).is(Condition.disabled));

 }
}
