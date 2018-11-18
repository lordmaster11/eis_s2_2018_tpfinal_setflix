Feature: Login feature

  Scenario: Como usuario quiero logearme
    Given Un usuario
    When Ingreso mi usuario "Juan" y mi contraseña "1234"
    Then Me logeo exitosamente

  Scenario: Como usuario quiero logearme
    Given Un usuario
    When Ingreso mal mi usuario "Jaun" y mi contraseña "1234"
    Then El usuario no pudo logearse

  Scenario: Como usuario nuevo quiero registrarme en la aplicacion
    Given Un usuario nuevo
    When Ingreso mi usuario "Quique", mi contraseña "1234", mi nombre "Esteban" y mi apellido "Quito"
    Then Me registro exitosamente

  Scenario: Como usuario nuevo no pudo registrarme en la aplicacion
    Given Otro usuario nuevo
    When Mi usuario "Marce", mi contraseña "5678", mi nombre "Marcelo" y mi apellido "Ruiz"
    Then El usuario no pudo registrarse