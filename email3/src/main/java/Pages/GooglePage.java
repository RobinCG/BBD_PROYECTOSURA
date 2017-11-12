package Pages;

import org.apache.http.util.Asserts;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GooglePage  {


    public void openGmail() {

        UtilPage.getInstanSingleUtilPage().openUrl();

    }
    public void enterUser(String us){
        UtilPage.getInstanSingleUtilPage().getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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



    public void watchErrorMsgUser(){
        WebElement msgError = UtilPage.getInstanSingleUtilPage().getDriver().findElement(By.xpath("//div[contains(@class, 'rFrNMe uIZQNc og3oZc sdJrJc Tyc9J k0tWj IYewr')]/div[contains(@class, 'LXRPh')]/div[contains(@class, 'dEOOab RxsGPe')]"));
        Boolean msg;
        if (msgError.isDisplayed()) msg = true;
        else msg = false;
        Asserts.check(msg,"No Error messages");
    }

    public void watchErrorMsgPass(){
        WebElement msgError = UtilPage.getInstanSingleUtilPage().getDriver().findElement(By.xpath("//*[@id='password']/div[2]/div[2]"));
        Boolean msg;
        if (msgError.isDisplayed()) msg = true;
        else msg = false;
        Asserts.check(msg,"No Error messages");
    }

    public void clickNext(String band){

        WebElement btnNex = null;

        UtilPage.getInstanSingleUtilPage().getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if(band.equals("true")){
        btnNex= UtilPage.getInstanSingleUtilPage().getDriver().findElement(By.xpath(".//*[@id='identifierNext']"));

        }
        else{  WebDriverWait btnNextPass = new WebDriverWait(UtilPage.getInstanSingleUtilPage().getDriver(), 3);
             btnNex = btnNextPass.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='passwordNext']")));

        }
        btnNex.click();
  }

      public void exitGmail()
      {
          WebElement imgUser = UtilPage.getInstanSingleUtilPage().getDriver().findElement(By.xpath("//span[contains(@class, 'gb_bb gbii')]"));
          WebElement imgExit = UtilPage.getInstanSingleUtilPage().getDriver().findElement(By.xpath("//a[@id='gb_71']"));
          imgUser.click();
          imgExit.click();
      }

    public void watchMailBox(){
        WebElement btnInbox = UtilPage.getInstanSingleUtilPage().getDriver().findElement(By.className("z0"));
        Boolean btn;
        if (btnInbox.isDisplayed()) btn = true;
        else btn = false;
        Asserts.check(btn,"No visible!!!");
    }

    public void Exit(){
        UtilPage.getInstanSingleUtilPage().exitGmail();
    }

    }

