package Pages;

/**
 * Created by robin CGarcia on 6/11/2017.
 */


import org.apache.http.util.Asserts;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;


public class GmailPage {

    public void openGmail()  {
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

    public void openMailBox(){
        UtilPage.getInstanSingleUtilPage().getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement btnRedactar = UtilPage.getInstanSingleUtilPage().getDriver().findElement(By.className("z0"));
        btnRedactar.click();
    }

    public void watchMailBox(){
        WebElement btnInbox = UtilPage.getInstanSingleUtilPage().getDriver().findElement(By.className("z0"));
        Boolean btn;
        if (btnInbox.isDisplayed()) btn = true;
        else btn = false;
        Asserts.check(btn,"No visible!!!");
    }

    public void writeMail(String destina){

        WebElement txtMail = UtilPage.getInstanSingleUtilPage().getDriver().findElement(By.className("vO"));
        if(txtMail.isDisplayed()){   txtMail.sendKeys(destina);}
       }

    public void writeSubject(String subje){

        WebElement txtSubject = UtilPage.getInstanSingleUtilPage().getDriver().findElement(By.name("subjectbox"));
        txtSubject.sendKeys(subje);
    }

    public void writeBody(String body){
        WebElement sbody = UtilPage.getInstanSingleUtilPage().getDriver().findElement(By.className("editable"));
        sbody.sendKeys(body);
    }

    public void sendMail(){
        WebElement btnSend = UtilPage.getInstanSingleUtilPage().getDriver().findElement(By.className("aoO"));
        btnSend.click();
    }

    public void msgSuccesfull(){
        WebElement msg = UtilPage.getInstanSingleUtilPage().getDriver().findElement(By.xpath("//span[@id='link_vsm']"));
        String response = msg.getText();
        Boolean bres;

        if(response.contains("Ver el mensaje")) bres = true;
        else bres =false;
        Asserts.check(bres,"No successfull!!!" + msg);
    }

    public void clickMsgExito(){
        WebElement msgExito = UtilPage.getInstanSingleUtilPage().getDriver().findElement(By.xpath("//span[@id='link_vsm']"));
        msgExito.click();
    }

    public void visualizarEmail(){
        WebElement emailSend = UtilPage.getInstanSingleUtilPage().getDriver().findElement(By.xpath("//div[contains(@class,'gE iv gt')]"));
        Boolean mRsp ;
        mRsp = emailSend.isDisplayed();
        Asserts.check(mRsp,"No email Send");
    }

    public void verMensajeError(){
            WebElement msgError = UtilPage.getInstanSingleUtilPage().getDriver().findElement(By.className("Kj-JD"));
            Boolean mRsp;
            mRsp = msgError.isDisplayed();
            Asserts.check(mRsp, "No Error messages");
    }

    public void clickButtonErrror(){
        WebElement btnError = UtilPage.getInstanSingleUtilPage().getDriver().findElement(By.xpath("//button[contains(@class, 'J-at1-auR')]"));
        btnError.click();

    }

    public void verMensajeErrorDestinatario(){

        WebElement msgError = UtilPage.getInstanSingleUtilPage().getDriver().findElement(By.xpath("//div[contains(@class, 'Kj-JD-Jz')]"));
        Boolean mRep;
        mRep = msgError.isDisplayed();
        Asserts.check(mRep,"No Error messages");
    }

    public void exitGmail()
    {
        WebElement imgUser = UtilPage.getInstanSingleUtilPage().getDriver().findElement(By.xpath("//span[contains(@class, 'gb_bb gbii')]"));
        WebElement imgExit = UtilPage.getInstanSingleUtilPage().getDriver().findElement(By.xpath("//a[@id='gb_71']"));
        imgUser.click();
        imgExit.click();
    }

    public void changeCountGmail(){
        WebElement imgUser = UtilPage.getInstanSingleUtilPage().getDriver().findElement(By.xpath("//span[contains(@class, 'gb_bb gbii')]"));
        WebElement arrow = UtilPage.getInstanSingleUtilPage().getDriver().findElement((By.xpath(("//a[contains(@class, 'gb_Fa gb_Kf gb_Be gb_Eb')]"))));
        imgUser.click();
        arrow.click();
    }

    public void Exit(){
        UtilPage.getInstanSingleUtilPage().exitGmail();
    }
}
