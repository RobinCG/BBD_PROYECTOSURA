Meta:
Ingreso a la plataforma

Narrative:
Yo como usuario, necesito ingresar a la plataforma de correos de google


Scenario: Ingreso al correo de gmail validando mensaje de error solicitand usuario. CP002
Given voy a la pagina de gmail.com
When doy click en el boton next <band>
Then veo un mensaje de error usuario

Examples:
|band|
|true|

Scenario: Ingreso al correo de gmail validando mensaje de error solicitand password. CP003
Given voy a la pagina de gmail.com
When ingreso mi usuario <usuariogmail>
And doy click en el boton next <band>
Then veo un mensaje de error password

Examples:
|usuariogmail|band|
|suramydream1@gmail.com|false|


Scenario: Ingreso al correo de gmail. Camino exitoso CP001
Given voy a la pagina de gmail.com
When ingreso mi usuario <usuariogmail>
And ingreso mi password <passwordgmail>
Then el inbox de gmail es visible
And me salgo de la plataforma

Examples:
|usuariogmail|passwordgmail|
|suramydream1@gmail.com|suramydream|

