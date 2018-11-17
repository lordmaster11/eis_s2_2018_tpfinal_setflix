Feature: Login feature

  Scenario: Como usuario quiero logearme
    Given Un usuario
    When Ingreso mi usuario "Juan" y mi contraseña "1234"
    Then Me logeo exitosamente

