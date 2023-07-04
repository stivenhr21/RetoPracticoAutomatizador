#autor: Stiven Hernandez
#language: es
#date: 3/07/2023

Característica: Inicio de sesión
  Yo como usuario del sitio web
  Quiero iniciar sesión
  Para transaccionar dentro del sitio

  @InicioSesionExitoso
  Esquema del escenario: Iniciar sesion exitosamente
    Dado que el usuario se encuentra en la pagina de inicio de sesion
    Cuando ingresa las credencioales de acceso
      | usuario   | clave   |
      | <usuario> | <clave> |
    Entonces el usuario se visualizara logueado en el sitio web
    Ejemplos:
      | usuario | clave                                            |
      | 638435  | 10df2f32286b7120MS00LTUzNDgzNg==30e0c83e6c29f1c3 |