package Steps;

import org.jbehave.core.annotations.*;
import Pages.GooglePage;

public class LogInGoogleStep {

    GooglePage gpage;
    public LogInGoogleStep()
    {
        gpage = new GooglePage();
    }

    @Given("voy a la pagina de gmail.com")
    public void goGmail(){gpage.openGmail();  }

    @When("ingreso mi usuario $usuariogmail")
    public void inUser(@Named("usuariogmail") String us){gpage.enterUser(us);}

    @When("ingreso mi password $passwordgmail")
    public void inPass(@Named("passwordgmail") String pass){gpage.enterPass(pass);}

    @Then("veo un mensaje de error usuario")
    public void valMsgUser(){gpage.watchErrorMsgUser();}

    @Then("veo un mensaje de error password")
    public void valMsgUPass(){gpage.watchErrorMsgPass();}


    @When("doy click en el boton next $band")
    public void clickNext(@Named(("band"))String band){gpage.clickNext(band);}

    @Then("me salgo de la plataforma")
    public void exit(){gpage.exitGmail();}

    @Then("el inbox de gmail es visible")
    public void invboxIsVisible(){gpage.watchMailBox();}

    @AfterStory
    public void exitDriver(){gpage.Exit();}
}
