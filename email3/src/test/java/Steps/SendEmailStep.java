package Steps; /**
 * Created by equipo on 6/11/2017.
 */

import org.jbehave.core.annotations.*;
import Pages.GmailPage;

public class SendEmailStep  {

    GmailPage gpage ;

     public SendEmailStep() {
         gpage = new GmailPage();
     }

     @Given("me dirijo a la pagina de gmail.com")
     public void goGmail(){gpage.openGmail();  }

     @Given("que estoy en el inbox")
     public void inboxVisible(){gpage.watchMailBox();}

     @When("ingreso mi usuario $usuariogmail")
     public void inUser(@Named("usuariogmail") String us){gpage.enterUser(us);}

     @When("ingreso mi password $passwordgmail")
     public void inPass(@Named("passwordgmail") String pass){gpage.enterPass(pass);}

     @Given("me encuentro logueado en el correo de gmail")
     public void openmail(){gpage.openGmail();}

     @Given("selecciono el boton redactar")
     public void redactar(){gpage.openMailBox();}

     @When("escribo el correo del destinatario $destinatarioemail")
     public void destinatario(@Named("destinatarioemail") String destina){gpage.writeMail(destina);}

     @When("escribo el correo malo $usuariogmail")
     public void destinatario1(@Named("destinatarioemail") String destina){gpage.writeMail(destina);}

     @When("escribo el asunto del correo $subjectemail")
     public void asunto(@Named("subjectemail") String subje){gpage.writeSubject(subje);}

     @When("escribo el cuerpo del correo $bodyemail")
     public void cuerpo(@Named("bodyemail") String body){gpage.writeBody(body);}

     @When("selecciono el boton enviar")
     public void sendMail() {gpage.sendMail();}

     @Then("existe un mensaje de exito")
     public void verMensajeExito(){gpage.msgSuccesfull();}

     @When("doy click al mensaje de exito")
     public void doyClickMensajeExito(){gpage.clickMsgExito();}

     @Then("puedo ver el correo enviado")
     public void mensajeEnviado(){gpage.visualizarEmail() ;}

     @When("existe un mensaje de exito")
     public void verMensajeExit(){gpage.msgSuccesfull();}

     @Then("se presenta un mensaje de error")
     public void verMensajeError(){gpage.verMensajeError();}

     @Then("el inbox es visible")
     public void invboxIsVisible(){gpage.watchMailBox();}

     @Then("doy aceptar al boton")
     public void exitButtonError(){gpage.clickButtonErrror();};

     @Then("se presenta un mensaje de error destinatario")
      public void verMensajError(){gpage.verMensajeErrorDestinatario();}

     @Then("me salgo de la plataforma gmail")
     public void exit(){gpage.exitGmail();}

     @AfterStory
     public void exitGmail(){gpage.Exit();}





}
