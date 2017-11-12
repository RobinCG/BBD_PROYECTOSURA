package Pages;


import org.apache.http.util.Asserts;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class CheckGmailPage {

    public void openGmail(){
        UtilPage.getInstanSingleUtilPage().openUrl();
    }

    public void enterUser(String us){
        WebElement txtUser1 = UtilPage.getInstanSingleUtilPage().getDriver().findElement(By.xpath(".//*[@id='identifierId']"));
        WebElement btnNext = UtilPage.getInstanSingleUtilPage().getDriver().findElement(By.xpath(".//*[@id='identifierNext']"));
        txtUser1.sendKeys(us);
        btnNext.click();
    }

    public void enterPass(String pass){
        UtilPage.getInstanSingleUtilPage().getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement txtPassword = UtilPage.getInstanSingleUtilPage().getDriver().findElement(By.name("password"));
        WebElement btnNextPassword = UtilPage.getInstanSingleUtilPage().getDriver().findElement(By.xpath("//*[@id='passwordNext']"));
        txtPassword.sendKeys(pass);
        btnNextPassword.click();
    }

    public void checkInformation(String msg){
        String msgText = UtilPage.getInstanSingleUtilPage().getDriver().findElement((By.xpath("//div[contains(@class, 'y6')]"))).getText();
        Boolean msRsta;
        if(msg.contains(msgText))msRsta = true;
        else msRsta = false;
        Asserts.check(msRsta,"No email receive");
    }

    public void Exit(){
        UtilPage.getInstanSingleUtilPage().exitGmail();
    }
}
