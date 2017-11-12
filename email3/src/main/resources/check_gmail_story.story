Meta:
Ingreso a la plataforma

Narrative:
Yo como usuario, necesito ingresar a la plataforma de correos de google para
verificar los correos recibidos


Scenario: Ingreso al correo de gmail. Revisar correo enviado CP001

Given voy a la pagina de correos gmail.com
When entro el usuario <usuariogmail>
And ingreso mi password in gmail <passwordgmail>
Then valido la infor|macion del correo <message>

Examples:
|usuariogmail|passwordgmail|message|
|suramydream2@gmail.com|suramydream|Prueba sura. Analista de calidad - Contenido del correo para pruebas con sura.|