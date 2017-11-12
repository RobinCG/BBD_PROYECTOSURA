Meta:
Validación de envio de correo.

Narrative:
Yo como usuario de Gmail,
necesito verificar que se envió  un mensaje a través de esta plataforma,
para garantizar el envío exitoso del correo

Scenario: Me logueo al correo de gmail  CP001

Given me dirijo a la pagina de gmail.com
When ingreso mi usuario <usuariogmail>
And ingreso mi password <passwordgmail>
Then el inbox es visible

Examples:
|usuariogmail|passwordgmail|
|suramydream1@gmail.com|suramydream|


Scenario:  verifico el envío exitoso del correo a través de gmail CP002

Given selecciono el boton redactar
When escribo el correo del destinatario <destinatarioemail>
And escribo el asunto del correo <subjectemail>
And escribo el cuerpo del correo <bodyemail>
And selecciono el boton enviar
Then existe un mensaje de exito

Examples:
|destinatarioemail|subjectemail|bodyemail|
|suramydream2@gmail.com|Prueba sura. Analista de calidad|Contenido del correo para pruebas con sura.|




Scenario: abrir el mensaje enviado, sin desloguearse de la plataforma CP003

Given que estoy en el inbox
When existe un mensaje de exito
And doy click al mensaje de exito
Then puedo ver el correo enviado




Scenario: Validar existencia de destinatario CP004
Given selecciono el boton redactar
When escribo el asunto del correo <subjectemail>
And escribo el cuerpo del correo <bodyemail>
And selecciono el boton enviar
Then se presenta un mensaje de error
And doy aceptar al boton



Examples:
|subjectemail|bodyemail|
|Prueba sura. Analista de calidad|Contenido del correo para pruebas con sura.|



