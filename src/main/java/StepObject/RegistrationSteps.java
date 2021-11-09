package StepObject;

import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class RegistrationSteps extends RegistrationPage {
    public RegistrationSteps CreateAccount(){
        createAccount.click();
        return this;
    }
    public RegistrationSteps join(){
        joinAccount.click();
        return this;
    }
    public RegistrationSteps email(String Email){
        email.setValue(Email);
        email.shouldNotBe(Condition.empty);
        return this;
    }
    public RegistrationSteps firstName(String FirstName){
        firstName.setValue(FirstName);
        firstName.shouldNotBe(Condition.empty);
        return this;
    }
    public RegistrationSteps lastName(String LastName){
        lastName.setValue(LastName);
        lastName.shouldNotBe(Condition.empty);
        return this;
    }
    public RegistrationSteps password(String Password){
        password.setValue(Password);
        password.shouldNotBe(Condition.empty);
        return this;
    }
    public RegistrationSteps birthDay(){
        birthDay.click();
        return this;
    }
    public RegistrationSteps birthMonth(){
        birthMonth.click();
        return this;
    }
    public RegistrationSteps birthYear(){
        birthYear.click();
        return this;
    }
    public RegistrationSteps EmptyBirthYear(){
        emptybirthYear.click();
        return  this;
    }
    public RegistrationSteps SelectGender(){
        male.click();
        return this;
    }
    public RegistrationSteps SelectAllCheckBox(){
        checkBox.click();
        return this;
    }
    public RegistrationSteps DeleteCheckBox(){
        deletecheckBox.click();
        return this;
    }
    public RegistrationSteps CheckMark0(){
        checkMark0.click();
        return this;
    }
    public RegistrationSteps CheckMark1(){
        checkMark1.click();
        return this;
    }
    public RegistrationSteps CheckMark2(){
        checkMark2.click();
        return this;
    }
    public RegistrationSteps CheckMark3(){
        checkMark3.click();
        return this;
    }
    public RegistrationSteps ModalButton(){
        modalButton.click();
        return this;
    }
    public RegistrationSteps CloseButton(){
        closeButton.click();
        return this;
    }
    public RegistrationSteps EnabledButton(){
        enabledButton.is(Condition.enabled);
        return this;
    }
    public RegistrationSteps DisabledButton(){
        disabledButton.is(Condition.disabled);
        return this;
    }
    public RegistrationSteps EmailError(){
        Assert.assertTrue(emailError.is(Condition.visible));
        return this;
    }
    public RegistrationSteps FirstNameError(){
        Assert.assertTrue(firstNameError.is(Condition.visible));
        return this;
    }
    public RegistrationSteps LastNameError(){
        Assert.assertTrue(lastNameError.is(Condition.visible));
        return this;
    }
    public RegistrationSteps BirthDayError(){
        Assert.assertTrue(birthdayError.is(Condition.visible));
        return this;
    }
    public RegistrationSteps PasswordError(){
        Assert.assertTrue(passwordError.is(Condition.visible));
        return this;
    }
    public RegistrationSteps EmailSendKeys(){
        email.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        return this;
    }
    public RegistrationSteps FirstnameSendKeys(){
        firstName.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        return this;
    }
    public RegistrationSteps LastNameSendkKeys(){
        lastName.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        return this;
    }
    public RegistrationSteps PasswordSendKeys(){
        password.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        return this;
    }
}
