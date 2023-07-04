#autor: Stiven Hernandez
#language: es
#date: 3/07/2023

Característica: Diligenciar formularios
  Yo como usuario del sitio web
  Quiero diligenciar los formularios
  Para completar el flujo completo del sitio web

  @DiligenciarFormulariosExitosamente
  Esquema del escenario: diligenciar formularios exitosamente
    Dado que el usuario se encuentra en la pagina de inicio de sesion
    Cuando ingresa las credencioales de acceso
      | usuario   | clave   |
      | <usuario> | <clave> |
    Y diligencia todos los formularios
      | fecha1   | fecha2   | fecha3   | fecha4   | fecha5   | fecha6   | fecha7   | fecha8   | fecha9   | fecha10   | radio1   | radio2   | radio3   | radio4   | radio5   | radio6   | radio7   | radio8   | radio9   | radio10   |
      | <fecha1> | <fecha2> | <fecha3> | <fecha4> | <fecha5> | <fecha6> | <fecha7> | <fecha8> | <fecha9> | <fecha10> | <radio1> | <radio2> | <radio3> | <radio4> | <radio5> | <radio6> | <radio7> | <radio8> | <radio9> | <radio10> |
    Entonces el usuario visualizara hash de exito
    Ejemplos:
      | usuario | clave                                            | fecha1   | fecha2   | fecha3   | fecha4   | fecha5   | fecha6   | fecha7   | fecha8   | fecha9   | fecha10  | radio1 | radio2  | radio3     | radio4 | radio5   | radio6  | radio7 | radio8 | radio9   | radio10 |
      | 638435  | 10df2f32286b7120MS00LTUzNDgzNg==30e0c83e6c29f1c3 | 11042023 | 19032023 | 10052023 | 13052023 | 28072023 | 26072023 | 24092023 | 08102023 | 28082023 | 05042023 | 10601  | -127856 | -328905029 | -22850 | -2406281 | 1014768 | 183    | -21615 | -5060267 | 406644  |