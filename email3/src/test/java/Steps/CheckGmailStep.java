package Steps;

import org.jbehave.core.annotations.*;
import Pages.CheckGmailPage;


public class CheckGmailStep {

    CheckGmailPage gPage;
    public CheckGmailStep()
    {
         gPage = new CheckGmailPage();
    }

    @Given("voy a la pagina de correos gmail.com")
    public void goGmail(){gPage.openGmail(); }

    @When("entro el usuario $usuariogmail")
    public void inUser(@Named("usuariogmail") String us){gPage.enterUser(us);}

    @When("ingreso mi password in gmail $passwordgmail")
    public void inPass(@Named("passwordgmail") String pass){gPage.enterPass(pass);}

    @Then("valido la informacion del correo $message")
    public void checkEmail(@Named("message")String message){gPage.checkInformation(message);}

    @AfterStory
    public void exitDriver(){gPage.Exit();}

}







