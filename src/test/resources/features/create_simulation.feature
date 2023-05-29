#Autor:Anderson
  #languege:es

Feature: obtener actividades de un grupo
  Como usuario, quiero ver las activiades de un grupo

  Scenario: visualizar en el back las actividades de un grupo por su ID
    Given dado que estoy en la home
    When navego en busca de opciones
    And ingreso la informacion requerida
    Then me muestra la informacion